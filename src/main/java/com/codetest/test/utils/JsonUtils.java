package com.codetest.test.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.Map;

/**
 * Created by nickzhang on 2017/4/21.
 */
public class JsonUtils {

    /**
     * 将json转化成map
     * @param jsonStr
     * @return
     */
    public static Map<String, Object> convertJsonStrToMap(String jsonStr){
        Map<String, Object> map = JSON.parseObject(
                jsonStr,new TypeReference<Map<String,Object>>(){} );
        return map;
    }

}
