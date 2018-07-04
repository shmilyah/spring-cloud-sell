package com.geny.product.service;

import com.geny.product.entity.ProductCategory;

import java.util.List;

/**
 * @author shmilyahu
 * @date 2018/6/9 23:25
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
