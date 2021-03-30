package com.ffz.boot.mybatis.mapper;

import com.ffz.boot.mybatis.domain.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
  *Classname com.ffz.boot.mybatis.mapper.TeacherMapper
  *Author ffz
  *Data 2021-03-30
  *Description
  */
public interface TeacherMapper {
    /**
     * 教师班级一对一
     * @param teacherId
     * @return teacher对象
     */
    Teacher getTeacherOneByOne(int teacherId);

}