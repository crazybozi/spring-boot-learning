package com.ffz.boot.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  *Classname com.ffz.boot.mybatis.domain.Course
  *Author ffz
  *Data 2021-03-30
  *Description
  */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    /**
    * 课程id
    */
    private Integer courseId;

    /**
    * 课程名称
    */
    private String courseName;
}