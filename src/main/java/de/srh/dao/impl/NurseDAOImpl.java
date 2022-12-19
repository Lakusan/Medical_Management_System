package de.srh.dao.impl;

import de.srh.dao.NurseDAO;
import de.srh.model.Nurse;

import java.sql.SQLException;
import java.util.List;

public class NurseDAOImpl implements NurseDAO {
    @Override
    public Nurse get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Nurse> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(Nurse nurse) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Nurse nurse) throws SQLException {
        return 0;
    }

    @Override
    public int update(Nurse nurse) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Nurse nurse) throws SQLException {
        return 0;
    }
}
