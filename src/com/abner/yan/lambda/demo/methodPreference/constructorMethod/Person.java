package com.abner.yan.lambda.demo.methodPreference.constructorMethod;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 17:46
 * @Description:
 */
public class Person {
    public Person(String name) {
        this.name = name;
    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
