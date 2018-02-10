package com.duanying.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duanying.dao.BookMapper;
import com.duanying.impl.dto.BookDto;
import com.duanying.model.Book;
import com.duanying.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookMapper bookMapper;
	@Override
	public List<BookDto> getlist() {
		List<BookDto> list = bookMapper.selectByTypes();
		System.out.println("----size:"+list.size());
		return list;
	}

}
