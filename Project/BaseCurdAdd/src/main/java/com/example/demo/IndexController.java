package com.example.demo;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class IndexController {

	@Autowired
	UserDAO userdao;
	
	@RequestMapping("index")
	//public String index(String name, HttpSession session)
	public ModelAndView index(User user)
	{
		
		ModelAndView mav = new ModelAndView(); 
		mav.addObject("userDetails",user); 
		mav.setViewName("index.jsp");
		
		return mav; 
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user)
	{
		userdao.save(user);
		
		return "index.jsp"; 
	}
}
