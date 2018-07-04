package com.geny.order.dto;

import com.geny.order.entity.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author shmilyahu
 * @date 2018/6/10 14:37
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    //买家微信OpenID
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态，默认0：新下单
    private Integer orderStatus;

    //支付状态，默认0：未支付
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;
}
