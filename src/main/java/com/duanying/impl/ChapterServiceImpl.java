package com.duanying.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duanying.dao.ChapterMapper;
import com.duanying.model.Chapter;
import com.duanying.service.ChapterService;

@Service
public class ChapterServiceImpl implements ChapterService{
	
	@Autowired
	private ChapterMapper chapterMapper;
	
	/**
	 * 获取最新章节
	 */
	@Override
	public Chapter getLeast(int bookId) {
		Chapter chapter = chapterMapper.chapterLeast(bookId);
		return chapter;
	}
	
}
