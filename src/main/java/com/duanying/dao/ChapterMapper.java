package com.duanying.dao;

import com.duanying.model.Chapter;

public interface ChapterMapper {
	
	Chapter chapterLeast(int id);
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbg.generated
     */
    int insert(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbg.generated
     */
    int insertSelective(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbg.generated
     */
    Chapter selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Chapter record);
}