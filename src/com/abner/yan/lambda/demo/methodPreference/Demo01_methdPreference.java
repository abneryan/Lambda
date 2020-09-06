package com.abner.yan.lambda.demo.methodPreference;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 16:24
 * @Description:
 */
public class Demo01_methdPreference {
    public static void printLog(PrintTable printTable){
        printTable.print("hello");
    }
    public static void main(String[] args) {
        //printLog(s-> System.out.printf(s));
        printLog(System.out::printf);
    }
}
