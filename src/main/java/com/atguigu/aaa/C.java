package com.atguigu.aaa;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class C {
    @RequestMapping("a")
    @ResponseBody
    public  String  c(){
        System.out.println("true = " + true);
        return "hhh";
    }
}
