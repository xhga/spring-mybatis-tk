package com.luck.dao;

import com.luck.pojo.Record;
import com.luck.pojo.Users;
import com.luck.service.RecordService;
import com.luck.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Hua wb on 2018/7/26.
 * 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config-db.xml"})
public class UsersMapperTest {
    @Autowired
    UsersMapper usersMapper;
    @Autowired
    UsersService usersService;
    @Autowired
    RecordMapper recordMapper;
    @Autowired
    RecordService recordService;

    @Test
    public void selectByPrimaryKey() throws Exception {
        int a = 5;
        Users users = usersMapper.selectByPrimaryKey(a);
        System.out.println(users);
    }
    @Test
    public void getUser(){
        Users user = usersService.getUser(5);
        System.out.println(user);
    }
    @Test
    public void recordsMapper() throws Exception {
        List<Record> records = recordMapper.selectAll();
        System.out.println(records);
    }

    @Test
    public void recordService(){
        Record record = recordService.selectByPrimaryKey(1);
        System.out.println(record);

    }


}
