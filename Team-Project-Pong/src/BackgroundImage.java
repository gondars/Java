import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import javax.swing.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.imageio.ImageIO;

/*
 * Canvas.java
 *
 * Created on 13 March 2004, 23:58
 */

/**
 *
 * @author  christo
 */

public class BackgroundImage extends JPanel {
    Image image;
    /** Creates a new instance of Canvas */
    public BackgroundImage() {
        /* do the image stuff */
        loadImage();
        setBackground(new Color(90,138,214));                 
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);
        int x = (width - imageWidth)/2;
        int y = (height - imageHeight)/2;
        g.drawImage(image, x, y, this);
    }
    
    private void loadImage() {
        String fileName = "background.jpg";
        try {
            URL url = new URL("http://www.someaddress.com/images//"+fileName);
        }
        catch(MalformedURLException mue) {
            //System.out.println(mue.getMessage());
        }
        catch(IOException ioe) {
            //System.out.println(ioe.getMessage());
        }
    }
}