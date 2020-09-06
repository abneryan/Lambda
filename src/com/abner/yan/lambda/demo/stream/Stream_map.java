package com.abner.yan.lambda.demo.stream;

import java.util.stream.Stream;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 15:43
 * @Description:
 */
public class Stream_map {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        Stream<Integer> integerStream = stream.map(s -> s + 'a');
        integerStream.forEach((s)-> System.out.println(s));

    }
}
