//A block changing its color and moving down the screen, with buttons to move it left or right.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameDemo {
    static int x = 250, y = 1; // Corrected declaration
    static Can c1 = new Can(); // Initialize statically

    public static void main(String args[]) {
        // Create the JFrame
        JFrame jf = new JFrame("Game");
        jf.setLayout(new BorderLayout());
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel and buttons
        Panel pn = new Panel();
        JButton jb = new JButton("<<");
        JButton jb1 = new JButton(">>");
        pn.add(jb);
        pn.add(jb1);
        jf.add(pn, BorderLayout.SOUTH);

        // Add the canvas to the frame
        jf.add(c1, BorderLayout.CENTER);

        // Add ActionListeners to buttons
        jb.addActionListener(new XYZ());
        jb1.addActionListener(new XYZ());

        jf.setVisible(true);

        // Start the animation thread
        c1.start();
    }

    static class XYZ implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            JButton bt = (JButton) ae.getSource();
            String s1 = bt.getText();
            if (s1.equals("<<")) {
                x -= 5;
            } else {
                x += 5;
            }
            c1.repaint();
        }
    }

    static class Can extends Canvas implements Runnable {
        int r1 = 0, g1 = 0, b1 = 0;
        Thread t1 = new Thread(this);

        public void start() {
            t1.start();
        }

        @Override
        public void paint(Graphics g) {
            Color col = new Color(r1, g1, b1);
            g.setColor(col);
            g.fillRect(x, y, 20, 20);
        }

        @Override
        public void run() {
            while (true) {
                if (y < 400) {
                    y += 2;
                } else {
                    x = (int) (Math.random() * 400);
                    y = 1;
                    r1 = (int) (Math.random() * 255);
                    g1 = (int) (Math.random() * 255);
                    b1 = (int) (Math.random() * 255);
                }
                try {
                    Thread.sleep(50);
                    repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
