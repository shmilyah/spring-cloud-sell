package com.geny.product.service;

import com.geny.product.common.DecreaseStockInput;
import com.geny.product.common.ProductInfoOutput;
import com.geny.product.entity.ProductInfo;

import java.util.List;

/**
 * @author shmilyahu
 * @date 2018/6/9 23:10
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
