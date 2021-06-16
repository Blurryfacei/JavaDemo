package cn;

public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable run=()->{
			for (int x = 0; x < 10; x++) {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
				System.out.println(Thread.currentThread().getName()+"running,x="+x);
			}
		};
		Thread threadA=new Thread(run,"ThreadA");
		Thread threadB=new Thread(run,"ThreadB");
		Thread threadC=new Thread(run,"ThreadC");
		threadA.setPriority(Thread.MIN_PRIORITY);
		threadB.setPriority(Thread.MIN_PRIORITY);
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadA.start();
		threadB.start();
		threadC.start();
	}

}
