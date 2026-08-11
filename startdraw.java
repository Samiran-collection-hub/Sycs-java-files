import javax.swing.*;
import java.awt.*;

public class startdraw extends Canvas{
    public void paint(Graphics g) {
        g.fillOval(50, 50, 100, 100);
    }
    public static void main(String[] args) {
        JFrame f=new JFrame();
        Canvas can=new startdraw();
        can.setSize(100, 100);
        f.setBackground(Color.red);
        f.add(can);
        f.setVisible(true);
        f.setSize(300,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
