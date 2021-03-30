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
     *返回所有的Teacher,用注解实现
     *
     *  @return List<Teacher>
     */
    @Select("SELECT * FROM t_teacher")
    List<Teacher> selectAll();

    /**
     * 返回所有的teacher，用xml实现
     * @return List<Teacehr>
     */
    List<Teacher> findAll();

    void insertTeacher(Teacher teacher);
}