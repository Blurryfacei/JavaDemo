package multiplethread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author huang
 * @date 2021/10/15 15:04
 */
public class Window1 extends Thread{
    private static int tickets=1000;
    private static ReentrantLock lock=new ReentrantLock(true);
    @Override
    public void run() {
//        while(tickets>0){
//            System.out.println("卖票，窗口为"+currentThread()+"；票号为"+tickets);
//            tickets--;
//        }
//        synchronized(Window1.class){
//            while(tickets>0){
//                System.out.println("卖票，窗口为"+currentThread()+"；票号为"+tickets);
//                tickets--;
//            }
//        }
//        while(true){
//            synchronized(Window1.class){
//                if(tickets>0){
//                    System.out.println("卖票，窗口为"+currentThread()+"；票号为"+tickets);
//                    tickets--;
//                }else{
//                    break;
//                }
//            }
//        }
//        while(true){
//            sellTickets();
//        }
        while(true){
            lock.lock();
            try{
                if(tickets>0){
                    System.out.println("卖票，窗口为"+currentThread()+"；票号为"+tickets);
                    tickets--;
                }else{
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
//    public static synchronized void sellTickets(){
//        if(tickets>0){
//            System.out.println("卖票，窗口为"+currentThread()+"；票号为"+tickets);
//            tickets--;
//        }
//    }

    public static void main(String[] args) {
        System.out.println();
        Window1 window1 = new Window1();
        Window1 window11 = new Window1();
        Window1 window12 = new Window1();
        window1.start();
        window11.start();
        window12.start();
    }
}
