package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Authorities;
import com.spring.model.Users;
import com.spring.service.UserService;



@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("/createuser")
	public String createAccount(Model model,@Valid Users user,BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("user",user);
			return "createuser";
		}else {
			if(user.getUsername() != null && user.getFirstname() != null && user.getLastname() != null && user.getEmail() != null && user.getPassword() != null) {
				//user.setProfilePic(ImageUtility.uploadFile(user.getPropic(),request,"profile",user.getUsername()));
				
				Authorities authority = new Authorities(user.getUsername(),"ROLE_USER");
				userService.addUser(user);
				userService.addAuthority(authority);
				
				return "createaccountmessage";
			}else {
				System.out.println("form loading");
				model.addAttribute("user",user);
				return "createuser";
			}
		}
		
	}
}
