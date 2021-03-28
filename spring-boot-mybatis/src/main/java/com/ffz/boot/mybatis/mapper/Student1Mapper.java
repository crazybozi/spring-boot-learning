package com.ffz.boot.mybatis.mapper;

import com.ffz.boot.mybatis.domain.Student1;

/**
  *Classname com.ffz.boot.mybatis.mapper.StudentMapper
  *Author ffz
  *Data 2021-03-28
  *Description
  */
public interface Student1Mapper {

    /**
     * 根据学生id查询（关联查询出所属班级信息)
     * @param studentId 学生id
     * @return student对象
     */
    Student1 getStudent(int studentId);
}