package package3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author huang
 */
public class LeetCodeTest {
    public static void main(String[] args) {
        int[][] res=new int[1][1];
        Arrays.sort(res, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
    }
}
