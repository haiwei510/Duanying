package com.duanying.service;

import java.util.List;

import com.duanying.impl.dto.BookDto;

public interface BookService {
	
	/**
	 * 热门分类
	 * @return
	 */
	List<BookDto> getlist();
	
	/**
	 * 月榜
	 * @return
	 */
	List<BookDto> getMonthTop();
	/**
	 * 周榜
	 * @return
	 */
	List<BookDto> getWeekTop();
	/**
	 * 编辑推荐
	 * @return
	 */
	List<BookDto> getEditerRecom();
	
	/**
	 * 言情特别推荐
	 * @return
	 */
	List<BookDto> getRomantic();
	/**
	 * 人气连载
	 * @return
	 */
	List<BookDto> getHotWriteing();
	/**
	 * 精彩完本
	 * @return
	 */
	List<BookDto> getBookOver();
	/**
	 * 最新更新
	 */
	List<BookDto> getUpdateLeast();
	
	/**
	 * 根据ID获取某一本书的具体信息
	 * @return
	 */
	BookDto getBookInfo(int id);
	
}
