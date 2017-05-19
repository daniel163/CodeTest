package com.codetest.test;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by nickzhang on 2017/4/17.
 */
public class codetest04 {
    public static void main(String[] args) {
        String android = "c68809fa68503a51";
        System.out.println(Integer.parseInt("51",16));
        System.out.println(StringUtils.substring(android, android.length() - 2));
        float res = 255*(20/100f);
        System.out.println(res);
        System.out.println(StringUtils.substring("50%", 0 ,"50%".length() - 1));
    }
}
