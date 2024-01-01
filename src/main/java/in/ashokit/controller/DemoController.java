package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {
	
	@GetMapping("/demo1")
	public ModelAndView getMsg(@RequestParam("name") String name) {
		
		String msgTxt = "Hello, "+ name;
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgTxt);
		mav.setViewName("index");
		
		return mav;
		
	}
	
	@GetMapping("/demo2/{name}")
	public ModelAndView getMsg2(@PathVariable("name") String name) {
		
		String msgTxt = "Good Morning, "+ name;
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msgTxt);
		mav.setViewName("index");
		
		return mav;
		
	}
	
	@GetMapping("/demo3")	
	public String getMsg3(Model model) {
		model.addAttribute("msg", "Hello How are u?");
		
		return "index";
	}
	
	@GetMapping("/demo4")
	@ResponseBody
	public String getMsg4() {
		String msg = "Welcome to Ashok IT!";
		return msg;
	}
	
	

}
