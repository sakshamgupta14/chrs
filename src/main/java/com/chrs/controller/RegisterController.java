package com.chrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author saksham
 *
 */
@Controller
public class RegisterController {

	@RequestMapping(value = "/register")
	public ModelAndView register() {
		
		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;
	}
	

}
