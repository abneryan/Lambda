package com.abner.yan.lambda.demo.methodPreference.arrayMethod;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 18:24
 * @Description:
 */
public class Demo {
    public static void creatArray(int lenght, ArrayBuilder arrayBuilder){
        int[] ints = arrayBuilder.creatArray(lenght);
        System.out.println("ints:" + ints.length);
    }

    public static void main(String[] args) {
        creatArray(10,lenght -> new int[lenght]);

        creatArray(10,int[]::new);
    }
}
