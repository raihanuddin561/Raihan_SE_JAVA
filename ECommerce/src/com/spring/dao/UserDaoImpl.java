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

	


}
