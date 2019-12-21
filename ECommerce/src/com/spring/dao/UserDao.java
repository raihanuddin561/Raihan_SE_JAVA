package com.spring.dao;

import java.util.List;

import com.spring.model.Authorities;
import com.spring.model.Users;


public interface UserDao {
	public void addUser(Users user);
	public List<Users> userList();
	public void addAuthority(Authorities authority);
	
}
