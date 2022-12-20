package de.srh.dao.impl;

import de.srh.dao.MedicationDAO;
import de.srh.model.Medication;

import java.sql.SQLException;
import java.util.List;

public class MedicationDAOImpl implements MedicationDAO {
    @Override
    public Medication get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Medication> getAll() throws SQLException {
        return null;
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
