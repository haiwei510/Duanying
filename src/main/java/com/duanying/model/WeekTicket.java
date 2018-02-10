package com.duanying.model;

import java.util.Date;

public class WeekTicket {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_week_ticket.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_week_ticket.w_ticket_count
     *
     * @mbg.generated
     */
    private Integer wTicketCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_week_ticket.book_id
     *
     * @mbg.generated
     */
    private Integer bookId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_week_ticket.date_week
     *
     * @mbg.generated
     */
    private Date dateWeek;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_week_ticket.id
     *
     * @return the value of t_week_ticket.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_week_ticket.id
     *
     * @param id the value for t_week_ticket.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_week_ticket.w_ticket_count
     *
     * @return the value of t_week_ticket.w_ticket_count
     *
     * @mbg.generated
     */
    public Integer getwTicketCount() {
        return wTicketCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_week_ticket.w_ticket_count
     *
     * @param wTicketCount the value for t_week_ticket.w_ticket_count
     *
     * @mbg.generated
     */
    public void setwTicketCount(Integer wTicketCount) {
        this.wTicketCount = wTicketCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_week_ticket.book_id
     *
     * @return the value of t_week_ticket.book_id
     *
     * @mbg.generated
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_week_ticket.book_id
     *
     * @param bookId the value for t_week_ticket.book_id
     *
     * @mbg.generated
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_week_ticket.date_week
     *
     * @return the value of t_week_ticket.date_week
     *
     * @mbg.generated
     */
    public Date getDateWeek() {
        return dateWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_week_ticket.date_week
     *
     * @param dateWeek the value for t_week_ticket.date_week
     *
     * @mbg.generated
     */
    public void setDateWeek(Date dateWeek) {
        this.dateWeek = dateWeek;
    }
}