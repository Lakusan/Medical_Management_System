package de.srh.dao.impl;

import de.srh.config.DBManager;
import de.srh.dao.PatientDAO;
import de.srh.model.Patient;

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
        Connection connection = DBManager.getConnection();

        String sql = "INSERT IGNORE INTO country (countryname) VALUE (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, patient.getCountry());
        int result = -1;

        try{
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }

        String sql2 = "INSERT IGNORE INTO city (cityname , city.country_country_id) VALUES (?, (SELECT country_id FROM country  WHERE countryname = ?))";
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
        preparedStatement2.setString(1, patient.getCity());
        preparedStatement2.setString(2, patient.getCountry());
        int result2 = -1;

        try{
            result2 = preparedStatement2.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }



        String sql3 = "INSERT IGNORE INTO address (streetname , postalcode, housenumber, address.city_city_id) VALUES (?, ?, ?, (SELECT city_id FROM city  WHERE cityname = ?));";
        PreparedStatement preparedStatement3 = connection.prepareStatement(sql3);
        preparedStatement3.setString(1, patient.getStreetname());
        preparedStatement3.setInt(2, patient.getPostalcode());
        preparedStatement3.setInt(3, patient.getHouseNo());
        preparedStatement3.setString(4, patient.getCity());
        int result3 = -1;

        try{
            result3 = preparedStatement3.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }

        String sql4 = "INSERT INTO patients (lastname, firstname, email, phonenumber, title, bloodgroup, assigned_doctor, assigned_nurse, address_address_id, address_city_city_id, records_records_id, current_symptoms, dob, insurance_number, insurance_type, payment_type)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?,  (SELECT address_id FROM address WHERE streetname = ? AND postalcode = ? AND housenumber = ? AND address.city_city_id = (SELECT city_id FROM city  WHERE cityname = ?)), (SELECT city_id FROM city  WHERE cityname = ?), 1, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement4 = connection.prepareStatement(sql4);
        preparedStatement4.setString(1, patient.getLastname());
        preparedStatement4.setString(2, patient.getFirstname());
        preparedStatement4.setString(3, patient.getEmail());
        preparedStatement4.setInt(4, Integer.parseInt(patient.getPhoneNumber()));
        preparedStatement4.setString(5, patient.getTitle());
        preparedStatement4.setString(6, patient.getBloodgroup());
        preparedStatement4.setString(7, patient.getAssignedDoctor());
        preparedStatement4.setString(8, patient.getAssignedNurse());

        preparedStatement4.setString(9, patient.getStreetname());
        preparedStatement4.setInt(10, patient.getPostalcode());
        preparedStatement4.setInt(11, patient.getHouseNo());
        preparedStatement4.setString(12, patient.getCity());
        preparedStatement4.setString(13, patient.getCity());

        preparedStatement4.setString(14, patient.getCurrentSymptoms());
        preparedStatement4.setString(15, patient.getDateOfBirth());
        preparedStatement4.setInt(16, patient.getInsuranceNumber());
        preparedStatement4.setString(17, patient.getInsuranceType());
        preparedStatement4.setString(18, patient.getPaymentMethod());

        int result4 = -1;

        try{
            result4 = preparedStatement4.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closePrepStatement(preparedStatement2);
        DBManager.closePrepStatement(preparedStatement3);
        DBManager.closePrepStatement(preparedStatement4);
        DBManager.closeConnection(connection);

        return result;
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

    public int addRecordToPatient(Patient patient) throws SQLException{
        int result1 = -1;
        int result2 = -1;

        Connection connection = DBManager.getConnection();

        String sql = "INSERT INTO records (date, recorddata) VALUES ((SELECT curdate()), ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, patient.getRecordData());

        String sql2 = "UPDATE patients set records_records_id=(SELECT LAST_INSERT_ID()) WHERE patients_id = ?";
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
        preparedStatement2.setInt(1, patient.getId());

        try {
            result1 = preparedStatement.executeUpdate();
//            connection.commit();
            result2 = preparedStatement2.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        }
        if (result1 != 1 || result2 != 1){
            return -1;
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closePrepStatement(preparedStatement2);
        DBManager.closeConnection(connection);
        return result1;
    }

    public Patient getPatientRecord(Patient patient) throws SQLException{
        int result = -1;
        Patient resutingPatient = null;
        int record_id = 0;
        String recordData = "";
        int patientID = 0;
        Connection connection = DBManager.getConnection();
        String sql = "SELECT patients.records_records_id, records.recorddata FROM patients INNER JOIN records ON patients.records_records_id = records.records_id WHERE patients.patients_id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, patient.getId());
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if( resultSet.next()) {
                record_id = resultSet.getInt("records_records_id");
                recordData = resultSet.getString("recorddata");
                resutingPatient = new Patient(patient.getId(), record_id, recordData);
                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return resutingPatient;
    }

}
