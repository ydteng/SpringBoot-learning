package com.springbootInit.dao;

import com.github.yulichang.base.MPJBaseMapper;
import com.springbootInit.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao extends MPJBaseMapper<UserInfo> {
    List<UserInfo> selectAll();
}
