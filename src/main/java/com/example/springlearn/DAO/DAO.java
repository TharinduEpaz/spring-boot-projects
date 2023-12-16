package com.example.springlearn.DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO<Type> {
    Type get(int  id) throws SQLException;
    List<Type> getAll() throws SQLException;
    int save(Type type) throws SQLException;
    int insert(Type type) throws SQLException;
    int update(Type type) throws SQLException;
    int delete(Type type) throws SQLException;
}
