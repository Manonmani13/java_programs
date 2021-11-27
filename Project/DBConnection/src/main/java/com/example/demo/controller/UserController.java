package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//@EnableAutoConfiguration(exclude= {ErrorMvcAutoConfiguration.class)
public class UserController {
	@RequestMapping("addUser")
	public String user()
	{
		return "index.jsp";
	}
}
