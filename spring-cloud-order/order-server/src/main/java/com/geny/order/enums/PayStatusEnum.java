package com.geny.order.enums;

import lombok.Getter;

/**
 * @author shmilyahu
 * @date 2018/6/10 13:30
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
