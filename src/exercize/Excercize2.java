package exercize;

import java.util.TreeSet;

import data.Student;

public class Excercize2 {

	public static void main(String[] args) {
		// 使用Lambda 表达式来实现一个Comparator 接口，来初始化一个TreeSet对象
		TreeSet<Student> set = new TreeSet<>((s1,s2)->{
			if(s1.age >= s2.age) {
				return -1;
			} else {
				return 1;
			}
		});
		set.add(new Student("zhangsan",10));
		set.add(new Student("lisi",10));
		set.add(new Student("wangwu",4));
		set.add(new Student("zhaoliu",20));
		set.add(new Student("wangermazi",23));
		set.add(new Student("xiaotaoqi",11));
		
		System.out.println("set sort result:" + set);
	}	
}
