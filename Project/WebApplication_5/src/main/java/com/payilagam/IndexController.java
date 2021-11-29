package com.payilagam;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	
	@RequestMapping("index")
	//public String index(String name, HttpSession session)
	public ModelAndView index(User user)
	{
		
		ModelAndView mav = new ModelAndView(); 
		mav.addObject("userDetails",user); 
		mav.setViewName("index.jsp");
		
		return mav; 
	}
	
	
}
