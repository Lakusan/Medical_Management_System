package de.srh.dao.impl;

import de.srh.config.DBManager;
import de.srh.dao.AppointmentDAO;
import de.srh.model.Appointment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAOImpl implements AppointmentDAO {
    @Override
    public Appointment get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Appointment> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(Appointment appointment) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Appointment appointment) throws SQLException {
        return 0;
    }

    @Override
    public int update(Appointment appointment) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Appointment appointment) throws SQLException {
        return 0;
    }
    public List<Appointment> getAllAppointmentsWithPatientInfos() throws SQLException {

        Connection connection = DBManager.getConnection();

        List<Appointment> appointments = new ArrayList<>();

        String sql = "SELECT * FROM railway.patients INNER JOIN appointment ON appointment_appointment_id = appointment_id";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int appointmentId = resultSet.getInt("appointment_id");
                String date = resultSet.getString("date");
                String time = resultSet.getString("time");
                int treatmentTeatmentId = resultSet.getInt("treatment_treatment_id");
                String diagnosis = resultSet.getString("current_symptoms");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                int patientsId = resultSet.getInt("patients_id");
                String price = resultSet.getString("price");
                Appointment appointment = new Appointment(appointmentId, date, time, treatmentTeatmentId, diagnosis, patientsId, firstname, lastname, price);

                appointments.add(appointment);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return appointments;
    }

    public int updatePrice(Appointment appointment) throws SQLException{
        Connection connection = DBManager.getConnection();

        String sql = "UPDATE appointment set price = ? WHERE appointment_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, appointment.getPrice());
        preparedStatement.setInt(2, appointment.getAppointmentID());

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

    public int createAppointment(Appointment appointment) throws SQLException{
        Connection connection = DBManager.getConnection();

        String sql = "UPDATE appointment set date = ? , treatment_treatment_id = ?, diagnosis = ? WHERE appointment_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, appointment.getDate());
        preparedStatement.setInt(2, appointment.getTreatmentId());
        preparedStatement.setString(3, appointment.getDiagnosis());
        preparedStatement.setInt(4, appointment.getAppointmentID());

        String sql2 = "UPDATE patients set appointment_appointment_id = ?, current_symptoms = ? WHERE patients_id = ?";
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
        preparedStatement2.setInt(1, appointment.getAppointmentID());
        preparedStatement2.setString(2, appointment.getDiagnosis());
        preparedStatement2.setInt(3, appointment.getPatientID());

        int result = -1;
        try{
            result = preparedStatement.executeUpdate();
            result = preparedStatement2.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());

        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closePrepStatement(preparedStatement2);
        DBManager.closeConnection(connection);


        return result;
    }
}
