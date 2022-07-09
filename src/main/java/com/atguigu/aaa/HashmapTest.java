package com.atguigu.aaa;

import java.util.HashMap;

public class HashmapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1","2");
        String result=map.put("1","3");
        System.out.println(result);
    }
}
