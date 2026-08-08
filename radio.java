import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radio extends JFrame implements ActionListener{
    radio(){
        JRadioButton r1=new JRadioButton("pizza");
        JRadioButton r2=new JRadioButton("burger");
        JRadioButton r3=new JRadioButton("hotdog");
        ButtonGroup gro=new ButtonGroup();
        gro.add(r1);
        gro.add(r2);
        gro.add(r3);
        this.add(r1);
        this.add(r2);
        this.add(r3);

        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new radio();
    }
}
