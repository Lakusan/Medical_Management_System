package de.srh.dao.impl;

import de.srh.dao.AppointmentDAO;
import de.srh.model.Appointment;

import java.sql.SQLException;
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
}
