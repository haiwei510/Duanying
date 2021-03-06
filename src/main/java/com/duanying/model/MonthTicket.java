package com.duanying.model;

import java.util.Date;

public class MonthTicket {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_month_ticket.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_month_ticket.m_ticket_count
     *
     * @mbg.generated
     */
    private Integer mTicketCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_month_ticket.book_id
     *
     * @mbg.generated
     */
    private Integer bookId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_month_ticket.date_week
     *
     * @mbg.generated
     */
    private Date dateWeek;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_month_ticket.id
     *
     * @return the value of t_month_ticket.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_month_ticket.id
     *
     * @param id the value for t_month_ticket.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_month_ticket.m_ticket_count
     *
     * @return the value of t_month_ticket.m_ticket_count
     *
     * @mbg.generated
     */
    public Integer getmTicketCount() {
        return mTicketCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_month_ticket.m_ticket_count
     *
     * @param mTicketCount the value for t_month_ticket.m_ticket_count
     *
     * @mbg.generated
     */
    public void setmTicketCount(Integer mTicketCount) {
        this.mTicketCount = mTicketCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_month_ticket.book_id
     *
     * @return the value of t_month_ticket.book_id
     *
     * @mbg.generated
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_month_ticket.book_id
     *
     * @param bookId the value for t_month_ticket.book_id
     *
     * @mbg.generated
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_month_ticket.date_week
     *
     * @return the value of t_month_ticket.date_week
     *
     * @mbg.generated
     */
    public Date getDateWeek() {
        return dateWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_month_ticket.date_week
     *
     * @param dateWeek the value for t_month_ticket.date_week
     *
     * @mbg.generated
     */
    public void setDateWeek(Date dateWeek) {
        this.dateWeek = dateWeek;
    }
}