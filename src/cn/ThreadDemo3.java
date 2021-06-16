package cn;

public class ThreadDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread=new Thread(()->{
			for (int i = 0; i < 100; i++) {
//				if(i%3==0) {
//					Thread.yield();
//					System.out.println("【线程礼让】"+Thread.currentThread().getName());
//				}
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
				System.out.println(Thread.currentThread().getName()+"执行、x="+i);
			}
		},"玩耍的线程");
		thread.start();
		for (int x = 0; x < 100; x++) {
//			Thread.sleep(100);
			System.out.println("【霸道的main线程】number="+x);
		}
	}

}
