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

	@Override
	public String getProPic(String uid) {
		// TODO Auto-generated method stub
		return userDao.getProPic(uid);
	}

	@Override
	public void updateProfiler(Users user) {
		// TODO Auto-generated method stub
		userDao.updateProfile(user);
	}

	@Override
	public String getFirstName(String name) {
		// TODO Auto-generated method stub
		return userDao.getFirstName(name);
	}

	@Override
	public List<Users> getProfilePics(String username) {
		// TODO Auto-generated method stub
		return userDao.getProfilePics(username);
	}

	@Override
	public List<Users> getUserList(String firstname) {
		// TODO Auto-generated method stub
		return userDao.getUserList(firstname);
	}

}
