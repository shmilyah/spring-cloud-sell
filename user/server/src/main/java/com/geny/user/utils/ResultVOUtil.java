package com.geny.user.utils;


import com.geny.user.enums.ResultEnum;
import com.geny.user.vo.ResultVO;

/**
 * @author shmilyahu
 * @date 2018/6/10 19:42
 */
public class ResultVOUtil {

    public static ResultVO success() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO error(ResultEnum resultEnum) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(resultEnum.getMsg());
        return resultVO;
    }
}
