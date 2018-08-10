package com.luck.api;

import com.luck.pojo.Record;

/**
 * Created by Hua wb on 2018/8/10.
 */
public interface RecordManager {

    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}
