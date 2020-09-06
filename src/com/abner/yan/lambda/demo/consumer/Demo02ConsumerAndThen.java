package com.abner.yan.lambda.demo.consumer;

import java.util.function.Consumer;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 11:45
 * @Description:
 */
public class Demo02ConsumerAndThen {
    public static void getName(String name, Consumer<String> consumer1,Consumer<String> consumer2){
        //把两个Consumer接口连到一起，
        //再消费数据，consumer1连接consumer2然后生成新的consumer，
        //然后调用新consumer的消费接口，即先调用consumer1然后consumer2
        consumer1.andThen(consumer2).accept(name);
    }

    public static void main(String[] args) {
         getName("lisi" ,(name) ->{
            System.out.println(name.toUpperCase());
        },(name) ->{
            System.out.println(name.toLowerCase());
        });
    }
}
