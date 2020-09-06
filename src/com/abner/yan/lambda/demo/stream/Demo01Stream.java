package com.abner.yan.lambda.demo.stream;

import java.util.ArrayList;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 15:05
 * @Description:
 */
public class Demo01Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("小淘气");
        list.add("张三丰");
        list.stream().filter(s -> s.length() == 3)
                .filter(s -> s.startsWith("张"))
                .forEach(s -> System.out.println(s));
    }
}
