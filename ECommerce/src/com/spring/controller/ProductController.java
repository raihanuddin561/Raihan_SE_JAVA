package com.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Product;
import com.spring.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/addProduct")
	public String addProduct(Model model, @Valid Product product,BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("product",product);
			return "addProduct";
		}else {
			if(product.getProductName()!=null) {
				productService.addProduct(product);
				return "productadded";
			}else {
				model.addAttribute("product",product);
				return "addProduct";
			}
		}
		
		
	}
	
	@RequestMapping("/updateproduct")
	public String updateProduct(Model model,@RequestParam("pid") int id) {
		 Product product = productService.getProduct(id);
		model.addAttribute("product",product);
		return "addProduct";
	}
	
	@RequestMapping("/product")
	public String product(Model model) {
		List<Product> productList = productService.getProducts();
		model.addAttribute("product",productList);
		return "product";
	}
	
	@RequestMapping("/deleteproduct")
	public String deleteProduct(Model model,@RequestParam("pid") int id) {
		 productService.deleteProduct(id);
		
		return "deletesuccess";
	}
}
