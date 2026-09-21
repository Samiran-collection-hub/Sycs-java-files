import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testpro implements ActionListener{
    JFrame f;
    JLabel op1,op2,op3;
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3,b4; 
    JTable table;
    JScrollPane sp;
    String[] head={"id","Name","Cource"};
    String[][] data=new String[10][3];
    short i=0;
    testpro(){
        f=new JFrame();
        f.setLayout(new FlowLayout());
        op1=new JLabel("ID");
        op2=new JLabel("Name");
        op3=new JLabel("Cource");
        tf1=new JTextField(10);
        tf2=new JTextField(10);
        tf3=new JTextField(10);
        b1=new JButton("Add");
        b2=new JButton("Update");
        b3=new JButton("Delete");
        b4=new JButton("Show");
        table=new JTable(data,head);
        sp=new JScrollPane(table);
        f.add(op1);
        f.add(tf1);
        f.add(op2);
        f.add(tf2);
        f.add(op3);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(sp);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(300, 300);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b1) {
            data[i][0]=tf1.getText();
            data[i][1]=tf2.getText();
            data[i][2]=tf3.getText();
            i++;
        }
        if (e.getSource()==b2) {
            String find=tf1.getText();
            for (int j = 0; j < data.length; j++) {
                if (find.equals(data[j][0])) {
                    data[j][1]=tf2.getText();
                    data[j][2]=tf3.getText();
                }
            }
        }
        if (e.getSource()==b3) {
            String find=tf1.getText();
            for (int j = 0; j < data.length; j++) {
                if (find.equals(data[j][0])) {
                    data[j][0]="";
                    data[j][1]="";
                    data[j][2]="";
                    break;
                }
            }
        }
        if (e.getSource()==b4) {
            table.repaint();
        }
    }
    public static void main(String[] args) {new testpro();} //made by samiran
}
