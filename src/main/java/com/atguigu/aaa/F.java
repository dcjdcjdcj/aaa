package com.atguigu.aaa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class F {
    @RequestMapping("f")
    @ResponseBody
    public  String  f(){

        System.out.println("fffffF");

        return "fff";
    }
}
