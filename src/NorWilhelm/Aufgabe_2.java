package NorWilhelm;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Aufgabe_2 {

    public static final int width = 256;
    public static final int height = 256;

    static class MyBufferedImage extends JFrame {
        public void createGUI() {
            // configure JFrame
            setTitle("Aufgabe 2");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // create and add JPanel
            MyPaintPanel paintPanel = new MyPaintPanel();
            this.getContentPane().add(paintPanel);

            pack();
            setResizable(false);
            setVisible(true);
            setSize(width, height);
        }

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(
                    () -> {
                        MyBufferedImage myGUI = new MyBufferedImage();
                        myGUI.createGUI();
                    });
        }

        static class MyPaintPanel extends JPanel {
            private BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            public void paint(Graphics g) {
                super.paint(g);

                drawLine(200, 100, 100, 10);
                g.drawImage(img, 0, 0, null);
            }
            private void drawLine(int x0, int y0, int x1, int y1) {
                int dy = y1 - y0;
                int dx = x1 - x0;
                if (dx == 0 && dy == 0) {
                    img.setRGB(x0, y0, 0xFFFF00);
                    return;
                }

                if (Math.abs(dx) >= Math.abs(dy)) {
                    if (x1 > x0) drawLineX(x0, y0, x1, y1);
                    else drawLineX(x1, y1, x0, y0);
                } else {
                    if (y1 > y0) drawLineY(x0, y0, x1, y1);
                    else drawLineY(x1, y1, x0, y0);
                }
            }

            private void drawLineX(int x0, int y0, int x1, int y1) {
                int dx = x1 - x0;
                int dy = Math.abs(y1 - y0);
                int twoDx = dx + dx;
                int twoDy = dy + dy;
                int dHat = twoDy - dx;
                int incr = 1;
                if (y1 < y0) incr = -1;

                for (int x = x0, y = y0; x <= x1; x++) {
                    img.setRGB(x, y, 0xFFFF00);
                    if (dHat <= 0) {
                        dHat += twoDy;
                    } else {
                        dHat += twoDy - twoDx;
                        y += incr;
                    }
                }
            }

            private void drawLineY(int x0, int y0, int x1, int y1) {
                int dx = Math.abs(x1 - x0);
                int dy = y1 - y0;
                int twoDx = dx + dx;
                int twoDy = dy + dy;
                int dHat = twoDx - dy;
                int incr = 1;
                if (x1 < x0) incr = -1;

                for (int y = y0, x = x0; y <= y1; y++) {
                    img.setRGB(x, y, 0xFFFF00);
                    if (dHat <= 0) {
                        dHat += twoDx;
                    } else {
                        dHat += twoDx - twoDy;
                        x += incr;
                    }
                }
            }
        }
    }
}

