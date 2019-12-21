package com.spring.service;

import java.util.List;

import javax.validation.Valid;

import com.spring.model.Product;
import com.spring.model.SaleInfo;

public interface ProductService {

	void addProduct( Product product);

	List<Product> getProducts();

	Product getProduct(int id);

	void deleteProduct(int id);

	String getMostSoldProduct();

	void saleProduct( SaleInfo saleInfo);

}
