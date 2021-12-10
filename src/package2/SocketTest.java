package package2;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author huang
 */
public class SocketTest {
    @Test
    public void Client() throws IOException {
        Socket socket=new Socket("127.0.0.1",8889);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("mu".getBytes(StandardCharsets.UTF_8));
        InputStream inputStream = socket.getInputStream();
        int len;
        byte[] bytes = new byte[5];
        while((len=inputStream.read(bytes))!=-1){
            System.out.println(len);
            System.out.println(bytes.toString());
        }
        socket.close();

    }

    @Test
    public void Server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8889);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        int len;
        byte[] bytes = new byte[5];
        while((len=inputStream.read(bytes))!=-1){
            System.out.println(len);
        }
        System.out.println("接收完毕！");
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("sc".getBytes(StandardCharsets.UTF_8));
        accept.close();
        serverSocket.close();
    }
}
