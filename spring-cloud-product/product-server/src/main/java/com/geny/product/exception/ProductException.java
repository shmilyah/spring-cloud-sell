package com.geny.product.exception;

import com.geny.product.enums.ResultEnum;

/**
 * @author shmilyahu
 * @date 2018/6/10 23:40
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
