package com.zhupp.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PageQueryParam<T> {
    /**
     * 参数
     */
    private T param;
    /**
     * 当前页
     */
    private Integer pageNo;
    /**
     * 每页的数量
     */
    private Integer pageSize;

}
