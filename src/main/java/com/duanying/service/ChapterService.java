package com.duanying.service;

import java.util.List;

import com.duanying.model.Chapter;

public interface ChapterService {
	

	/**
	 * ��ȡ�����½�
	 */
	Chapter getLeast(int bookId);
	
	/**
	 * ��ȡ�������½�
	 * @return
	 */
	List<Chapter> getAllChapterById(int id);
	
	/**
	 * ��ȡ�½�
	 */
	Chapter getChapter(int id);
	
	
}
