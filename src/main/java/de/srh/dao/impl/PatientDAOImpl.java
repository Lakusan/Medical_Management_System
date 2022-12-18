package de.srh.dao.impl;

import de.srh.config.DBManager;
import de.srh.dao.PatientDAO;
import de.srh.model.Patient;
import de.srh.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Andreas Lakus
 */
public class PatientDAOImpl implements PatientDAO {
    @Override
    public Patient get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Patient> getAll() throws SQLException {
        Connection connection = DBManager.getConnection();

        List<Patient> patients = new ArrayList<>();

        String sql = "SELECT * FROM patients";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String title = resultSet.getString("title");
                int id = resultSet.getInt("patients_id");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String currentSymptoms = resultSet.getString("current_symptoms");
                String bloodgroup = resultSet.getString("bloodgroup");
                String dateOfBirth = resultSet.getString("dob");
                String phoneNumber = resultSet.getString("phonenumber");
                String assignedDoctor = resultSet.getString("assigned_doctor");
                String assignedNurse = resultSet.getString("assigned_nurse");
                String email = resultSet.getString("email");

                Patient patient = new Patient( id,  firstname,  lastname,  title,  phoneNumber,  bloodgroup,  assignedDoctor,  assignedNurse,  currentSymptoms,  dateOfBirth,  email);

                patients.add(patient);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return patients;
    }

    @Override
    public int save(Patient patient) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Patient patient) throws SQLException {
        return 0;
    }

    @Override
    public int update(Patient patient) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Patient patient) throws SQLException {
        return 0;
    }
}
