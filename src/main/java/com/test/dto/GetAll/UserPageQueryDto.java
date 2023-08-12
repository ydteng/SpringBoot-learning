package com.test.dto.GetAll;

import lombok.Data;

import javax.validation.constraints.Min;
@Data
public class UserPageQueryDto {
    @Min(value = 5, message = "ID 必须是大于5的整数")
    private Integer id;
}
