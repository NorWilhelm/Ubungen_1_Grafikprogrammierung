package NorWilhelm;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.*;
import javax.imageio.*;

public class Aufgabe_1 {

    // This code example is created for educational purpose
// by Thorsten Thormaehlen (contact: www.thormae.de).
// It is distributed without any warranty.


    static class MyBufferedImage extends JFrame {
        public void createGUI() {
            // configure JFrame
            setTitle("HelloGUI");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // create and add JPanel
            MyPaintPanel paintPanel = new MyPaintPanel();
            this.getContentPane().add(paintPanel);

            pack();
            setResizable(false);
            setVisible(true);
            setSize(256, 256);
        }

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(
                    new Runnable() {
                        public void run() {
                            MyBufferedImage myGUI = new MyBufferedImage();
                            myGUI.createGUI();
                        }
                    });
        }

        static class MyPaintPanel extends JPanel {

            private final int WIDTH = 256;
            private final int HEIGHT = 256;

            private BufferedImage img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

            public void paint(Graphics g) {
                super.paint(g); Graphics2D g2d = (Graphics2D) g;
                int oldRgb = img.getRGB(100, 100); // read a pixel
                int rgb = 0xFFFF0000; // Alpha-Red-Green-Blue
                img.setRGB(90, 100, rgb); // draw red pixel
                g.drawImage(img, 0, 0, null);
            }
        }
    }
}
