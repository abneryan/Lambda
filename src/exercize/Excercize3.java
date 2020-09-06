package exercize;

import java.util.ArrayList;
import java.util.Collections;

public class Excercize3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();

		Collections.addAll(list, 1,2,3,4,5,6,7,8,9,9);
		//将集合中的每一个元素都带入到accept 中
		list.forEach(System.out::println);
		
		//输出偶数
		list.forEach(num ->{
			if(num%2 == 0) {
				System.out.println("num:" + num);
			}
		});
	}

}
