package com.geny.product.enums;

import lombok.Getter;

/**
 * @author shmilyahu
 * @date 2018/6/9 23:14
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
