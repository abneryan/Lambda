package com.abner.yan.lambda.demo.methodPreference.constructorMethod;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Auther: yanguoqing
 * @Date: 2020/4/28 17:47
 * @Description:
 */
public class Demo {
    public static void buildPersonByName(String name, BuildPerson buildPerson) {
        Person person = buildPerson.builPerson(name);
        String personName = person.getName();
        System.out.printf(personName);
    }

    public static void main(String[] args) {
       /* buildPersonByName("张三", name -> {
                    Person person =new Person(name);

                    return person;
                }
        );*/
        buildPersonByName("李四", Person::new);
    }

}

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        if (text == null) {
            return null;
        }
        ArrayList<String> res = new ArrayList<>();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                res.add(words[i + 2]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
