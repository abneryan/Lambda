package com.abner.yan.lambda.demo.predicate;

import java.util.function.Predicate;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 12:57
 * @Description:
 */
public class Demo01Prediacate_negate {
    public static boolean checkString(String string, Predicate<String> predicate1) {
        return predicate1.negate().test(string);
    }

    public static void main(String[] args) {
        boolean result = checkString("abcdef",
                (str) -> str.length() > 2
        );
        System.out.print(result);
    }
}
