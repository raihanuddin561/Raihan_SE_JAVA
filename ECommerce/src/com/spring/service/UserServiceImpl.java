package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.model.Authorities;
import com.spring.model.Users;



@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public void addUser(Users user) {
		userDao.addUser(user);

	}

	@Override
	public List<Users> userList() {
		// TODO Auto-generated method stub
		return userDao.userList();
	}

	@Override
	public void addAuthority(Authorities authority) {
		userDao.addAuthority(authority);
		
	}

	

}
