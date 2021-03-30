package com.ffz.boot.mybatis.mapper;

import com.ffz.boot.mybatis.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classname com.ffz.boot.mybatis.mapper.TeacherMapperTest
 * Author ffz
 * Data 2021-03-30
 * Description
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {
    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void selectAll() {
        List<Teacher> teacherList = teacherMapper.selectAll();
        System.out.println(teacherList);
    }

    @Test
    void findAll() {
        List<Teacher> teacherList = teacherMapper.selectAll();
        System.out.println(teacherList);
    }

    @Test
    void insertTeacher() {
        Teacher teacher = Teacher.builder().teacherName("李老师").clazzId(1).build();
        teacherMapper.insertTeacher(teacher);
    }
}