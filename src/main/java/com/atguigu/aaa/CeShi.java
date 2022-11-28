package com.atguigu.aaa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dcj
 * @Desc
 * @Date 2022/11/25 17:39
 */
public class CeShi {
    public static List<String> a(){
        List<String> a=new ArrayList<>();
        a.add("5");
        a.add("3");
        a.add("6");
        a.add("2");
        a.add("8");
        a.add("1");
        return a;
    }
    public static List<String> b(){
        List<String> b = new ArrayList<>();
        b.add("5");
        b.add("9");
        b.add("2");
        return b;
    }
    public static void main(String[] args) {
        List<String> a = a();
        List<String> b = b();
        int j=0;
        for (int i = 0; i < 3; i++) {
            System.out.println(b.get(i));
            System.out.println("=========");
            System.out.println(a.get(j));
            System.out.println("=========");
            System.out.println(a.get(j+1));
            j = j + 2;
        }
        System.out.println("=========111");
        int x=1;
        int y=2;
        /*double q=(double)x;
        double w=(double)y;*/
        double c=x/y;
        double d=(double)x/(double)y;
        Double z=(double)(x + y)/2;
        System.out.println(c);
        System.out.println(d);
        System.out.println(z);
    }
}
