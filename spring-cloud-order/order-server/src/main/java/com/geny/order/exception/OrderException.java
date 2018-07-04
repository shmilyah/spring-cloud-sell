package com.geny.order.exception;

import com.geny.order.enums.ResultEnum;

/**
 * @author shmilyahu
 * @date 2018/6/10 15:16
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
