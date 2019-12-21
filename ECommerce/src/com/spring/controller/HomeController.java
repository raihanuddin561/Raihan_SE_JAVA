package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String dashboard() {
		String mostSoldProduct = productService.getMostSoldProduct();
		return "dashboard";
	}
}
