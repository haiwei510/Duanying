package com.duanying.service;

import com.duanying.model.Chapter;

public interface ChapterService {
	

	/**
	 * 获取最新章节
	 */
	Chapter getLeast(int bookId);
}
