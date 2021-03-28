package com.ffz.boot.mybatis.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  *Classname com.ffz.boot.mybatis.domain.Student
  *Author ffz
  *Data 2021-03-28
  *Description
  */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student1 {
    /**
    * 学生id
    */
    private Integer studentId;

    /**
    * 学生所属班级的id
    */
    private Integer clazzId;

    /**
    * 学生姓名
    */
    private String studentName;

    /**
    * 学生籍贯
    */
    private String hometown;

    /**
    * 出生日期
    */
//    @JsonIgnore
    private LocalDate birthday;

    /**
     * 学生和班级多对一
     */
//    @JsonIgnore
    private Clazz clazz;

    /**
     * 学生和课程多对多
     */
//    @JsonIgnore
    private List<Course> courses;
}