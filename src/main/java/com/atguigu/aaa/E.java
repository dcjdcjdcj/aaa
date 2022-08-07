package com.atguigu.aaa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public abstract  class E {
    @RequestMapping("e")
    @ResponseBody
    public  String  e(){

//        System.out.println("额e" );
        boolean flag=true;
        System.out.println("eeeee");
        if(flag){
            System.out.println("flag = " + flag);

        }
        return "eee";
    }


}
