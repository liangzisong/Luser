package com.Luser.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.Luser.user.entity.User;
import com.Luser.user.mapper.UserMapper;
import com.Luser.user.service.UserService;

@ComponentScan
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> listUser() {
		
		return userMapper.listUser();
	}

	@Override
	public User getOne(int id) {
		
		return userMapper.getOne(id);
	}


}
