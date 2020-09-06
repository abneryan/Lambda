package com.abner.yan.lambda.demo.function;

import java.util.function.Function;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 14:36
 * @Description:
 */
public class Demo01Function {
    public static void change(String s, Function<String, Integer> function) {
        int result = function.apply(s);
        System.out.print(result);
    }

    public static void main(String[] args) {
        change("123", (str) -> Integer.valueOf(str));
    }
}
