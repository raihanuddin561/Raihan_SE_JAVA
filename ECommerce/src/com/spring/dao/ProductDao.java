package com.spring.dao;

import java.util.List;

import com.spring.model.Product;
import com.spring.model.SaleInfo;

public interface ProductDao {

	void addProduct(Product product);

	List<Product> getProducts();

	Product getProduct(int id);

	void deleteProduct(int id);

	List<SaleInfo> getMostSoldProduct();

	void saleProduct(SaleInfo saleInfo);

}
