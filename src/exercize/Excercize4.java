package exercize;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

import data.Student;

/**
 * 按指定条件删除集合中的元素
 * @author yanguoqing
 *
 */
public class Excercize4 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList();
		list.add(new Student("zhangsan",10));
		list.add(new Student("lisi",10));
		list.add(new Student("wangwu",4));
		list.add(new Student("zhaoliu",20));
		list.add(new Student("wangermazi",23));
		list.add(new Student("xiaotaoqi",11));
		
		//传统迭代器做法
		/*Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.age >10) {
				iterator.remove();
			}
		}*/
		System.out.println("list:" + list);
		
		//Lambda表达式做法
		//将集合中的每一个元素带入test中
		list.removeIf(ele -> ele.age>10);
		System.out.println("lambda list:" + list);
	}

}
