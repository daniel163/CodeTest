package com.codetest.test;

import java.util.Arrays;

/**
 * Created by nickzhang on 2017/5/5.
 */
public class codetest06 {

    public static void main(String[] args) {
        String str = "SDK_INT=23,BRAND=samsung,MODEL=xt1085,DEVICE=victara,DISPLAY=cm_victara_retcn-userdebug 6.0.1 mob30j 9e32da05bf test-keys,MANUFACTURER=motorola,PRODUCT=cm_victara_retcn,SECOND_SD=false";

        String[] strs = str.split(",");

        System.out.println(Arrays.toString(strs));

    }
}
