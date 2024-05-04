package com.rainsoul.spring6.service.impl;


import com.rainsoul.spring6.dao.UserDao;
import com.rainsoul.spring6.service.UserService;

public class UserServiceImpl implements UserService {
    //private UserDao userDao = new UserDaoImplForMySQL();

    // 修改为
    //private UserDao userDao = new UserDaoImplForOracle();

    private UserDao userDao;

    @Override
    public void deleteUser() {
        userDao.deleteById();
    }
}
