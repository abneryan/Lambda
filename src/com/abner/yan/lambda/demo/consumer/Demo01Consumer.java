package com.abner.yan.lambda.demo.consumer;

import java.util.function.Consumer;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 11:30
 * @Description:
 */
public class Demo01Consumer {
    public static void getName(String name , Consumer<String> consumer){
        consumer.accept(name);
    }

    public static void main(String[] args) {
        getName("张三", (name) ->{
            StringBuffer stringBuffer = new StringBuffer(name).reverse();
            System.out.printf(stringBuffer.toString());
        });
    }
}
