package com.dell.Dao.impl;

import com.dell.Dao.UserDao;
import com.dell.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        return queryForOne(User.class,"select id,name,password from user where name = ?",username);
    }

    @Override
    public User queryUserByUsernameAndPass(String username, String password) {
        return queryForOne(User.class,"select id,name,password from user where name = ? and password = ?",username,password);
    }

    @Override
    public int saveUser(User user) {
        return update("insert into user(name) values(?)",user.getUname()) ;
    }
}
