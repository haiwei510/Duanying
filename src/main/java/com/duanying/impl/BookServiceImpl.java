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

	// ���ַ���
	@Override
	public List<BookDto> getlist() {

		// ���з���
		List<BookType> litBtype = bookTypeServiceImpl.getAll();
		// ÿ�ַ������
		List<BookDto> list = bookMapper.selectByTypes();

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < litBtype.size(); j++) {
				// ��ȡ�ӷ�������
				if (list.get(i).getTypeId() == litBtype.get(j).getTypeParent()
						&& litBtype.get(j).getTypeParent() != 0) {
					list.get(i).setTypeChildName(litBtype.get(j).getTypeName());
					break;
				}
			}

			if ("����".equals(list.get(i).getTypeName()) || "���".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("����.���");
			}
			if ("����".equals(list.get(i).getTypeName()) || "����".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("����.����");
			}
			if ("����".equals(list.get(i).getTypeName()) || "����".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("����.����");
			}
			if ("�ƻ�".equals(list.get(i).getTypeName()) || "����".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("�ƻ�.����");
			}
			if ("��Ϸ".equals(list.get(i).getTypeName()) || "����".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("��Ϸ.����");
			}
			if ("��ʷ".equals(list.get(i).getTypeName()) || "����".equals(list.get(i).getTypeName())) {
				list.get(i).setTypeName("��ʷ.����");
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
	 * �°�
	 */
	@Override
	public List<BookDto> getMonthTop() {
		return bookMapper.monthTopTen();
	}

	/**
	 * �ܰ�
	 */
	@Override
	public List<BookDto> getWeekTop() {
		return bookMapper.weekTopTen();
	}

	/**
	 * �༭�Ƽ�
	 */
	@Override
	public List<BookDto> getEditerRecom() {
		return bookMapper.editerRecom();
	}

	/**
	 * �����Ƽ�
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
					listVal.get(k).setTypeName("�ִ�����");
					break;
				case 1:
					listVal.get(k).setTypeName("�Ŵ�����");
					break;
				case 2:
					listVal.get(k).setTypeName("�Ե��ܲ�");
					break;
				case 3:
					listVal.get(k).setTypeName("������Ե");
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
	 * ��������
	 */
	@Override
	public List<BookDto> getHotWriteing() {
		return bookMapper.hotWriteing();
	}

	/**
	 * �����걾
	 */
	@Override
	public List<BookDto> getBookOver() {
		return bookMapper.bookOver();
	}

	/**
	 * ��ȡ���¸���
	 */
	@Override
	public List<BookDto> getUpdateLeast() {
		List<BookDto> list = bookMapper.updateLeast();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getLastestChapter() == null) {
				Chapter chapter = new Chapter();
				chapter.setChapterName("��Ϣ���죬����޸�");
				list.get(i).setChapter(chapter);
			} else {
				//��ȡ�����½�
				Chapter chapter = chapterServiceImpl.getLeast(list.get(i).getLastestChapter());
				list.get(i).setChapter(chapter);
			}

		}

		return list;
	}

	
	/**
	 * ��ȡĳһ����ľ�����Ϣ
	 */
	@Override
	public BookDto getBookInfo(int id) {
		return bookMapper.selectByPrimaryKey(id);
	}

}
