package com.abner.yan.lambda.demo.consumer;

import java.util.function.Consumer;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 12:26
 * @Description:
 * 输出：
 * 姓名：张三  性别：男
 * 姓名：丽丽  性别：女
 */
public class Demo03ConsumerAndThen {
    public static void printInfo(String[] strings, Consumer<String> consumer1, Consumer<String> consumer2) {
        for (String string : strings) {
            consumer1.andThen(consumer2).accept(string);
        }
    }

    public static void main(String[] args) {
        String[] infos = {"张三,男", "丽丽,女"};
        printInfo(infos, (info) -> {
                   String name =  info.split(",")[0];
                    System.out.printf("姓名：" + name);
                },
                (info) -> {
                    String sex =  info.split(",")[1];
                    System.out.println("  性别：" + sex);
                });
    }
}
