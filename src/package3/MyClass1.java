package package3;

import java.util.Arrays;

/**
 * @author huang
 * @date 2021/11/02 10:50
 */
public class MyClass1 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("diy1");
            System.out.println(2/0);
            System.out.println("diy11");
        }catch (Exception e){
            System.out.println("diy2");
            e.printStackTrace();
        }finally {
            System.out.println("jiehshu");
        }
    }
}
