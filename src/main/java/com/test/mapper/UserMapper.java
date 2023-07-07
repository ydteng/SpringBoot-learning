package com.test.mapper;

import com.test.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    List<UserInfo> selectAll();
}
