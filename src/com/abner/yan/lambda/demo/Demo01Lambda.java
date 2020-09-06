package com.abner.yan.lambda.demo;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/27 22:10
 * @Description: 使用lambda优化日志案例
 * lambda的特点：延迟加载
 * lambda的使用前提必须是存在函数接口
 */
public class Demo01Lambda {
    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.builderMessage());

        }
    }

    public static void main(String[] args) {
        String st1 = "1";
        String st2 = "2";
        String st3 = "3";

        showLog(1, () -> st1 + st2 + st3);
    }


}
