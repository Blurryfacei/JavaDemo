package multiplethread;

/**
 * @author huang
 * @date 2021/10/15 15:07
 */
public class window1test {
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
