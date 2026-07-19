import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class guieg {
    public static void main(String[] args) {
      JFrame f= new JFrame("Hello world");
      JLabel l=new JLabel("Hello world");
      f.add(l);
      f.setVisible(true);
      f.setSize(300,300);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
