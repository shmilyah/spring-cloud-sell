package com.geny.product.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author shmilyahu
 * @date 2018/6/9 23:34
 */
@Data
public class ResultVO<T> {

    //返回状态码
    private Integer code;

    //返回提示信息
    private String msg;

    //返回具体内容
    private T data;
}
