package com.duanying.impl.dto;

import java.util.ArrayList;
import java.util.List;

import com.duanying.model.Book;
import com.duanying.model.Chapter;

public class BookDto extends Book {
	private String typeName;
	private String typeChildName;//子分类
	private String authorName;//作者
	private String heartNum;  //喜欢人数
	private Book book;
	public List<BookDto> listType = new ArrayList<BookDto>();
	/**
	 * 章节
	 */
	private Chapter chapter;

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeChildName() {
		return typeChildName;
	}

	public void setTypeChildName(String typeChildName) {
		this.typeChildName = typeChildName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getHeartNum() {
		return heartNum;
	}

	public void setHeartNum(String heartNum) {
		this.heartNum = heartNum;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
	
	


}
