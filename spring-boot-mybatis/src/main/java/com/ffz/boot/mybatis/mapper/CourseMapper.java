package com.ffz.boot.mybatis.mapper;

import com.ffz.boot.mybatis.domain.Course;

/**
  *Classname com.ffz.boot.mybatis.mapper.CourseMapper
  *Author ffz
  *Data 2021-03-30
  *Description
  */
public interface CourseMapper {
    int deleteByPrimaryKey(Integer courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer courseId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}