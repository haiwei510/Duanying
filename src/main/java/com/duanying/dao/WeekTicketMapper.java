package com.duanying.dao;

import com.duanying.model.WeekTicket;

public interface WeekTicketMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_week_ticket
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_week_ticket
     *
     * @mbg.generated
     */
    int insert(WeekTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_week_ticket
     *
     * @mbg.generated
     */
    int insertSelective(WeekTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_week_ticket
     *
     * @mbg.generated
     */
    WeekTicket selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_week_ticket
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(WeekTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_week_ticket
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(WeekTicket record);
}