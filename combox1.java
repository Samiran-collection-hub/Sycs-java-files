import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class combox1 extends JFrame implements ActionListener{
    combox1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals={"dog","cat","bird"};
        JComboBox combobox=new JComboBox(animals);

        this.add(combobox);
        this.pack();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){}
    public static void main(String[] args) {
        new combox1();
    }
}
