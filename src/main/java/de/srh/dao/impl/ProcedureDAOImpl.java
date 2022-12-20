package de.srh.dao.impl;


import de.srh.dao.ProcedureDAO;
import de.srh.model.Procedure;

import java.sql.SQLException;
import java.util.List;

public class ProcedureDAOImpl implements ProcedureDAO {


    @Override
    public Procedure get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Procedure> getAll() throws SQLException {
        return null;
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
