package com.ffz.boot.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classname com.ffz.boot.mybatis.domain.Teacher
 * Author ffz
 * Data 2021-03-30
 * Description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 教师姓名name
     */
    private String teacherName;

    /**
     * 教师管理的班级id
     */
    private Integer clazzId;
}
