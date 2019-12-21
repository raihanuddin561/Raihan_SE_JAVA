package com.spring.dao;

import java.util.List;

import com.spring.model.Product;

public interface ProductDao {

	void addProduct(Product product);

	List<Product> getProducts();

	Product getProduct(int id);

	void deleteProduct(int id);

	String getMostSoldProduct();

}
