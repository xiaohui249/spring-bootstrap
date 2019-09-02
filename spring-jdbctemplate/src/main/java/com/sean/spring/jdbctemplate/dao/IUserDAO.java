package com.sean.spring.jdbctemplate.dao;

import com.sean.spring.jdbctemplate.entity.User;

import java.util.List;

/**
 * UserDAO接口
 *
 * @author xiaoh
 * @date 2019/9/2
 */
public interface IUserDAO {
    void addUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    User searchUser(int id);
    List<User> findAll();
}
