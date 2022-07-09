package com.atguigu.aaa;



import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.*;

@Component

public class A  {
    public static void main(String[] args) {
//        Tran
//         Collection
        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal bigDecimal1 = new BigDecimal(3);

        String a="111";

//        String a="3333";
        StringBuilder stringBuilder = new StringBuilder("ss");
        stringBuilder.append("dd");
        StringBuffer stringBuffer = new StringBuffer();
        String string = new String();

        ArrayList<Object> objects = new ArrayList<>();
        LinkedList<Object> objects1 = new LinkedList<>();
        Vector<Object> objects2 = new Vector<>();
        HashMap<Object, Object> map = new HashMap<>();
        System.out.println(stringBuilder);
        System.out.println(a);
        System.out.println(bigDecimal1.compareTo(bigDecimal));
    }
}
