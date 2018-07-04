package com.geny.user.enums;

import lombok.Getter;

/**
 * @author shmilyahu
 * @date 2018/6/10 23:41
 */
@Getter
public enum ResultEnum {
    LOGIN_FAIL(1, "登录失败"),
    ROLE_ERROR(2, "角色权限有误"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
