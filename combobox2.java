import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class combobox2 extends JFrame implements ActionListener{
    JComboBox combobox;
    combobox2(){
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
            System.out.println(combobox.getSelectedItem());
        }
    }
    public static void main(String[] args) {
        new combobox2();
    }
}
