package symbtest;

import interfaces.LambdaNoResultMultyParameter;
import interfaces.LambdaNoResultSingleParameter;
import interfaces.LambdaSingleResultNoParameter;

/**
 * 语法精简
 * @author yanguoqing
 *
 */
public class LambdaSimplify {

	public static void main(String[] args) {
		/*1,参数类型
			由于在接口的抽象方法中已经定义了参数的数量和类型，所以在Lambda表达始终参数的类型可以省略
			注意：如果要省略参数类型，必须所有的参数都要省略，不能只省略一部分参数的参数类型*/

		LambdaNoResultMultyParameter lambda1 = (a,b) ->{
			System.out.println("lambda1");
		};
		
		/*2,省略小括号
			如果参数列表中参数的数量只有一个，此时小括号可以不写*/
		
		LambdaNoResultSingleParameter lambda2 = a ->{
			System.out.println("lambda2");
		};
		
		/*3,方法体大括号
			如果方法体中只有一条语句，可以省略大括号*/
		LambdaNoResultSingleParameter lambda3 = (a) -> System.out.println("lambda2");	
		
		/*4，如果方法体中唯一的一条语句也是返回语句，此时大括号可以省略，同时retrun 关键字也要省略*/
		LambdaSingleResultNoParameter lambda4 = () -> 10;
	}

}
