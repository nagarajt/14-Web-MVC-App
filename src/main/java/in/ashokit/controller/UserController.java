package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/c1")
public class UserController {
	
	public UserController() {
		System.out.println("Inside UserController constructor");
	}
	
	@GetMapping("/user")
	public ModelAndView getUser() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("id",101);
		mav.addObject("name","Raju");
		mav.addObject("email","raj@gmail.com");
		mav.setViewName("user");
		
		
		return mav;
	}
	
	

}
