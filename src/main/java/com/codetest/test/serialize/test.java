package com.codetest.test.serialize;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * Created by nickzhang on 2017/4/6.
 * 序列化和反序列化
 */
public class test {

    private final static Serializer serializer = new FstSerializer();

    public static void main(String[] args) throws Exception{
        UserObject userObject = new UserObject();
        userObject.setUsername("nickzhang");
        userObject.setPassword("123");
        userObject.setAge(30);
        userObject.setAddress("shenzhen");
        byte[] bytes = serializer.serialize(userObject);
        System.out.println("序列化后的数据 byte :" + Arrays.toString(bytes));
        System.out.println("序列化后的数据 String :" + JSON.toJSONString(bytes));
        UserObject userObject1 =  serializer.deserialize(bytes);
        System.out.println("反序列化之后的数据 jsonObject : " + JSON.toJSONString(userObject1));
    }
}
