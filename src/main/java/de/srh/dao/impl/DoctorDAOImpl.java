package de.srh.dao.impl;

import de.srh.dao.DoctorDAO;
import de.srh.model.Doctor;

import java.sql.SQLException;
import java.util.List;

public class DoctorDAOImpl implements DoctorDAO {


    @Override
    public Doctor get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Doctor> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(Doctor doctor) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Doctor doctor) throws SQLException {
        return 0;
    }

    @Override
    public int update(Doctor doctor) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Doctor doctor) throws SQLException {
        return 0;
    }
}
