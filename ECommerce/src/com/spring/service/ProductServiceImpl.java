package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductDao;
import com.spring.model.Product;
import com.spring.model.SaleInfo;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
		
	}
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productDao.getProducts();
	}
	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return productDao.getProduct(id);
	}
	@Override
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
		
	}
	@Override
	public List<SaleInfo> getMostSoldProduct() {
		// TODO Auto-generated method stub
		return productDao.getMostSoldProduct();
	}
	@Override
	public void saleProduct(SaleInfo saleInfo) {
		productDao.saleProduct(saleInfo);
		
	}

}
