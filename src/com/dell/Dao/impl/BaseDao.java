package com.dell.Dao.impl;

import com.dell.Utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {
    private QueryRunner queryRunner =  new QueryRunner();
    public int update(String sql,Object ... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.closeConnection(connection);
        }
        return -1;
    }

    public <T> T queryForOne(Class<T> type,String sql,Object ... args){
        Connection con = JdbcUtils.getConnection();
        try {
            return  queryRunner.query(con,sql,new BeanHandler<>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.closeConnection(con);
        }
        return null;
    }


    public <T> List<T> queryForList(Class<T> type, String sql, Object ... args){
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con,sql,new BeanListHandler<>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.closeConnection(con);
        }
        return null;
    }

    public Object queryForValue(String sql,Object ... args){
        Connection con = JdbcUtils.getConnection();

        try {
            return  queryRunner.query(con,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.closeConnection(con);
        }
        return null;
    }
}
