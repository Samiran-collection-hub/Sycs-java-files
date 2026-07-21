import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class factgui implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JTextField tf1,tf2;
    JButton b1;

    factgui(){
        f=new JFrame("calculate factorial");
        l1=new JLabel("Enter number");
        l2=new JLabel("Result :");
        tf1=new JTextField(10);
        tf2=new JTextField(10);
        b1=new JButton("Fact!");

        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(b1);

        f.setVisible(true);
        f.setSize(230, 200);
        f.setLayout(new FlowLayout());;
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1){
            int fact=1;
            String a=tf1.getText();
            int n=Integer.parseInt(a);
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            tf2.setText(String.valueOf(fact));
            tf2.setEditable(false);
        }
    }
    public static void main(String[] args) {
        new factgui();
    }
}
