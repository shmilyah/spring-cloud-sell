package com.geny.user.vo;

import lombok.Data;

/**
 * @author shmilyahu
 * @date 2018/6/10 15:07
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
