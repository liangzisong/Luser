package com.Luser;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Userlogin {

	@GetMapping("/login")
	public String login() {
		System.out.println("HelloController.login()");
		return "login";
	}  
	
	@PostMapping("/index")
	public String index(@RequestParam("userid")String userid,@RequestParam("userpwd") String userpwd) {
		System.out.println("HelloController.index()");
		if("admin".equals(userid) && "admin".equals(userpwd)) {
			return "index";
		}
		return "login";
	}
}