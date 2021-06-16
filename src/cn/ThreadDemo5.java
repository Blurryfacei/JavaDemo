package cn;
class MyThread1 implements Runnable{
	private int ticket=3;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if (this.ticket>0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+
						"卖票，ticket卖之前有"+this.ticket--);
			} else {
				System.out.println(Thread.currentThread().getName()+"说：”票已经卖完了“");
				break;
			}
		}
	}
	
}
public class ThreadDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 mt = new MyThread1();
		new Thread(mt,"售票员A").start();
		new Thread(mt,"售票员B").start();
		new Thread(mt,"售票员C").start();
	}

}
