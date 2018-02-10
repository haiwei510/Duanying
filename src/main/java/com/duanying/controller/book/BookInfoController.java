package com.duanying.controller.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.duanying.service.BookService;

@Controller
@RequestMapping(value="/bookinfo")
public class BookInfoController {
	
	@Autowired
	private BookService bookservice;

	@RequestMapping(value = "/hotType.html")
	@ResponseBody
	public String getHotBookType() {
		
		String json= JSON.toJSONString(bookservice.getlist());	
		return json;
	}
	

}
