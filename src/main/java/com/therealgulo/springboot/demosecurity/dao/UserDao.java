package com.therealgulo.springboot.demosecurity.dao;

import com.therealgulo.springboot.demosecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
