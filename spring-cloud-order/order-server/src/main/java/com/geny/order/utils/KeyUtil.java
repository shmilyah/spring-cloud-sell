package com.geny.order.utils;

import java.util.Random;

/**
 * @author shmilyahu
 * @date 2018/6/10 14:47
 */
public class KeyUtil {

    /**
     * 生产唯一主键
     * 格式：时间+随机数
     */
    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
