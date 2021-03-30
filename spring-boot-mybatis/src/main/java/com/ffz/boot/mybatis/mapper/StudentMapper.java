package com.ffz.boot.mybatis.mapper;

import com.ffz.boot.mybatis.domain.Student;

/**
  *Classname com.ffz.boot.mybatis.mapper.StudentMapper
  *Author ffz
  *Data 2021-03-30
  *Description
  */
public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}