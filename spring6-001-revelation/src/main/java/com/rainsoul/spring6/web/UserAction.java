package com.rainsoul.spring6.web;


import com.rainsoul.spring6.service.UserService;

public class UserAction {
    //private UserService userService = new UserServiceImpl();

    // 修改为
    private UserService userService;

    /**
     * 删除用户信息的请求
     */
    public void deleteRequest(){
        userService.deleteUser();
    }
}
