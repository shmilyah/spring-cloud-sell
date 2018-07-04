package com.geny.product.utils;

import com.geny.product.vo.ResultVO;

/**
 * @author shmilyahu
 * @date 2018/6/10 0:14
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
