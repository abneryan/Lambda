package symbtest;

import interfaces.LambdaSingleResultSingleParameter;

public class SymbTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaSingleResultSingleParameter lambda1 = (a)-> a +10;
		LambdaSingleResultSingleParameter lambda2 = (a)-> a +10;
		
		/*方法引用：
		可以快速的将一个Lambda表达式的实现指向一个已经实现的方法
		语法：方法的隶属者 :: 方法名字     （隶属者：静态时是类名；非静态时是对象）
		注意：
			1，方法的参数类型和数量一定要跟接口中抽象方法定义的保持一致
			2，方法返回值类型一定要跟接口中抽象方法定义的一致
		*/
		LambdaSingleResultSingleParameter lambda3 = (a)-> add(a);
		LambdaSingleResultSingleParameter lambda4 = SymbTest2::add;
	}
	public static int add(int a) {
		return a+10;
	}

}
