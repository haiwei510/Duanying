package com.duanying.controller.book;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

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
	public String getHotBookType(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin","*");
		
		Map<String,Object> map = new HashMap<String, Object>();
		//热闹分类
		map.put("hotType", bookservice.getlist());
		//月榜
		map.put("month", bookservice.getMonthTop());
		//周榜
		map.put("week", bookservice.getWeekTop());
		//编辑推荐
		map.put("editer", bookservice.getEditerRecom());
		//言情特别推荐
		map.put("remantic", bookservice.getRomantic());
		//言情特别推荐
		map.put("bookOver", bookservice.getBookOver());
		//言情特别推荐
		map.put("writeing", bookservice.getHotWriteing());
		//最新章节
		map.put("leastChapter", bookservice.getUpdateLeast());
		
		String json= JSON.toJSONString(map);	
		return json;
	}
	
	@RequestMapping(value="/bookinfo.html")
	@ResponseBody
	public String getBookInfo() {
		Map<String,Object> map = new HashMap<String, Object>();
		
		String json = JSON.toJSONString(map);
		return json;
	}
	

}
