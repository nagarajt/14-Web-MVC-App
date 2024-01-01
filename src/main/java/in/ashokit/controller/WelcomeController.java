package in.ashokit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/c2")
public class WelcomeController {
	
	public WelcomeController() {
		System.out.println("Welcome controller ");
	}
	 
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg","Welcome to AshokIT");
		mav.addObject("msg2","Good Morning");
		mav.setViewName("index");
		return mav;
		
	}
	
	
	
	@GetMapping("/date")	
	public ModelAndView getDate() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("date", new Date());
		mav.setViewName("index");
		return mav;
	}

}
