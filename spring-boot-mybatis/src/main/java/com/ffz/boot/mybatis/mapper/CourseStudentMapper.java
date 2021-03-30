package com.ffz.boot.mybatis.mapper;

import com.ffz.boot.mybatis.domain.CourseStudent;

/**
  *Classname com.ffz.boot.mybatis.mapper.CourseStudentMapper
  *Author ffz
  *Data 2021-03-30
  *Description
  */
public interface CourseStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseStudent record);

    int insertSelective(CourseStudent record);

    CourseStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseStudent record);

    int updateByPrimaryKey(CourseStudent record);
}