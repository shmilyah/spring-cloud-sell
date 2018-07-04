package com.geny.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author shmilyahu
 * @date 2018/6/9 22:22
 */
@Data
@Entity
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    private String productDescription;

    private String productIcon;

    //状态，0正常，1下架
    private Integer productStatus;

    //类目编号
    private Integer category_type;

    private Date createTime;

    private Date updateTime;


}
