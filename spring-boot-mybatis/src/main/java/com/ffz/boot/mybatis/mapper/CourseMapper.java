package com.ffz.boot.mybatis.mapper;

import com.ffz.boot.mybatis.domain.Course;

import java.util.List;

/**
  *Classname com.ffz.boot.mybatis.mapper.CourseMapper
  *Author ffz
  *Data 2021-03-30
  *Description
  */
public interface CourseMapper {
    /**
     * 查询所有课程（同时关联查询出每门课程的选课学生）
     *
     * @return List<Course>
     */
    List<Course> seletAll();
}