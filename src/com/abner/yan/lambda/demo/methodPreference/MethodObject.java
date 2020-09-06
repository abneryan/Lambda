package com.abner.yan.lambda.demo.methodPreference;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 16:40
 * @Description:ln
 */
public class MethodObject {
    public void printLog(String s){
        System.out.println(s.toUpperCase());
    }

    public static void printLog1(String s){
        System.out.println(s.toUpperCase());
    }
}
