package com.Luser.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Luser.user.entity.User;
import com.Luser.user.mapper.UserMapper;
import com.Luser.user.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @ResponseBody
    @RequestMapping(value="/get")
    public User get() {
        return userService.getOne(1);
    }
    
    @ResponseBody
    @RequestMapping(value="/list")
    public List<User> list() {
        return userService.listUser();
    }
    
    
}