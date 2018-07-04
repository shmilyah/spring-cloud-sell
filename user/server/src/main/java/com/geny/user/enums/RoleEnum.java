package com.geny.user.enums;

import lombok.Getter;

/**
 * @author shmilyahu
 * @date 2018/6/10 23:41
 */
@Getter
public enum RoleEnum {
    BUYER(1, "买家"),
    SELLER(2, "卖家"),
    ;

    private Integer code;

    private String msg;

    RoleEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
