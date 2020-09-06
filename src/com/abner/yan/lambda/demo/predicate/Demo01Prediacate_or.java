package com.abner.yan.lambda.demo.predicate;

import java.util.function.Predicate;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 12:57
 * @Description:
 */
public class Demo01Prediacate_or {
    public static boolean checkString(String string, Predicate<String> predicate1, Predicate<String> predicate2) {
        return predicate1.or(predicate2).test(string);
    }

    public static void main(String[] args) {
        boolean result = checkString("abcdef",
                (str) ->
                        str.length() > 8,
                (str) ->
                        str.contains("a")
        );
        System.out.print(result);
    }
}
