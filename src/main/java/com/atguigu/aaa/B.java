package com.atguigu.aaa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Student{
    private  Integer age;
    private  String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class B {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setAge(i);
            student.setName(i+"ss");
            map.put(i+"",student);
        }
      /*for (Map.Entry<String,Student> entry:map.entrySet()){
          System.out.println("key = " + entry.getKey()+",value="+entry.getValue().getName());
      }*/
      /*  for (String key:map.keySet()) {
            System.out.println("key = " + key);
        }
        for (Student value:map.values()) {
            System.out.println("value.getName() = " + value.getName());

        }*/
      /*  Iterator<Map.Entry<String, Student>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Student> entry = iterator.next();
            System.out.println("key = " + entry.getKey()+",value="+entry.getValue().getName());
        }*/
        for (String key:map.keySet()) {
            Student student = map.get(key);
            System.out.println("key = " + key+",value="+student.getName());
        }
    }
}
