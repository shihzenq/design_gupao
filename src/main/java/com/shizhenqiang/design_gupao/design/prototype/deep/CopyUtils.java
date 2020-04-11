package com.shizhenqiang.design_gupao.design.prototype.deep;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class CopyUtils {


    public static <T> T covert(Object source, Class<T> target) {
        return JSON.parseObject(JSONObject.toJSONString(source), target);
    }
}
