package com.ffz.boot.mybatis.controller;

import com.ffz.boot.mybatis.controller.dto.AjaxResponse;
import com.ffz.boot.mybatis.mapper.Student1Mapper;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Classname com.ffz.boot.mybatis.controller.dto.StudentController
 * Author ffz
 * Data 2021-03-28
 * Description
 */
@RestController
@RequestMapping(value = "/api/v1/student")
@Slf4j
@Validated
public class StudentController {

    @Resource
    private Student1Mapper studentMapper;


    @ApiOperation("路径传参")
    @GetMapping("{id}")
    public AjaxResponse getClazz(@PathVariable("id") int id) {
        return AjaxResponse.success(studentMapper.getStudent(id));
    }
}