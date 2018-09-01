package com.Luser.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.Luser.user.entity.User;

@Mapper
//@Service
@ComponentScan
public interface UserMapper{

    List<User> listUser();

    User getOne(int id);
    
}