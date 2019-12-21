package com.spring.service;

import java.util.List;

import javax.validation.Valid;

import com.spring.model.Authorities;
import com.spring.model.Users;

public interface UserService {
	public void addUser(Users user);
	public List<Users> userList();
	public void addAuthority(Authorities authority);

}
