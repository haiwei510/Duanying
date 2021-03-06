package com.duanying.model;

import java.util.Date;

public class Chapter {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chapter.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chapter.book_id
     *
     * @mbg.generated
     */
    private Integer bookId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chapter.chapter_name
     *
     * @mbg.generated
     */
    private String chapterName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chapter.chapter_time
     *
     * @mbg.generated
     */
    private Date chapterTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chapter.txt_count
     *
     * @mbg.generated
     */
    private Integer txtCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chapter.chapter_content
     *
     * @mbg.generated
     */
    private String chapterContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chapter.id
     *
     * @return the value of t_chapter.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chapter.id
     *
     * @param id the value for t_chapter.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chapter.book_id
     *
     * @return the value of t_chapter.book_id
     *
     * @mbg.generated
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chapter.book_id
     *
     * @param bookId the value for t_chapter.book_id
     *
     * @mbg.generated
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chapter.chapter_name
     *
     * @return the value of t_chapter.chapter_name
     *
     * @mbg.generated
     */
    public String getChapterName() {
        return chapterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chapter.chapter_name
     *
     * @param chapterName the value for t_chapter.chapter_name
     *
     * @mbg.generated
     */
    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chapter.chapter_time
     *
     * @return the value of t_chapter.chapter_time
     *
     * @mbg.generated
     */
    public Date getChapterTime() {
        return chapterTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chapter.chapter_time
     *
     * @param chapterTime the value for t_chapter.chapter_time
     *
     * @mbg.generated
     */
    public void setChapterTime(Date chapterTime) {
        this.chapterTime = chapterTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chapter.txt_count
     *
     * @return the value of t_chapter.txt_count
     *
     * @mbg.generated
     */
    public Integer getTxtCount() {
        return txtCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chapter.txt_count
     *
     * @param txtCount the value for t_chapter.txt_count
     *
     * @mbg.generated
     */
    public void setTxtCount(Integer txtCount) {
        this.txtCount = txtCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chapter.chapter_content
     *
     * @return the value of t_chapter.chapter_content
     *
     * @mbg.generated
     */
    public String getChapterContent() {
        return chapterContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chapter.chapter_content
     *
     * @param chapterContent the value for t_chapter.chapter_content
     *
     * @mbg.generated
     */
    public void setChapterContent(String chapterContent) {
        this.chapterContent = chapterContent == null ? null : chapterContent.trim();
    }
}