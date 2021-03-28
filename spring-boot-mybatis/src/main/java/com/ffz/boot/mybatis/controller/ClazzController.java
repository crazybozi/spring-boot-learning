package com.ffz.boot.mybatis.controller;

import com.ffz.boot.mybatis.controller.dto.AjaxResponse;
import com.ffz.boot.mybatis.mapper.ClazzMapper;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Classname com.ffz.boot.mybatis.controller.dto.ClazzController
 * Author ffz
 * Data 2021-03-28
 * Description
 */
@RestController
@RequestMapping(value = "/api/v1/clazz")
@Slf4j
@Validated
public class ClazzController {

    @Resource
    private ClazzMapper clazzMapper;


    @ApiOperation("路径传参")
    @GetMapping("{id}")
    public AjaxResponse getClazz(@PathVariable("id") int id) {
        return AjaxResponse.success(clazzMapper.getClazz(id));
    }

}
