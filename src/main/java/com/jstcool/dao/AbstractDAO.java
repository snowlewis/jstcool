package com.jstcool.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ibatis.sqlmap.client.SqlMapClient;

public abstract class AbstractDAO {

    @Autowired
    private SqlMapClient sqlMapClient;

    protected abstract String prefixName();

    protected String sql(String xmlId) {
        return prefixName() + "." + xmlId;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    protected Object insert(String sqlId, Object param) {
        try {
            return sqlMapClient.insert(sqlId, param);
        } catch (SQLException e) {
            throw new RuntimeException("DAO insert failed, sqlId=" + sqlId + ",param=" + param, e);
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    protected int update(String sqlId, Object param) {
        try {
            return sqlMapClient.update(sqlId, param);
        } catch (SQLException e) {
            throw new RuntimeException("DAO update failed, sqlId=" + sqlId + ",param=" + param, e);
        }
    }

    protected <T> List<T> queryForList(String sqlId, Object param) {
        try {
            return sqlMapClient.queryForList(sqlId, param);
        } catch (SQLException e) {
            throw new RuntimeException("DAO queryForList failed, sqlId=" + sqlId + ",param=" + param, e);
        }
    }

    protected <T> T queryForObject(String sqlId, Object param) {
        try {
            return (T) sqlMapClient.queryForObject(sqlId, param);
        } catch (SQLException e) {
            throw new RuntimeException("DAO queryForObject failed, sqlId=" + sqlId + ",param=" + param, e);
        }
    }

    protected <T> List<T> queryForList(String sqlId) {
        try {
            return sqlMapClient.queryForList(sqlId);
        } catch (SQLException e) {
            throw new RuntimeException("DAO queryForList failed, sqlId=" + sqlId, e);
        }
    }
}
