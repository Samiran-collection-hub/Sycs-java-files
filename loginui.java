import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginui implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JTextField tf1,tf2;
    JButton b1,b2;

    loginui(){
        f=new JFrame("Lgon programe");
        l1=new JLabel("Enter username:");
        l2=new JLabel("Enter password:");
        tf1=new JTextField(10);
        tf2=new JTextField(10);
        b1=new JButton("Clear");
        b2=new JButton("login");

        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(b1);
        f.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setVisible(true);
        f.setSize(250, 200);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1){
            tf1.setText(null);
            tf2.setText(null);
            tf1.setEditable(true);
            tf2.setEditable(true);
        }
        if (e.getSource()==b2) {
            String pwd=tf2.getText();
            boolean q=pwd.equals("samiran123");
            if(q){
                System.out.println("Login successfull!");
            tf1.setEditable(!q);
            tf2.setEditable(!q);
            }else{
                System.out.println("Invalide password");
            tf1.setEditable(!q);
            tf2.setEditable(!q);
            }
        }
    }
    public static void main(String[] args) {
        new loginui();
    }
}
