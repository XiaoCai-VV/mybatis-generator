package com.mybatis.dao;

import com.mybatis.entity.Blog;

public interface BlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    int deleteByPrimaryKey(Long bid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    int insert(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    int insertSelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    Blog selectByPrimaryKey(Long bid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbg.generated Fri May 15 23:07:10 CST 2020
     */
    int updateByPrimaryKey(Blog record);
}