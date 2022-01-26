package com.example.learnspringboot.courses.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnspringboot.courses.bean.CourseData;

@Controller
public class coursesController {
	
	@RequestMapping("/")
	public String homePage()
	{
		return "Home.jsp";
	}
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login.jsp";
	}
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout.jsp";
	}
	
	@RequestMapping("user")
	@ResponseBody
	public Principal user(Principal principal)
	{
		return principal;
	}
	

}
