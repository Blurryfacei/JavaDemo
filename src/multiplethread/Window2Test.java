package multiplethread;

/**
 * @author huang
 * @date 2021/10/15 15:15
 */
public class Window2Test {
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
