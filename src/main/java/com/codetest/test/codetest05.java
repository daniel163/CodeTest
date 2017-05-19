package com.codetest.test;

import java.util.Arrays;

/**
 * Created by nickzhang on 2017/4/21.
 */
public class codetest05 {
    public static void main(String[] args) {
        String feature = "BRAND=tcl,SDK_INT=23,SECOND_SD=false";
        String[] featureArray = feature.split(",");
        System.out.println(Arrays.toString(featureArray));

        for (int i = 0; i < featureArray.length; i++) {
            System.out.println("key = " + featureArray[i].split("=")[0]);
            System.out.println("value = " + featureArray[i].split("=")[1]);
        }
    }
}
