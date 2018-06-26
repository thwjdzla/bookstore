package com.sample.mail.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.mail.service.UserService;
import com.sample.mail.vo.User;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/register.do", method=RequestMethod.GET)
	public String register() {
		return "/WEB-INF/views/form.jsp";
	}
	
	@RequestMapping(value="/register.do", method=RequestMethod.POST)
	public String resiter(User user) throws Exception {
		userService.registerUser(user);
		
		return "redirect:/";
	}
}
