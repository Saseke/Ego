package com.yoke.ego.common.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Yoke on 2018/3/19
 */
public interface BaseService<Record, Example> {
    long countByExample(Example example);

    int deleteByExample(Example example);

    int deleteByPrimaryKey(Long id);

    int insert(Record record);

    int insertSelective(Record record);

    List<Record> selectByExampleWithBLOBs(Example example);

    List<Record> selectByExample(Example example);

    Record selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example);

    int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") Example example);

    int updateByExample(@Param("record") Record record, @Param("example") Example example);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKeyWithBLOBs(Record record);

    int updateByPrimaryKey(Record record);
}
