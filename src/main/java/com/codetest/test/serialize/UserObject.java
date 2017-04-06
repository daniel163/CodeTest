package com.codetest.test.serialize;

import java.io.Serializable;

/**
 * Created by nickzhang on 2017/4/6.
 */
public class UserObject implements Serializable{

    private static final long serialVersionUID = 5665497591428770419L;

    private String username;
    private String password;
    private Integer age;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
