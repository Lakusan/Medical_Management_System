package de.srh.dao.impl;


import de.srh.config.DBManager;
import de.srh.dao.DAO;
import de.srh.model.User;
import de.srh.service.PasswordService;
import de.srh.service.ValidationService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object Implementation for Users
 * @author Andreas Lakus
 */

public class UserDAOImpl implements DAO<User> {
    @Override
    public User get(int id) throws SQLException {
        Connection connection = DBManager.getConnection();
        User user = null;

        String sql = "SELECT user_id, firstname, lastname, email, password, username, phone_num, title FROM users WHERE user_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);

        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int oid = resultSet.getInt("user_id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String username = resultSet.getString("username");
                String phoneNum = resultSet.getString("phone_num");
                String title = resultSet.getString("title");
                user = new User(oid, username, firstName, lastName, email, password, phoneNum, title );
                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return user;
    }

    // lists all entities
    @Override
    public List<User> getAll() throws SQLException {
        Connection connection = DBManager.getConnection();

        List<User> users = new ArrayList<>();

        String sql = "SELECT * FROM users";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("user_id");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String username = resultSet.getString("username");
                String phoneNum = resultSet.getString("phone_num");
                String title = resultSet.getString("title");
                User user = new User( id,  firstname,  lastname,  email,  password, username, phoneNum, title );

                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return users;
    }

/**    "Save 'saves' an entity to the database: depending on the existence of the key
    property, it will be inserted (key is null) or updated (key is not null).
    This is similar to insertOrReplace, but may be more efficient, because if
   a key is present, it does not have to query if that key already exists."**/
    @Override
    public int save(User user) {
        return 0;
    }

    // insert entity into table and assumes that the key doesn't exist. Otherwise, throws exception
    @Override
    public int insert(User user) throws SQLException {
        Connection connection = DBManager.getConnection();

        // validate Password
        ValidationService validationService = new ValidationService();
        validationService.validatePassword(user.getPassword());

        // hash password
        PasswordService passwordService = new PasswordService();
        String hashedPassword = passwordService.hashPassword(user.getPassword());

        String sql = "INSERT INTO users (firstname, lastname, email, password, username, phone_num, title) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);


        preparedStatement.setString(1, user.getFirstname());
        preparedStatement.setString(2, user.getLastname());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, hashedPassword);
        preparedStatement.setString(5, user.getUsername());
        preparedStatement.setString(6, user.getPhoneNum());
        preparedStatement.setString(7, user.getTitle());
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

    // updates entity which exists by key
    @Override
    public int update(User user) throws SQLException{
        Connection connection = DBManager.getConnection();
        // validate Password
        ValidationService validationService = new ValidationService();
        validationService.validatePassword(user.getPassword());

        // hash password
        PasswordService passwordService = new PasswordService();
        String hashedPassword = passwordService.hashPassword(user.getPassword());

        String sql = "UPDATE users set firstname = ?, lastname = ?, email = ?, password =? , username =? , phone_num =? , title =? WHERE user_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, user.getFirstname());
        preparedStatement.setString(2, user.getLastname());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, hashedPassword);
        preparedStatement.setString(5, user.getUsername());
        preparedStatement.setInt(6, user.getId());
        preparedStatement.setString(7, user.getPhoneNum());
        preparedStatement.setString(8, user.getTitle());

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

    // deletes entity by id
    @Override
    public int delete(User user) throws SQLException {
        Connection connection = DBManager.getConnection();

        String sql = "DELETE FROM users WHERE user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, user.getId());
        int result = -1;
        try {
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return result;
    }

    public User findUserByEMail(String eMail) throws SQLException{
        Connection connection = DBManager.getConnection();
        User user = null;

        String sql = "SELECT user_id, firstname, lastname, email, password, username, phone_num, title  FROM users WHERE email = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, eMail);

        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int oid = resultSet.getInt("user_id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String username = resultSet.getString("username");
                String phoneNum = resultSet.getString("phone_num");
                String title = resultSet.getString("title");

                user = new User(oid, username, firstName, lastName, email, password, phoneNum, title);
                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return user;
    }

    public User findUserByUserName(String username) throws SQLException {
        Connection connection = DBManager.getConnection();
        User user = null;

        String sql = "SELECT user_id, firstname, lastname, email, password, username, phone_num, title FROM users WHERE username = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);

        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int oid = resultSet.getInt("user_id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String userName = resultSet.getString("username");
                String phoneNum = resultSet.getString("phone_num");
                String title = resultSet.getString("title");

                user = new User(oid, userName, firstName ,lastName ,email , password, phoneNum, title);
                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return user;
    }

    public List<User> getNotValidatedUsers() throws SQLException{
        Connection connection = DBManager.getConnection();
        List<User> foundUsers = new ArrayList<>();

        String sql = "SELECT user_id, firstname, lastname, email, username, is_activated FROM users WHERE is_activated = 0";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                int oid = resultSet.getInt("user_id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String userName = resultSet.getString("username");
                int isActivated = resultSet.getInt("is_activated");

                User user = new User(oid, userName, firstName, lastName, email, isActivated);

                foundUsers.add(user);
            }
            DBManager.closeResultSet(resultSet);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return foundUsers;
    }

    public void validateUsers(User user) throws SQLException{
        Connection connection = DBManager.getConnection();

        String sql = "UPDATE users set is_activated = 1 WHERE user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, user.getId());
        int result = -1;
        try {
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public String getUserRole(int id) throws SQLException{
        Connection connection = DBManager.getConnection();

        String sql = "SELECT rolename FROM users INNER JOIN roles ON users.roles_role_id = roles.role_id WHERE users.user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        String roleName = null;
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                roleName = resultSet.getString("rolename");
                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);

        return roleName;
    }

}
