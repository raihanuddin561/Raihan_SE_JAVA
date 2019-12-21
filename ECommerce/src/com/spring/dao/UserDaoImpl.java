package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Authorities;
import com.spring.model.Users;
import com.spring.passwordEncoder.PasswordEnCoder;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void addUser(Users user) {

		Session currentSession = sessionFactory.getCurrentSession();
		String password = user.getPassword();
		user.setPassword(new PasswordEnCoder().encoder(password));
		user.setEnabled(1);
		currentSession.saveOrUpdate(user);

	}

	@Override
	@Transactional
	public List<Users> userList() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Users> getUserQuery = (Query<Users>) currentSession.createQuery("from users");
		List<Users> getUserList = getUserQuery.getResultList();
		return getUserList;
	}

	@Override
	@Transactional
	public void addAuthority(Authorities authority) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(authority);
	}

	@Override
	@Transactional
	public String getProPic(String uid) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Users> getUserQuery = (Query<Users>) currentSession.createQuery("from users where username=:username");
		getUserQuery.setParameter("username", uid);
		Users user = getUserQuery.getSingleResult();
		return user.getProfilePic();
	}

	@Override
	@Transactional
	public void updateProfile(Users user) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Users> getUserQuery = (Query<Users>) currentSession
				.createQuery("update users set profile_pic=:profilePic where username=:username");
		getUserQuery.setParameter("username", user.getUsername());
		getUserQuery.setParameter("profilePic", user.getProfilePic());
		getUserQuery.executeUpdate();

	}

	@Override
	@Transactional
	public String getFirstName(String name) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Users> getUserQuery = (Query<Users>) currentSession.createQuery("from users where username=:username");
		getUserQuery.setParameter("username", name);
		Users user = getUserQuery.getSingleResult();
		return user.getFirstname() + " " + user.getLastname();
	}

	@Override
	@Transactional
	public List<Users> getProfilePics(String username) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Users> getUserQuery = (Query<Users>) currentSession
				.createQuery("Select profile_pic from gallery where username=:username");
		getUserQuery.setParameter("username", username);
		List<Users> pics = getUserQuery.getResultList();

		return pics;
	}

	@Override
	@Transactional
	public List<Users> getUserList(String firstname) {
		Session currentSession = sessionFactory.getCurrentSession();
		// Query<Staff> createQuery = (Query<Staff>) currentSession.createQuery("from
		// staff");
		Query<Users> createQuery = currentSession.createQuery("from users where firstname like :firstname");
		createQuery.setParameter("firstname", firstname);
		List<Users> userList = createQuery.getResultList();
		return userList;
	}

}
