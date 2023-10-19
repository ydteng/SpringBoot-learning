package com.springbootInit.dto.GetAll;

import lombok.Data;

import javax.validation.constraints.Min;

/**
 * 用户页面查询dto
 *
 * @author ydteng
 * @date 2023/08/12
 */
@Data
public class UserPageQueryDto {
    @Min(value = 5, message = "ID 必须是大于5的整数")
    private Integer id;
}
