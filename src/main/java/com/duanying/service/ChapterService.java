package com.duanying.service;

import com.duanying.model.Chapter;

public interface ChapterService {
	

	/**
	 * ��ȡ�����½�
	 */
	Chapter getLeast(int bookId);
}
