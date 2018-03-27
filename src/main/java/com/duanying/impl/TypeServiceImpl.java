package com.duanying.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duanying.dao.BookTypeMapper;
import com.duanying.model.BookType;
import com.duanying.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {
	
	@Autowired
	private BookTypeMapper booktype;
	
	@Override
	public List<BookType> getTypes() {

		return booktype.selecToptAll();
	}

}
