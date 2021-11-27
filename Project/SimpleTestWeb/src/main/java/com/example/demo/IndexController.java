package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	@RequestMapping("index")
	//@ResponseBody
public String index(HttpServletRequest request )
{
	System.out.println("welcome ");
	HttpSession session = request.getSession(); 
	String s = request.getParameter("name"); 
	System.out.println(s);
	session.setAttribute("name", s);
	return "index.jsp";
}
}
