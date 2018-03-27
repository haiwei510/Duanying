package com.duanying.controller.book;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.duanying.impl.dto.BookDto;
import com.duanying.model.Chapter;
import com.duanying.service.BookService;
import com.duanying.service.ChapterService;
import com.duanying.service.TypeService;

@Controller
@RequestMapping(value = "/bookinfo")
public class BookInfoController {

	@Autowired
	private BookService bookservice;
	@Autowired
	private ChapterService chapterService;
	@Autowired
	private TypeService typeService;

	@RequestMapping(value = "/hotType.html")
	@ResponseBody
	public String getHotBookType(HttpServletResponse response,HttpServletRequest request) {
		//response.setHeader("Access-Control-Allow-Origin", "*");
		//response.setHeader("Access-Control-Allow-Credentials", "true");

		Map<String, Object> map = new HashMap<String, Object>();
		// ���ַ���
		map.put("hotType", bookservice.getlist());
		// �°�
		map.put("month", bookservice.getMonthTop());
		// �ܰ�
		map.put("week", bookservice.getWeekTop());
		// �༭�Ƽ�
		map.put("editer", bookservice.getEditerRecom());
		// �����ر��Ƽ�
		map.put("remantic", bookservice.getRomantic());
		// �����ر��Ƽ�
		map.put("bookOver", bookservice.getBookOver());
		// �����ر��Ƽ�
		map.put("writeing", bookservice.getHotWriteing());
		// �����½�
		map.put("leastChapter", bookservice.getUpdateLeast());

		String json = JSON.toJSONString(map);
		HttpSession session = request.getSession(true);
		
		String strsess = session.getId();
		
		System.out.println("session:"+strsess);
		return json;
	}
	
	
	/**
	 * �鱾��ϸ��Ϣ
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/info.html")
	@ResponseBody
	public String getBookInfo(HttpServletRequest request, HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");

		Map<String, Object> map = new HashMap<String, Object>();
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		// �鱾������Ϣ
		BookDto bookDto = bookservice.getBookInfo(bookId);		
		map.put("book",bookDto);
		// ���½�
		map.put("chapter", chapterService.getAllChapterById(bookId));
		// �����½�		
		map.put("leastChapter", chapterService.getLeast(bookId));
		
		String json = JSON.toJSONString(map);
		return json;
	}
	
	/**
	 * ��ȡ�½�����
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/chapterContent.html")
	@ResponseBody
	public String getChapterContent(HttpServletRequest request,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		int chapterId = Integer.parseInt(request.getParameter("chapterId"));
		Chapter chapter = chapterService.getChapter(chapterId);
		return JSON.toJSONString(chapter);
	}
	
	/**
	 * ��ȡ����
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/typemenu.html")
	@ResponseBody
	public String getType(HttpServletRequest request,HttpServletResponse response) {
//		response.setHeader("Access-Control-Allow-Origin", "*");

		return JSON.toJSONString(typeService.getTypes());
	}
	
	
	
	
	

}
