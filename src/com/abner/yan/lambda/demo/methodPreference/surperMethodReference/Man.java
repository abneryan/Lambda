package com.abner.yan.lambda.demo.methodPreference.surperMethodReference;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 17:00
 * @Description:调用父类中方法
 */
public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("我是man");
    }

    public void show() {
        //1
         /* method(()->{
            Human human = new Human();
            human.sayHello();
        });*/
        //2
        /*method(()->{
            super.sayHello();
        });*/
        //3
        method(super::sayHello);
    }

    public static void method(PintTable pintTable) {
        pintTable.sayHello();
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
