package com.luck.dao;

import com.luck.interceptor.TableSplit;
import com.luck.pojo.Users;
import tk.mybatis.mapper.common.Mapper;

@TableSplit(value = "users", strategy = "MM")
public interface UsersMapper extends Mapper<Users>{
}
