package com.geny.order.service;

import com.geny.order.dto.OrderDTO;

/**
 * @author shmilyahu
 * @date 2018/6/10 14:36
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);

    OrderDTO finish(String orderId);
}
