

package symbtest;

import data.Student;
import interfaces.StudentCreater;
import interfaces.StudentCreater2;
/**
 * 构造函数的方法引用的方式
 * @author yanguoqing
 *
 */
public class SymbTest3 {
	public static void main(String[] args) {
		//正常做法
		StudentCreater sc = ()-> new Student();
		System.out.println("student:" + sc.creatStudent().toString());
		
		//空构造方法的引用
		StudentCreater sc1 = Student::new;
		System.out.println("student1:" + sc1.creatStudent().toString());
		
		//两个参数的构造方法的引用
		StudentCreater2 sc2 = Student::new;
		System.out.println("student2:" + sc2.creatStudent("zhangsan", 30).toString());
		
	}
}
