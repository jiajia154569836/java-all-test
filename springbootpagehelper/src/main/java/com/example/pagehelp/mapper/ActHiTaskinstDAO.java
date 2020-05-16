package com.example.pagehelp.mapper;

import com.example.pagehelp.model.ActHiTaskinst;
import com.example.pagehelp.model.ActHiTaskinstExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ActHiTaskinstDAO继承基类
 */
@Mapper
@Repository
public interface ActHiTaskinstDAO extends MyBatisBaseDao<ActHiTaskinst, String, ActHiTaskinstExample> {
}