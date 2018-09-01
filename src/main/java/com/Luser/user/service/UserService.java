package com.Luser.user.service;

import java.util.List;

import com.Luser.user.entity.User;

public interface UserService {
    List<User> listUser();

    User getOne(int id);
}
