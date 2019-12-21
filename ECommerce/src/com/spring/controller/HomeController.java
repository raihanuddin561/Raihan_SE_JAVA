package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Product;
import com.spring.model.SaleInfo;
import com.spring.service.ProductService;

@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<SaleInfo> mostSoldProduct = productService.getMostSoldProduct();
		model.addAttribute("mostSoldProduct",mostSoldProduct);
		return "dashboard";
	}
}
