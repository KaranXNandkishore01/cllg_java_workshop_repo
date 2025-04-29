import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RotateBall extends JPanel implements ActionListener {
    private int angle = 0; // Angle of rotation
    private Timer timer;

    public RotateBall() {
        timer = new Timer(20, this); // Timer to update the rotation
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set anti-aliasing for smoother rotation
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Get the center of the panel
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Rotate the graphics context
        g2d.rotate(Math.toRadians(angle), centerX, centerY);

        // Draw the ball
        int ballRadius = 50;
        g2d.setColor(Color.RED);
        g2d.fillOval(centerX - ballRadius / 2, centerY - ballRadius / 2, ballRadius, ballRadius);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        angle += 5; // Increment the angle
        if (angle >= 360) {
            angle = 0; // Reset the angle after a full rotation
        }
        repaint(); // Repaint the panel to update the rotation
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rotating Ball");
        RotateBall rotateBall = new RotateBall();

        frame.add(rotateBall);
        frame.setSize(400, 400); // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}