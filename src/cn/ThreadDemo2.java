package cn;

import java.util.Iterator;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable run=()->{
			for(int x=0;x<10;x++) {
				System.out.println(Thread.currentThread().getName()+" x="+x);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		};
		for (int i = 0; i < 5; i++) {
			new Thread(run,"Thread-"+i).start();
		}
	}

}
