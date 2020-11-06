package com.dell.Dao;

import com.dell.pojo.User;

public interface UserDao {
    public User queryUserByUsername(String username);
    public User queryUserByUsernameAndPass(String username,String password);
    public int saveUser(User user);
}
