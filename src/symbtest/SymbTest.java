package symbtest;

import interfaces.LambdaNoResultMultyParameter;
import interfaces.LambdaNoResultNoParameter;
import interfaces.LambdaNoResultSingleParameter;
import interfaces.LambdaSingleResultMultyParameter;
import interfaces.LambdaSingleResultNoParameter;
import interfaces.LambdaSingleResultSingleParameter;

/**
 * Lambda基本语法：
 * 1，Lambda 是一个匿名函数
 * 2，参数列表，方法体
 * @author yanguoqing
 *
 */
public class SymbTest {
	
	public static void main(String[] args) {
		//没有返回值，没有参数
		LambdaNoResultNoParameter lambda1 = () -> {
			System.out.println("lambda1");
		};
		lambda1.test();
		
		//没有返回值，一个参数
		LambdaNoResultSingleParameter lambda2 = (int a) -> {
			System.out.println("lambda2---a:" + a);
		};
		lambda2.test(10);
		
		//没有返回值，多个参数
		LambdaNoResultMultyParameter lambda3 = (int a,int b)->{
			System.out.println("lambda2---a:" + a + "---b:" +b);
		};
		lambda3.test(4, 5);
		
		//有返回值，没有参数
		LambdaSingleResultNoParameter lambda4 = ()->{
			return 100;
		};
		System.out.println("lambda4 result=" +lambda4.test());
		
		//有返回值，一个参数
		LambdaSingleResultSingleParameter lambda5 = (int a) -> {
			return a;
		};
		System.out.println("lambda5 result=" +lambda5.test(200));
		
		//有返回值，多个参数
		LambdaSingleResultMultyParameter lambda6 = (int a, int b) ->{
			return a+b;
		};
		System.out.println("lambda6 result=" +lambda6.test(200, 100));
	}
	/*
	输出结果
	lambda1
	lambda2---a:10
	lambda2---a:4---b:5
	lambda4 result=100
	lambda5 result=200
	lambda6 result=300*/

}
