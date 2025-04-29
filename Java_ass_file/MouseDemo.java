import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("MouseDemo");
        jf.setLayout(new BorderLayout());
        jf.setSize(500, 500);
        Can c1 = new Can();
        jf.add(c1);
        jf.setVisible(true);
    }

    static class Can extends Canvas {
        int x1 = 0, y1 = 0;
        boolean isOval = true;  // Switch between oval and rectangle
        Image img;  // To store the image
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Can() {
            // Load an image (replace the file path with a valid image path on your system)
            img = toolkit.getImage("3346765.jpg");  // Replace with actual image path

            addMouseMotionListener(new XYZ());
            addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent me) {
                    // Switch between oval and rectangle on mouse click
                    isOval = !isOval;
                    repaint();
                }
            });
        }

        public void paint(Graphics g) {
            if (img != null) {
                g.drawImage(img, x1, y1, 430, 250, this);  // Draw the image at (x1, y1)
            } else {
                // Draw either an oval or rectangle
                if (isOval) {
                    g.fillOval(x1, y1, 50, 50);  // Draw an oval
                } else {
                    g.fillRect(x1, y1, 50, 50);  // Draw a rectangle
                }
            }
        }

        class XYZ extends MouseMotionAdapter {
            public void mouseDragged(MouseEvent me) {
                x1 = me.getX() - 25;  // Center the shape at the mouse pointer
                y1 = me.getY() - 25;
                repaint();
            }
        }
    }
}
