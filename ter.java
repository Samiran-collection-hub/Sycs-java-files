import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ter extends JFrame implements ActionListener{
    JTextArea ta;
    ter(){
        ta=new JTextArea();
        ta.setBackground(Color.BLACK);
        ta.setForeground(Color.WHITE);
        ta.setText("D:User>");
        this.add(ta);
        this.setVisible(true);
        this.setSize(300,300); //this.pack();
        //this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){}
    public static void main(String[] args) {
        new ter();
    }
}
