package com.duanying.service;

import java.util.List;

import com.duanying.impl.dto.BookDto;

public interface BookService {
	
	/**
	 * ���ŷ���
	 * @return
	 */
	List<BookDto> getlist();
	
	/**
	 * �°�
	 * @return
	 */
	List<BookDto> getMonthTop();
	/**
	 * �ܰ�
	 * @return
	 */
	List<BookDto> getWeekTop();
	/**
	 * �༭�Ƽ�
	 * @return
	 */
	List<BookDto> getEditerRecom();
	
	/**
	 * �����ر��Ƽ�
	 * @return
	 */
	List<BookDto> getRomantic();
	/**
	 * ��������
	 * @return
	 */
	List<BookDto> getHotWriteing();
	/**
	 * �����걾
	 * @return
	 */
	List<BookDto> getBookOver();
	/**
	 * ���¸���
	 */
	List<BookDto> getUpdateLeast();
	
	/**
	 * ����ID��ȡĳһ����ľ�����Ϣ
	 * @return
	 */
	BookDto getBookInfo(int id);
	
}
