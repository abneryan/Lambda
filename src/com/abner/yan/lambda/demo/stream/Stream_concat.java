package com.abner.yan.lambda.demo.stream;

import java.util.stream.Stream;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 15:43
 * @Description:
 */
public class Stream_concat {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        Stream<Integer> stream1 = Stream.of(6, 7, 8, 22);
        Stream<Integer> concat = Stream.concat(stream, stream1);
        concat.forEach(s-> System.out.println(s));
    }
}
