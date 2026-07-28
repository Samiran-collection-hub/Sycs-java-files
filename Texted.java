import java.awt.*;
import javax.swing.*;
import java.nio.file.*;
import java.awt.event.*;
import java.io.IOException;


public class Texted implements ActionListener{
    JFrame f;
    JButton b1,b2;
    JTextArea t1;

    Texted(){
        f=new JFrame("Simple Text editor");
        b1=new JButton("Read");
        b2=new JButton("Write");
        t1=new JTextArea(20,20);

        f.add(b1);
        f.add(b2);
        f.add(t1);
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setVisible(true);
        f.setSize(300,300);
        f.setLocale(null);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        Path path= Path.of("sample.txt");
        try {
            if(e.getSource()==b1){
                String st=Files.readString(path);
                t1.setText(st);
            }
            if(e.getSource()==b2){
                String st=t1.getText();
                Files.writeString(path, st);
            }
            
        } catch (IOException ie) {
            System.err.println(ie);
        }
    }
    public static void main(String[] args) {
        new Texted();
    }
}
