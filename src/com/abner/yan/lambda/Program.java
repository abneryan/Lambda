package com.abner.yan.lambda;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program program = new Program();
		program.init();
	}

	public void init() {
		// 使用接口实现类
		MyComparetor comparetor1 = new MyComparetor();
		// 使用匿名内部类
		Comparetor comparetor2 = new Comparetor() {

			@Override
			public int compare(int a, int b) {
				// TODO Auto-generated method stub
				return a - b;
			}

		};
		// 使用lambda表达式
		Comparetor comparetor3 = (a, b) -> a - b;

	}

	class MyComparetor implements Comparetor {

		@Override
		public int compare(int a, int b) {
			// TODO Auto-generated method stub
			return a - b;
		}

	}

	/**
	 * 接口中可以有抽象方法，静态方法，default方法
	 * 
	 * @author yanguoqing
	 *
	 */
	@FunctionalInterface
	interface Comparetor {
		int compare(int a, int b);

		default void compare1() {
		};

		static void compare2() {
		};
	}
}
