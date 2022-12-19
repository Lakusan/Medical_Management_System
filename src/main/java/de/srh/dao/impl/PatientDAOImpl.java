package de.srh.dao.impl;

import de.srh.config.DBManager;
import de.srh.dao.PatientDAO;
import de.srh.model.Patient;
import de.srh.model.User;
import de.srh.service.PasswordService;
import de.srh.service.ValidationService;

import java.sql.*;
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
        Connection connection = DBManager.getConnection();

        String sql = "UPDATE patients set current_symptoms = ?, phonenumber = ?, assigned_doctor = ?, assigned_nurse =? WHERE patients_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, patient.getCurrentSymptoms());
        preparedStatement.setInt(2, Integer.parseInt(patient.getPhoneNumber()));
        preparedStatement.setString(3, patient.getAssignedDoctor());
        preparedStatement.setString(4, patient.getAssignedNurse());

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
    public int delete(Patient patient) throws SQLException {
        return 0;
    }

    public int updateListOfPatients(List<Patient> patients) throws SQLException{

        Connection connection = DBManager.getConnection();
        int result = -1;

        String sql = "UPDATE patients set current_symptoms = ?, phonenumber = ?, assigned_doctor = ?, assigned_nurse =? WHERE patients_id = ?";
        for (int i = 0 ; i < patients.size() ; i++) {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, patients.get(i).getCurrentSymptoms());
            preparedStatement.setInt(2, Integer.parseInt(patients.get(i).getPhoneNumber()));
            preparedStatement.setString(3, patients.get(i).getAssignedDoctor());
            preparedStatement.setString(4, patients.get(i).getAssignedNurse());
            preparedStatement.setInt(5, patients.get(i).getId());

            try {
                result = preparedStatement.executeUpdate();
                connection.commit();
            } catch (SQLIntegrityConstraintViolationException e) {
                e.printStackTrace();
                System.err.println(e.getClass().getName() + ": " + e.getMessage());

            }
            if (result != 1){
                break;
            }
            DBManager.closePrepStatement(preparedStatement);
            DBManager.closeConnection(connection);
        }
        return result;
    }
}
