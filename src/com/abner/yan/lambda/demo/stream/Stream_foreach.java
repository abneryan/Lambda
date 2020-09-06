package com.abner.yan.lambda.demo.stream;

import java.util.stream.Stream;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 15:43
 * @Description:
 */
public class Stream_foreach {
    public static void main(String[] args) {
        Stream.of("张三","李四","王五").forEach(s -> System.out.println(s));
    }
}
