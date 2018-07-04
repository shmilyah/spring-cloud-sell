package com.geny.order.repository;

import com.geny.order.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author shmilyahu
 * @date 2018/6/10 13:18
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
