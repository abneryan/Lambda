package com.abner.yan.lambda.demo.predicate;

import java.util.function.Predicate;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 12:49
 * @Description:
 */
public class Demo01Prediacate {
    public static boolean checkString(String string , Predicate<String> predicate){
        return predicate.test(string);
    }

    public static void main(String[] args) {
        boolean result = checkString("zhangsan",(string) ->string.length() >5);
        System.out.print(result);
    }
}
