import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class cals implements ActionListener
{
    JFrame f;
    JLabel l1,l2,l3;
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3,b4,re;

    cals(){
        f =new JFrame("first programe");
        l1=new JLabel("Enter n1:");
        l2=new JLabel("Enter n2:");
        l3=new JLabel("Result");
        tf1=new JTextField(10);
        tf2=new JTextField(10);
        tf3=new JTextField(10);
        b1=new JButton("+");
        b2=new JButton("-");
        b3=new JButton("*");
        b4=new JButton("/");
        re=new JButton("C");

        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(re);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        re.addActionListener(this);

        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(200,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf3.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            String a=tf1.getText();
            String b=tf2.getText();
            float m=Float.parseFloat(a);
            float n=Float.parseFloat(b);
            String r = String.valueOf(m+n);
            tf3.setText(r);
        }
        if (e.getSource()==b2) {
            String a=tf1.getText();
            String b=tf2.getText();
            float m=Float.parseFloat(a);
            float n=Float.parseFloat(b);
            String r = String.valueOf(m-n);
            tf3.setText(r);
            
        }
        if (e.getSource()==b3) {
            String a=tf1.getText();
            String b=tf2.getText();
            float m=Float.parseFloat(a);
            float n=Float.parseFloat(b);
            String r = String.valueOf(m*n);
            tf3.setText(r);
            
        }
        if (e.getSource()==b4) {
            String a=tf1.getText();
            String b=tf2.getText();
            float m=Float.parseFloat(a);
            float n=Float.parseFloat(b);
            String r = String.valueOf(m/n);
            tf3.setText(r);
            
        }
        if (e.getSource()==re) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
        
    }

    public static void main(String args[])
    { new cals();}
}
