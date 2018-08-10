package com.luck.service;

import com.luck.api.RecordManager;
import com.luck.dao.RecordMapper;
import com.luck.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Hua wb on 2018/8/10.
 */
@Service
public class RecordService implements RecordManager{
    @Autowired
    RecordMapper recordMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Record record) {
        return recordMapper.insert(record);
    }

    @Override
    public int insertSelective(Record record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public Record selectByPrimaryKey(Integer id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Record record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Record record) {
        return recordMapper.updateByPrimaryKey(record);
    }
}
