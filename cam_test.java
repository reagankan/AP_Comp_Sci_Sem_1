import java.io.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;
public class cam_test {
	public static void takePhoto()
	{
		/*MarvinVideoInterface videoAdapter = new MarvinJavaCVAdapter();
		videoAdapter.connect(0);
		MarvinImage image = videoAdapter.getFrame();
		MarvinImageIO.saveImage(image, "./res/webcam_picture.jpg");*/
	}
	public static void paint (Graphics g)
    {
        g.drawString("hello",40,30);
    }

    public static void main(String ad[])
    {
		System.out.println("Main");
        JFrame jp1 = new JFrame();
        So1 a=new So1 ();
        jp1.getContentPane().add(a, BorderLayout.CENTER);
        jp1.setSize(new Dimension(500,500));
        jp1.setVisible(true);

    }
}