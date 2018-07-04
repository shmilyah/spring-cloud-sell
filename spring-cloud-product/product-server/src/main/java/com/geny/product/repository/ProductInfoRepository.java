package com.geny.product.repository;

import com.geny.product.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author shmilyahu
 * @date 2018/6/9 22:39
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {


    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
