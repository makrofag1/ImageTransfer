package networkExample2;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import javax.imageio.ImageIO;

public class GreetingClient
{
    Image newimg;
    static BufferedImage bimg;
    byte[] bytes;

    public static void main(String [] args)
    {
        String serverName = "localhost";
        int port = 6066;
        try
        {
            BufferedImage img = ImageIO.read(new File("D:\\Studia\\Zadania_rekrutacyjne_Java\\Networking\\src\\network\\Charizard.png"));//Charizard Ash_Pikachu
            InetAddress address = InetAddress.getByName("192.168.88.14");
            //Socket client = new Socket(serverName, port);
            Socket client = new Socket(address, port);
            Robot bot;
            bot = new Robot();
            //bimg = bot.createScreenCapture(new Rectangle(0, 0, 200, 100));
            ImageIO.write(img,"PNG",client.getOutputStream());
            client.close();
        } catch(IOException | AWTException e) {
            e.printStackTrace();
        }
    }
}
