package com.duanying.model;

public class BookTypeKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_book_type.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_book_type.type_name
     *
     * @mbg.generated
     */
    private String typeName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_book_type.id
     *
     * @return the value of t_book_type.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_book_type.id
     *
     * @param id the value for t_book_type.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_book_type.type_name
     *
     * @return the value of t_book_type.type_name
     *
     * @mbg.generated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_book_type.type_name
     *
     * @param typeName the value for t_book_type.type_name
     *
     * @mbg.generated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}