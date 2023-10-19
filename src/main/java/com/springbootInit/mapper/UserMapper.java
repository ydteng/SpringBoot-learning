package com.springbootInit.mapper;

import com.springbootInit.domain.UserInfo;
import com.springbootInit.dto.GetAll.UserPageResultDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserPageResultDto toDto(UserInfo userInfo);
}
