package com.ffz.boot.mybatis.mapper;

import com.ffz.boot.mybatis.domain.Clazz;

/**
  *Classname com.ffz.boot.mybatis.mapper.ClazzMapper
  *Author ffz
  *Data 2021-03-30
  *Description
  */
public interface ClazzMapper {
    int deleteByPrimaryKey(Integer clazzId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer clazzId);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}