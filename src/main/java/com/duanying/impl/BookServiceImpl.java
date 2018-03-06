package com.duanying.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duanying.dao.BookMapper;
import com.duanying.impl.dto.BookDto;
import com.duanying.model.Book;
import com.duanying.model.BookType;
import com.duanying.model.Chapter;
import com.duanying.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	@Autowired
	private BookTypeServiceImpl bookTypeServiceImpl;
	@Autowired
	private ChapterServiceImpl chapterServiceImpl;

	// 热闹分类
	@Override
	public List<BookDto> getlist() {

		// 所有分类
		List<BookType> litBtype = bookTypeServiceImpl.getAll();
		// 每种分类的书
		List<BookDto> list = bookMapper.selectByTypes();

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < litBtype.size(); j++) {
				// 获取子分类名称
				if (list.get(i).getTypeId() == litBtype.get(j).getTypeParent()
						&& litBtype.get(j).getTypeParent() != 0) {
					list.get(i).setTypeChildName(litBtype.get(j).getTypeName());
					break;
				}
			}

			if ("玄幻".equals(list.get(i).getTypeName()) || "奇幻".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("玄幻.奇幻");
			}
			if ("武侠".equals(list.get(i).getTypeName()) || "仙侠".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("武侠.仙侠");
			}
			if ("都市".equals(list.get(i).getTypeName()) || "娱乐".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("都市.娱乐");
			}
			if ("科幻".equals(list.get(i).getTypeName()) || "灵异".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("科幻.灵异");
			}
			if ("游戏".equals(list.get(i).getTypeName()) || "体育".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("游戏.体育");
			}
			if ("历史".equals(list.get(i).getTypeName()) || "军事".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("历史.军事");
			}
		}

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i).getTypeId());
		}

		List<BookDto> listValue = new ArrayList<BookDto>();
		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			BookDto bookDto = new BookDto();
			int typeId = iterator.next();
			int index = 0;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getTypeId() == typeId) {
					bookDto.listType.add(list.get(i));
					index = i;
				}
			}
			bookDto.setTypeName(list.get(index).getTypeName());
			listValue.add(bookDto);
		}

		return listValue;
	}

	/**
	 * 月榜
	 */
	@Override
	public List<BookDto> getMonthTop() {
		return bookMapper.monthTopTen();
	}

	/**
	 * 周榜
	 */
	@Override
	public List<BookDto> getWeekTop() {
		return bookMapper.weekTopTen();
	}

	/**
	 * 编辑推荐
	 */
	@Override
	public List<BookDto> getEditerRecom() {
		return bookMapper.editerRecom();
	}

	/**
	 * 言情推荐
	 */
	@Override
	public List<BookDto> getRomantic() {
		List<BookDto> list = bookMapper.remantic();
		List<BookDto> listVal = new ArrayList<BookDto>();
		for (int i = 0; i < 4; i++) {
			BookDto dto = new BookDto();
			listVal.add(dto);
		}

		int k = 0;

		for (int i = 0; i < list.size(); i++) {
			if (k < 4) {
				switch (k) {
				case 0:
					listVal.get(k).setTypeName("现代言情");
					break;
				case 1:
					listVal.get(k).setTypeName("古代言情");
					break;
				case 2:
					listVal.get(k).setTypeName("霸道总裁");
					break;
				case 3:
					listVal.get(k).setTypeName("仙侠情缘");
					break;
				}

				listVal.get(k).listType.add(list.get(i));

				if (listVal.get(k).listType.size() == 9) {
					k += 1;
				}

			}
		}
		return listVal;
	}

	/**
	 * 人气连载
	 */
	@Override
	public List<BookDto> getHotWriteing() {
		return bookMapper.hotWriteing();
	}

	/**
	 * 精彩完本
	 */
	@Override
	public List<BookDto> getBookOver() {
		return bookMapper.bookOver();
	}

	/**
	 * 获取最新更新
	 */
	@Override
	public List<BookDto> getUpdateLeast() {
		List<BookDto> list = bookMapper.updateLeast();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getLastestChapter() == null) {
				Chapter chapter = new Chapter();
				chapter.setChapterName("休息几天，最近无更");
				list.get(i).setChapter(chapter);
			} else {
				//获取最新章节
				Chapter chapter = chapterServiceImpl.getLeast(list.get(i).getLastestChapter());
				list.get(i).setChapter(chapter);
			}

		}

		return list;
	}

	
	/**
	 * 获取某一本书的具体信息
	 */
	@Override
	public BookDto getBookInfo(int id) {
		return bookMapper.selectByPrimaryKey(id);
	}

}
