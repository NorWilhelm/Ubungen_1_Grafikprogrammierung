package NorWilhelm;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Aufgabe_1 {

    // This code example is created for educational purpose
    // by Thorsten Thormaehlen (contact: www.thormae.de).
    // It is distributed without any warranty.


    static class MyBufferedImage extends JFrame {
        public void createGUI() {
            // configure JFrame
            setTitle("Yellow Rectangle in a Black Box");
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
                    () -> {
                        MyBufferedImage myGUI = new MyBufferedImage();
                        myGUI.createGUI();
                    });
        }

        static class MyPaintPanel extends JPanel {

            private final int WIDTH = 256;
            private final int HEIGHT = 256;

            private BufferedImage img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

            public void paint(Graphics g) {
                super.paint(g); Graphics2D g2d = (Graphics2D) g;

                int x_rectangle_left_corner = WIDTH/2 - 16;
                int y_rectangle_left_corner = HEIGHT/2;

                int rgb = 0xFFFF00; // Bright yellow hex

                // Draw lower edge
                for (int i = 0; i <= 32; i++) { img.setRGB(x_rectangle_left_corner + i, y_rectangle_left_corner, rgb); }

                // Draw right edge
                for (int i = 0; i <= 32; i++) { img.setRGB(x_rectangle_left_corner + 32, y_rectangle_left_corner - i, rgb); }

                // Draw left edge
                for (int i = 0; i <=32; i++) { img.setRGB(x_rectangle_left_corner, y_rectangle_left_corner - i, rgb); }

                // Draw top edge
                for (int i = 0; i <=32; i++) { img.setRGB(x_rectangle_left_corner + i, y_rectangle_left_corner - 32, rgb); }

                g.drawImage(img, 0, 0, null);
            }
        }
    }
}
