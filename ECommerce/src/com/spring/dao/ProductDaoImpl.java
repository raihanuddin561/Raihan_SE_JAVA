package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Product;
import com.spring.model.SaleInfo;
import com.spring.service.ProductService;
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public void addProduct(Product product) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(product);
		
	}
	@Override
	@Transactional
	public List<Product> getProducts() {
		Session currentSession = sessionFactory.getCurrentSession();
		List<Product> productList = currentSession.createQuery("from product").list();
		return productList;
	}
	@Override
	@Transactional
	public Product getProduct(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Product product = currentSession.get(Product.class, id);
		return product;
	}
	@Override
	@Transactional
	public void deleteProduct(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("delete from product where id=:id");
		query.setParameter("id",id);
		query.executeUpdate();
		
	}
	@Override
	public String getMostSoldProduct() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("select prodcutName from product where id=:id");
		return null;
	}
	@Override
	@Transactional
	public void saleProduct(SaleInfo saleInfo) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(saleInfo);
		
	}

}
