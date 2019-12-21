package com.spring.dao;

import java.util.List;

import com.spring.model.Authorities;
import com.spring.model.Users;


public interface UserDao {
	public void addUser(Users user);
	public List<Users> userList();
	public void addAuthority(Authorities authority);
	public String getProPic(String uid);
	public void updateProfile(Users user);
	public String getFirstName(String name);
	public List<Users> getProfilePics(String username);
	public List<Users> getUserList(String firstname);
}
