package com.duanying.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.duanying.model.User;
import com.duanying.model.Users;
import com.duanying.service.UserServiceI;

@Controller
public class TestController {

	// ×¢ÈëuserService
	@Resource
	private UserServiceI userService;

	@RequestMapping(value = "/test.html")
	public ModelAndView test() {
		ModelAndView view = new ModelAndView("helloWorld");
		view.addObject("message", "helloWorld");

		 User u = userService.getUserById("2");
		// List<Users> list = userService.getAllUser();

		return view;
	}

}
