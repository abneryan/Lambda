package com.abner.yan.lambda.demo.supplier;

import java.util.function.Supplier;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 11:15
 * @Description:
 */
public class Demo01Supplier {
    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        System.out.println(getString(()->"张三丰"));
    }
}
