package exercize;

import java.util.ArrayList;

import data.Student;

public class Excercize {
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("zhangsan",10));
		list.add(new Student("lisi",10));
		list.add(new Student("wangwu",4));
		list.add(new Student("zhaoliu",20));
		list.add(new Student("wangermazi",23));
		list.add(new Student("xiaotaoqi",11));
		
		list.sort((s1,s2) -> s2.age-s1.age);
		System.out.println("list sort result:" + list);
	}
}
