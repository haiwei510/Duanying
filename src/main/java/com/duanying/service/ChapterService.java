package com.duanying.service;

import java.util.List;

import com.duanying.model.Chapter;

public interface ChapterService {
	

	/**
	 * 获取最新章节
	 */
	Chapter getLeast(int bookId);
	
	/**
	 * 获取书所有章节
	 * @return
	 */
	List<Chapter> getAllChapterById(int id);
	
	/**
	 * 获取章节
	 */
	Chapter getChapter(int id);
	
	
}
