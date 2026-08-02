import java.util.*;
import javac.swing.*;

public class simpleframe {
    JFrame f;
    JLabel l;
    simpleframe(){
        f=new JFrame("babystep");
        l=new JLabel("Hello world!");
        f.add(l);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,400);
    }
    public static void main(String[] args) {
      new simpleframe();
    }
}
