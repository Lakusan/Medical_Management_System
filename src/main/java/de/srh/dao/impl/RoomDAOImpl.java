package de.srh.dao.impl;


import de.srh.config.DBManager;
import de.srh.dao.DAO;
import de.srh.model.Room;
import de.srh.model.User;
import de.srh.service.PasswordService;
import de.srh.service.ValidationService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object Implementation for Rooms
 * @author Andreas Lakus
 */

public class RoomDAOImpl implements DAO<Room> {

    @Override
    public Room get(int id) throws SQLException {
        Connection connection = DBManager.getConnection();
        Room room = null;

        String sql = "SELECT " +
                "room_id," +
                "room_type," +
                "room_num," +
                "bed_count, " +
                "responsible_nurse," +
                "is_locked," +
                "bed_number," +
                "is_available," +
                "maintanance " +
                "FROM rooms " +
                "WHERE room_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);

        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int rid = resultSet.getInt("room_id");
                String roomType = resultSet.getString("room_type");
                int roomNum = resultSet.getInt("room_num");
                int bedCount = resultSet.getInt("bed_count");
                String responsibleNurse = resultSet.getString("responsible_nurse");

                boolean isLocked = false;
                if (resultSet.getInt("is_locked") == 1){
                    isLocked = true;
                } else if (resultSet.getInt("is_locked") == 0){
                    isLocked = false;
                }

                int bedNumber = resultSet.getInt("bed_number");

                boolean isAvailable = false;
                if (resultSet.getInt("is_available") == 1){
                    isAvailable = true;
                } else if (resultSet.getInt("is_available") == 0){
                    isAvailable = false;
                }

                boolean maintanance = false;
                if (resultSet.getInt("maintanance") == 1){
                    isAvailable = true;
                } else if (resultSet.getInt("maintanance") == 0){
                    isAvailable = false;
                }

                room = new Room(rid, roomType,roomNum, bedCount, responsibleNurse, isLocked, bedNumber, isAvailable, maintanance );
                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return room;
    }
    @Override
    public List<Room> getAll() throws SQLException {
        Connection connection = DBManager.getConnection();

        List<Room> rooms = new ArrayList<>();

        String sql = "SELECT * FROM rooms";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int rid = resultSet.getInt("room_id");
                String roomType = resultSet.getString("room_type");
                int roomNum = resultSet.getInt("room_num");
                int bedCount = resultSet.getInt("bed_count");
                String responsibleNurse = resultSet.getString("responsible_nurse");

                boolean isLocked = false;
                if (resultSet.getInt("is_locked") == 1){
                    isLocked = true;
                } else if (resultSet.getInt("is_locked") == 0){
                    isLocked = false;
                }

                int bedNumber = resultSet.getInt("bed_number");

                boolean isAvailable = false;
                if (resultSet.getInt("is_available") == 1){
                    isAvailable = true;
                } else if (resultSet.getInt("is_available") == 0){
                    isAvailable = false;
                }


                boolean maintanance = false;
                if (resultSet.getInt("maintanance") == 1){
                    isAvailable = true;
                } else if (resultSet.getInt("maintanance") == 0){
                    isAvailable = false;
                }

                Room room = new Room(rid, roomType,roomNum, bedCount, responsibleNurse, isLocked, bedNumber, isAvailable, maintanance );
                rooms.add(room);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return rooms;
    }

    @Override
    public int save(Room room) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Room room) throws SQLException {
        Connection connection = DBManager.getConnection();

        String sql = "INSERT INTO rooms (" +
                "room_type," +
                "room_num," +
                "bed_count, " +
                "responsible_nurse," +
                "is_locked," +
                "bed_number," +
                "is_available," +
                "maintanance) " +
                "VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);


        preparedStatement.setString(1, room.getRoomType());
        preparedStatement.setInt(2, room.getRoomNumber());
        preparedStatement.setInt(3, room.getBedCount());
        preparedStatement.setString(4, room.getResponsibleNurse());
        if (room.isLocked()){
            preparedStatement.setInt(5, 1);
        } else if (!room.isLocked()){
            preparedStatement.setInt(5, 0);
        }
        preparedStatement.setInt(6, room.getBedNumber());
        if (room.isAvailable()){
            preparedStatement.setInt(7, 1);
        } else if (!room.isAvailable()){
            preparedStatement.setInt(7, 0);
        }
        if (room.isMaintanance()){
            preparedStatement.setInt(8, 1);
        } else if (!room.isMaintanance()){
            preparedStatement.setInt(8, 0);
        }
        int result = -1;
        try{
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());

        }

        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);

        return result;
    }

    @Override
    public int update(Room room) throws SQLException {
        Connection connection = DBManager.getConnection();

        String sql = "UPDATE rooms set room_type = ?, room_num = ?, bed_count = ?, bed_count = ?, responsible_nurse = ?, bed_number = ?, is_available = ?, maintanance = ? WHERE room_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, room.getRoomType());
        preparedStatement.setInt(2, room.getRoomNumber());
        preparedStatement.setInt(3, room.getBedCount());
        preparedStatement.setString(4, room.getResponsibleNurse());
        if (room.isLocked()){
            preparedStatement.setInt(5, 1);
        } else if (!room.isLocked()){
            preparedStatement.setInt(5, 0);
        }
        preparedStatement.setInt(6, room.getBedNumber());
        if (room.isAvailable()){
            preparedStatement.setInt(7, 1);
        } else if (!room.isAvailable()){
            preparedStatement.setInt(7, 0);
        }
        if (room.isMaintanance()){
            preparedStatement.setInt(8, 1);
        } else if (!room.isMaintanance()){
            preparedStatement.setInt(8, 0);
        }

        int result = -1;
        try{
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());

        }

        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);

        return result;
    }

    @Override
    public int delete(Room room) throws SQLException {
        Connection connection = DBManager.getConnection();

        String sql = "DELETE FROM rooms WHERE room_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, room.getId());
        int result = -1;
        try {
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return result;
    }
    public int changeRoom(Room room) throws SQLException{
        Connection connection = DBManager.getConnection();

        String sql = "UPDATE rooms set room_type = ?, room_num = ?, bed_count = ?,  responsible_nurse = ?, bed_number = ?, is_available = ?, maintanance = ? WHERE room_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, room.getRoomType());
        preparedStatement.setInt(2, room.getRoomNumber());
        preparedStatement.setInt(3, room.getBedCount());
        preparedStatement.setString(4, room.getResponsibleNurse());
        preparedStatement.setInt(5, room.getBedNumber());
        if (room.isAvailable()){
            preparedStatement.setInt(6, 1);
        } else if (!room.isAvailable()){
            preparedStatement.setInt(6, 0);
        }
        if (room.isMaintanance()){
            preparedStatement.setInt(7, 1);
        } else if (!room.isMaintanance()){
            preparedStatement.setInt(7, 0);
        }
        preparedStatement.setInt(8, room.getId());
        int result = -1;
        try{
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());

        }

        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);

        return result;


    }
}
