package com.abner.yan.lambda.demo.function;

import java.util.function.Function;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 14:46
 * @Description:
 */
public class Demo02Function_andThan {
    public static void change(String str, Function<String, Integer> function1, Function<Integer, String> function2) {
        String result = function1.andThen(function2).apply(str);
        System.out.print(result);
    }

    public static void main(String[] args) {
        change("123", (str) -> Integer.valueOf(str) + 10, (str) -> str + "");
    }
}
