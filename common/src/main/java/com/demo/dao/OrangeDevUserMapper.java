package com.demo.dao;

import com.demo.entity.OrangeDevUser;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
*
* @description TODO
*
* @author: Administrator
*
* @create: 2021-11-16 20:45:08
*
**/
@Mapper
@Repository
public interface OrangeDevUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(OrangeDevUser record);

    int insertOrUpdate(OrangeDevUser record);

    int insertOrUpdateSelective(OrangeDevUser record);

    int insertSelective(OrangeDevUser record);

    OrangeDevUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(OrangeDevUser record);

    int updateByPrimaryKey(OrangeDevUser record);

    int updateBatch(List<OrangeDevUser> list);

    int updateBatchSelective(List<OrangeDevUser> list);

    int batchInsert(@Param("list") List<OrangeDevUser> list);
}
