package com.geny.order.enums;

import lombok.Getter;

/**
 * @author shmilyahu
 * @date 2018/6/10 13:25
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完成"),
    CANCEL(2, "取消"),
    ;

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
