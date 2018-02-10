package com.duanying.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.duanying.service.BookService;


@Controller
@CrossOrigin
public class TestController {

	@Autowired
	private BookService bookservice;

	@RequestMapping(value = "/test.html")
	@ResponseBody
	public String test(HttpServletResponse respon) {
//		respon.setHeader("Access-Control-Allow-Origin","*");
		String json= JSON.toJSONString(bookservice.getlist());	
		return json;
	}	
	@RequestMapping(value="list")
	
	public String getJson() {
		return "seccess";
	}
	

}
