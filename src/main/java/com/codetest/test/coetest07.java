package com.codetest.test;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by nickzhang on 2017/5/10.
 */
public class coetest07 {
    public static void main(String[] args) {

        String str = "c68809fa68503a51";

        int clientNum = Integer.parseInt(StringUtils.substring(str, str.length() - 2), 16);

        System.out.println("clientNum = " + clientNum);
    }
}
