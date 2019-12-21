package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/loggedout")
	public String logout() {
		return "loggedout";
	}
	@RequestMapping("/loggedsuccess")
	public String loggedIn(Model model) {
	
		
		return "redirect:/";
		
	}
}
