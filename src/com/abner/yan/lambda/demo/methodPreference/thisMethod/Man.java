package com.abner.yan.lambda.demo.methodPreference.thisMethod;

import com.abner.yan.lambda.demo.methodPreference.surperMethodReference.PintTable;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 17:00
 * @Description:调用父类中方法
 */
public class Man {
    public void sayHello(){
        System.out.println("我是man");
    }

    public void show() {
        //1
        method(()->this.sayHello());
        //2
        method(this::sayHello);
    }

    public static void method(PintTable pintTable) {
        pintTable.sayHello();
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
