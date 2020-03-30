package com.oyf.dao;

import com.oyf.pojo.User;

import java.util.List;

public interface UserDao {

    public List<User> findAll();

    public List<User> findByCondition(User user);

    public List<User> findByids(int [] ids);

}
