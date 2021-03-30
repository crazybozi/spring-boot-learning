package com.ffz.boot.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
  *Classname com.ffz.boot.mybatis.domain.Clazz
  *Author ffz
  *Data 2021-03-30
  *Description
  */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {
    /**
    * 班级id
    */
    private Integer clazzId;

    /**
    * 班级名称
    */
    private String clazzName;

    /**
    * 班级管理老师的id
    */
    private Integer teacherId;

    /**
     * 管理班级的教师对象（一对一）
     */
    private Teacher teacher;

    /**
     * 一方里声明多方的集合（一对多）
     */
    private List<Student> students;
}