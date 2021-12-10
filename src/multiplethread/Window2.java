package multiplethread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author huang
 * @date 2021/10/15 15:14
 */
public class Window2 implements Runnable{
    private int tickets=1000;
    private  int cishu=0;
    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
//        while(tickets>0){
//            System.out.println("卖票，窗口为"+this+"；票号为"+tickets);
//            tickets--;
//        }
        while(true){
            synchronized(this){
                if(tickets>0){
                    System.out.println("卖票，窗口为"+Thread.currentThread()+"；票号为"+tickets);
                    tickets--;
                }else{
                    break;
                }
            }
        }
//        while(true){
//            sellTickets();
//        }
//        System.out.println(++cishu);
//        while(true){
//            lock.lock();
//            try {
//                if(tickets>0){
//                    System.out.println("卖票，窗口为"+Thread.currentThread()+"；票号为"+tickets);
//                    tickets--;
//                }else{
//                    break;
//                }
//            }finally {
//                lock.unlock();
//            }
//        }
    }
    public synchronized void sellTickets() {
        if (tickets > 0) {
            System.out.println("卖票，窗口为" + Thread.currentThread() + "；票号为" + tickets);
            tickets--;
        }
    }

    public static void main(String[] args) {
        Window2 window2 = new Window2();
        Thread thread = new Thread(window2);
        Thread thread1 = new Thread(window2);
        Thread thread2 = new Thread(window2);
        thread.start();
        thread1.start();
        thread2.start();

    }
}
