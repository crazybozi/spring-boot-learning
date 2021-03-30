package com.ffz.boot.mybatis.domain;

import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

/**
  *Classname com.ffz.boot.mybatis.domain.Student
  *Author ffz
  *Data 2021-03-30
  *Description
  */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    /**
    * 学生id
    */
    private Integer studentId;

    /**
    * 学生所属班级id
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
    private LocalDate birthday;

    private Integer teacherId;
}