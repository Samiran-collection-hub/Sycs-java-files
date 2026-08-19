import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class combobox3 extends JFrame implements ActionListener{
    JComboBox combobox;
    combobox3(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals={"dog","cat","bird"};
        combobox=new JComboBox(animals);
        combobox.addActionListener(this);

        this.add(combobox);
        this.pack();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==combobox){
            System.out.println(combobox.getSelectedIndex());
        }
    }
    public static void main(String[] args) {
        new combobox3();
    }
}
