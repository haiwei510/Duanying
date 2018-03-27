package com.duanying.impl;

import java.util.List;

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
	 * ��ȡ�����½�
	 */
	@Override
	public Chapter getLeast(int bookId) {
		Chapter chapter = chapterMapper.chapterLeast(bookId);
		return chapter;
	}

	@Override
	public List<Chapter> getAllChapterById(int id) {
		return chapterMapper.getChaptrAllByBook(id);
	}

	@Override
	public Chapter getChapter(int id) {
		Chapter chapter = chapterMapper.selectByPrimaryKey(id);
		if(chapter ==null) {
			chapter = new Chapter();
			chapter.setChapterName("���1��");
			chapter.setChapterContent("�����޸�");
		}
		return chapter;
	}
	
}
