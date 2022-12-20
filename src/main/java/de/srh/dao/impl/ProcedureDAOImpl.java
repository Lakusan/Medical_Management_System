package de.srh.dao.impl;


import de.srh.config.DBManager;
import de.srh.dao.ProcedureDAO;
import de.srh.model.Medication;
import de.srh.model.Procedure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProcedureDAOImpl implements ProcedureDAO {


    @Override
    public Procedure get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Procedure> getAll() throws SQLException {
        Connection connection = DBManager.getConnection();

        List<Procedure> procedures = new ArrayList<>();

        String sql = "SELECT * FROM railway.procedure INNER JOIN prices ON procedure_id = prices_id";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("procedure_id");
                String procedurename = resultSet.getString("procedurename");
                Float price = resultSet.getFloat("price");
                Procedure procedure = new Procedure( id, procedurename,  price );

                procedures.add(procedure);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return procedures;
    }

    @Override
    public int save(Procedure procedure) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Procedure procedure) throws SQLException {
        return 0;
    }

    @Override
    public int update(Procedure procedure) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Procedure procedure) throws SQLException {
        return 0;
    }
}
