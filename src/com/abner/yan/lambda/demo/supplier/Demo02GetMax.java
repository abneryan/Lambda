package com.abner.yan.lambda.demo.supplier;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 11:21
 * @Description:获取数组中最大值
 */
public class Demo02GetMax {
    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] arr = {11,-22,33,1,4};
        int result = getMax(()->{
            int max = arr[0];
            for (int ele:
                 arr) {
                if(ele > max){
                    max = ele;
                }
            }
            return max;
        });
        System.out.println(result);
    }

}
