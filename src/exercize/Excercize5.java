package exercize;
/**
 * 创建线程
 * @author yanguoqing
 *
 */
public class Excercize5 {

	public static void main(String[] args) {
		Thread thread = new Thread(() ->{
			for(int i = 0;i<50;i++) {
				System.out.println("i=" + i);
			}
		});
		thread.start();
	}

}
