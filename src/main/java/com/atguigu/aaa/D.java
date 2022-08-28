package com.atguigu.aaa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
public class D {
    @RequestMapping("d")
    @ResponseBody
    public  String  d(){
        System.out.println("true = " + true);
        return "ddd";
    }
}
