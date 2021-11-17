package com.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.demo.entity.OrangeDevUser;
import java.util.List;
import com.demo.dao.OrangeDevUserMapper;
/**
*
* @description TODO
*
* @author: Administrator
*
* @create: 2021-11-16 20:45:08
*
**/
@Service
public class OrangeDevUserService{

    @Resource
    private OrangeDevUserMapper orangeDevUserMapper;


    public int deleteByPrimaryKey(Integer userid) {
        return orangeDevUserMapper.deleteByPrimaryKey(userid);
    }


    public int insert(OrangeDevUser record) {
        return orangeDevUserMapper.insert(record);
    }


    public int insertOrUpdate(OrangeDevUser record) {
        return orangeDevUserMapper.insertOrUpdate(record);
    }


    public int insertOrUpdateSelective(OrangeDevUser record) {
        return orangeDevUserMapper.insertOrUpdateSelective(record);
    }


    public int insertSelective(OrangeDevUser record) {
        return orangeDevUserMapper.insertSelective(record);
    }


    public OrangeDevUser selectByPrimaryKey(Integer userid) {
        return orangeDevUserMapper.selectByPrimaryKey(userid);
    }


    public int updateByPrimaryKeySelective(OrangeDevUser record) {
        return orangeDevUserMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(OrangeDevUser record) {
        return orangeDevUserMapper.updateByPrimaryKey(record);
    }


    public int updateBatch(List<OrangeDevUser> list) {
        return orangeDevUserMapper.updateBatch(list);
    }


    public int updateBatchSelective(List<OrangeDevUser> list) {
        return orangeDevUserMapper.updateBatchSelective(list);
    }


    public int batchInsert(List<OrangeDevUser> list) {
        return orangeDevUserMapper.batchInsert(list);
    }

}
