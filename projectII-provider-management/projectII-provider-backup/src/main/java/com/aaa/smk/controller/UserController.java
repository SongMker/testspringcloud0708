package com.aaa.smk.controller;

import com.aaa.smk.base.BaseController;
import com.aaa.smk.base.CommonController;
import com.aaa.smk.base.ResultData;
import com.aaa.smk.model.User;
import com.aaa.smk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 月之光芒
 * Date: 2020/7/8
 * Time: 18:13
 * Description:
 * \
 */
@RestController
public class UserController extends CommonController<User> {

    @Autowired
    private UserService userService;

    @Override
    public UserService getBaseService() {
        return userService;
    }
@PostMapping("/add")
    public ResultData add(User user) {
        return userService.insertData(user);

    }
@PostMapping("/add")
    public Object selectAllRoles() {
        return userService.selectAllRole();
    }


}