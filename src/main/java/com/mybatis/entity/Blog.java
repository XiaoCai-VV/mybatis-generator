package com.mybatis.entity;

import java.io.Serializable;

public class Blog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.bid
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    private Long bid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.name
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.author_id
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    private Long authorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table blog
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.bid
     *
     * @return the value of blog.bid
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    public Long getBid() {
        return bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.bid
     *
     * @param bid the value for blog.bid
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    public void setBid(Long bid) {
        this.bid = bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.name
     *
     * @return the value of blog.name
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.name
     *
     * @param name the value for blog.name
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.author_id
     *
     * @return the value of blog.author_id
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    public Long getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.author_id
     *
     * @param authorId the value for blog.author_id
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}