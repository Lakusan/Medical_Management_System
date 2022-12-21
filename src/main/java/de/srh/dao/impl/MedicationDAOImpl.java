package de.srh.dao.impl;

import de.srh.config.DBManager;
import de.srh.dao.MedicationDAO;
import de.srh.model.Medication;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicationDAOImpl implements MedicationDAO {
    @Override
    public Medication get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Medication> getAll() throws SQLException {
        Connection connection = DBManager.getConnection();

        List<Medication> medications = new ArrayList<>();

        String sql = "SELECT * FROM medication INNER JOIN prices ON medication_id = prices_id";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("medication_id");
                String medicationname = resultSet.getString("medicationname");
                Float price = resultSet.getFloat("price");
                Medication medication = new Medication( id, medicationname,  price );

                medications.add(medication);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return medications;
    }

    @Override
    public int save(Medication medication) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Medication medication) throws SQLException {
        return 0;
    }

    @Override
    public int update(Medication medication) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Medication medication) throws SQLException {
        return 0;
    }
}
