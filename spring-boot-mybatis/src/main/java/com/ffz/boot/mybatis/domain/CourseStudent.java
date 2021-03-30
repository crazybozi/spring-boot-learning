package com.ffz.boot.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  *Classname com.ffz.boot.mybatis.domain.CourseStudent
  *Author ffz
  *Data 2021-03-30
  *Description
  */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseStudent {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 课程id
    */
    private Integer courseId;

    /**
    * 学生id
    */
    private Integer studentId;
}