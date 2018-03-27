package com.duanying.service;

import java.util.List;

import com.duanying.model.BookType;

public interface TypeService {
	/**
	 * 获取类别
	 * @return
	 */
	List<BookType> getTypes();
}
