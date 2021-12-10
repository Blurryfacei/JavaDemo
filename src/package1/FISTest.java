package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author huang
 */
public class FISTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("Hello.txt");
        byte[] b=new byte[5];
        fileInputStream.read(b);

    }
}
