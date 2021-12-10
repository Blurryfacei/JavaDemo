package package3;

import java.util.HashMap;

/**
 * @author huang
 * @date 2021/10/23 17:03
 */
public class CodeTest {
    public static void main(String[] args) {
        int i=0,j=-1;
        switch(i){
            case 0:
                j=3;
            case 1:
                j=1;
            case 2:
                j=2;
            default:
                j=3;
        }
        System.out.println(j);
    }
}
