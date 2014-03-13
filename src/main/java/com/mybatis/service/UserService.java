package com.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.db.UserMapper;
import com.mybatis.domain.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	

	public User login(String name,String password){
		return userMapper.getUser(name, password);
	}
	
	public void register(String name,String password){
		userMapper.insertUser(name, password);
	}
	
	public List<User> getAllUser(){
		return userMapper.getAllUser();
	}
	
	public void deleteUser(int id){
		userMapper.deleteUser(id);
	}
	
	public void update(User user){
		userMapper.updateUser(user.getPassword(), user.getId());
	}
}
