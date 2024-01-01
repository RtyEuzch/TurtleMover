/* Import Statements */
import java.awt.*;
import javax.swing.*;

/**
 */
public class TurtleMoverMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Block");
        TurtleComponent comp = new TurtleComponent();
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comp);
    }
}


class TurtleComponent extends JComponent {
    @Override 
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

    }
}