package com.springbootInit.dto.GetAll;

import lombok.Data;

/**
 * 用户页面结果dto
 *
 * @author ydteng
 * @date 2023/08/12
 */
@Data
public class UserPageResultDto {
    private Integer id;
    private String name;
    private String password;
}
