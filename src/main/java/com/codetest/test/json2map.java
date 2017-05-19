package com.codetest.test;

import com.alibaba.fastjson.JSONObject;
import com.codetest.test.utils.JsonUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by nickzhang on 2017/4/21.
 */
public class json2map {
    public static void main(String[] args) {
        String jsonData = "{\"101\": {\"BRAND\": \"default$equal\",\"PRODUCT\": \"default$equal\",\"SDK_INT\": \"23$ge\"},\"102\": {\"BRAND\": \"samsung$equal\",\"SDK_INT\": \"23$ge\",\"SECOND_SD\": \"true$equal\"}}";
        Map<String, Object> map = JsonUtils.convertJsonStrToMap(jsonData);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }


        /*Integer id = MapUtils.getInteger(map, "id");
        Object list = MapUtils.getObject(map, "list");
        List<JSONObject> ll = (List)list;
        for (JSONObject s : ll) {
            String eleVal = s.get("a").toString();
            System.out.println(s+"---a的值是："+eleVal);
        }*/
    }
}
