package com.geny.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author shmilyahu
 * @date 2018/6/10 13:10
 */
@Data
@Entity
public class OrderMaster {

    @Id
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    //买家微信OpenID
    private String buyerOpenid;

    //点单总金额
    private BigDecimal orderAmount;

    //订单状态，默认0：新下单
    private Integer orderStatus;

    //支付状态，默认0：未支付
    private Integer payStatus;

    private Date createTime;

    private Date updateTime;
}
