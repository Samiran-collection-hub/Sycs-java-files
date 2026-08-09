import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class impro extends JFrame implements ActionListener{
    JPanel p1,p2,p3,p4;
    JRadioButton r1,r2,r3,r4,r5;
    ButtonGroup gru,gro;
    impro(){
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        r1=new JRadioButton();
        r2=new JRadioButton();
        r3=new JRadioButton();
        r4=new JRadioButton();
        r5=new JRadioButton();
        gru=new ButtonGroup();
        gro=new ButtonGroup();

        p1.setBounds(5,0, 375, 100);
        p1.setLayout(new GridLayout(3, 2,0,0));
        p1.setBorder(BorderFactory.createTitledBorder("File Attribute"));

        p2.setBounds(5,105, 160, 110);
        p2.setLayout(new GridLayout(3, 1,0,0));
        p2.setBorder(BorderFactory.createTitledBorder("Units"));

        p3.setBounds(170,105, 210, 110);
        p3.setLayout(new GridLayout(3, 2,0,0));
        p3.setBorder(BorderFactory.createTitledBorder("Title3"));

        p4.setBounds(10,220, 375, 40);
        p4.setLayout(new GridLayout(2, 5,1,1));

        r1.setText("Inches");
        r2.setText("Centimeter");
        r3.setText("Pixel");
        r4.setText("Black and White");
        r5.setText("Color");

        p1.add(new JLabel("Last Saved:"));
        p1.add(new JLabel("Not Avalibale"));
        p1.add(new JLabel("Size on disk:"));
        p1.add(new JLabel("Not Avalibale"));
        p1.add(new JLabel("Resolution"));
        p1.add(new JLabel("120 DPI"));
        gru.add(r1);
        gru.add(r2);
        gru.add(r3);
        gro.add(r4);
        gro.add(r5);
        p2.add(r1);
        p2.add(r2);
        p2.add(r3);
        p3.add(r4);
        p3.add(r5);
        p4.add(new JLabel("Height: "));
        p4.add(new JTextField());
        p4.add(new JLabel("Width: "));
        p4.add(new JTextField());
        p4.add(new JButton("Default"));
        p4.add(new JLabel(""));
        p4.add(new JLabel(""));
        p4.add(new JLabel(""));
        p4.add(new JButton("OK"));
        p4.add(new JButton("Cancel"));
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);

        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("image property");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){ 
        
    }
    public static void main(String[] args) {
        new impro();
    }
}
