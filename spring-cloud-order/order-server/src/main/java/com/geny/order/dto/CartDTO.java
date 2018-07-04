package com.geny.order.dto;

import lombok.Data;

/**
 * @author shmilyahu
 * @date 2018/6/10 23:36
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
