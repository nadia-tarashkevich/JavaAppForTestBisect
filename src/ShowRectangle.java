import javax.swing.*;
import java.awt.*;

public class ShowRectangle extends JFrame {

    public ShowRectangle() {
        setTitle("Green Rectangle");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(50, 50, 100, 100);
            }
        };

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ShowRectangle();
        // still red
        // red again
    }
}
