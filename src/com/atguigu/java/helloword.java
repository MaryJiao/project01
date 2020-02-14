package com.atguigu.java;

import java.util.HashMap;
import java.util.Map;

public class helloword {
    public static  void main(String [] args){
        for (int i = 0; i <100; i++) {
            System.out.println("i = " + i);
        }
        Map<String,String> map=new HashMap<>();
        map.put("name","aa");
        map.put("age","17");
        map.put("school","qinghua");
        map.put("major","math");

        String age=map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
    }
}
