package com.duanying.dao;

import java.util.List;

import com.duanying.model.BookType;
import com.duanying.model.BookTypeKey;

public interface BookTypeMapper {
	/**
	 * ��ȡ���Զ�������
	 * @return
	 */
	List<BookType> selecToptAll();
	
	List<BookType> selectAll();
	
    int deleteByPrimaryKey(BookTypeKey key);

    int insert(BookType record);
   
    int insertSelective(BookType record);

    BookType selectByPrimaryKey(BookTypeKey key);
 
    int updateByPrimaryKeySelective(BookType record);

    int updateByPrimaryKey(BookType record);
}