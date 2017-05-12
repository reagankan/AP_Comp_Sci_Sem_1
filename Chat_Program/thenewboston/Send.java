import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.BufferedReader;
import java.nio.*;
public class Send {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 13085);
        OutputStream outputStream = socket.getOutputStream();

        BufferedImage image = ImageIO.read(new File("C:\\Users\\kanr4740\\Desktop\\AP_Comp_Sci_Sem_1\\Chat_Program\\thenewboston\\EMOJI_1.jpg"));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", byteArrayOutputStream);

        byte[] size = ByteBuffer.allocate(4).putInt(byteArrayOutputStream.size()).array();
        outputStream.write(size);
        outputStream.write(byteArrayOutputStream.toByteArray());
        outputStream.flush();
        System.out.println("Flushed: " + System.currentTimeMillis());

        Thread.sleep(120000);
        System.out.println("Closing: " + System.currentTimeMillis());
        socket.close();
    }
}