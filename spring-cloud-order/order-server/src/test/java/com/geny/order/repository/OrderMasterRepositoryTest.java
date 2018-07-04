package com.geny.order.repository;

import com.geny.order.entity.OrderMaster;
import com.geny.order.enums.OrderStatusEnum;
import com.geny.order.enums.PayStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @author shmilyahu
 * @date 2018/6/10 13:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("12121212");
        orderMaster.setBuyerName("zhangsan");
        orderMaster.setBuyerPhone("15955126464");
        orderMaster.setBuyerAddress("shanghai");
        orderMaster.setBuyerOpenid("111111");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        OrderMaster result = orderMasterRepository.save(orderMaster);
    }
}