package com.test.dao;

import com.github.yulichang.base.MPJBaseMapper;
import com.test.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao extends MPJBaseMapper<UserInfo> {
//    @Select("select * from user_info where id = #{id}")
//    public User getById(Integer id);
    List<UserInfo> selectAll();
}
