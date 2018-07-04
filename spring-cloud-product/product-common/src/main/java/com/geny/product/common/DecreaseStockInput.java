package com.geny.product.common;

import lombok.Data;

/**
 * @author shmilyahu
 * @date 2018/6/16 14:11
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
