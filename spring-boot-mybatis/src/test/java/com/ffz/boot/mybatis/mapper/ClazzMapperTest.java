package com.ffz.boot.mybatis.mapper;

import com.ffz.boot.mybatis.domain.Clazz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classname com.ffz.boot.mybatis.mapper.ClazzMapperTest
 * Author ffz
 * Data 2021-03-30
 * Description
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ClazzMapperTest {
    @Resource
    private ClazzMapper clazzMapper;

    @Test
    void getClazzOneToMany() {
        Clazz clazz = clazzMapper.getClazzOneToMany(2);
        assertEquals("软件1911", clazz.getClazzName());
        assertEquals(2, clazz.getClazzId());
        assertEquals(1, clazz.getStudents().size());

//        System.out.println(clazz.getClazzId() + "," + clazz.getClazzName());
//        clazz.getStudents().forEach(student -> System.out.println(student.getStudentId() + "," + student.getHometown()));
    }
}