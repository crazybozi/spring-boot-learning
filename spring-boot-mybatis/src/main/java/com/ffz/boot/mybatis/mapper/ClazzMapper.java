package com.ffz.boot.mybatis.mapper;

import com.ffz.boot.mybatis.domain.Clazz;

/**
  *Classname com.ffz.boot.mybatis.mapper.ClazzMapper
  *Author ffz
  *Data 2021-03-30
  *Description
  */
public interface ClazzMapper {

    Clazz getClazzOneToMany(int clazzId);
}