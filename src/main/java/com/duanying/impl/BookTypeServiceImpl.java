package com.duanying.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duanying.dao.BookTypeMapper;
import com.duanying.model.BookType;
import com.duanying.service.BookTypeService;

@Service
public class BookTypeServiceImpl implements BookTypeService {
	
	@Autowired
	private BookTypeMapper bookTypeMapper;
	
	@Override
	public List<BookType> getAll() {

		return bookTypeMapper.selectAll();
	}

}
