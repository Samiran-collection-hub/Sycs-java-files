package insert;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Insert implements ActionListener{
JFrame f;
JTextField tf1,tf2,tf3,tf4;
JLabel lb,lb1,lb2,lb3,lb4;
public Insert()
{
f=new JFrame("JDBC EX of INSERT DATA");
tf1=new JTextField(10);
tf2=new JTextField(10);
tf3=new JTextField(10);
tf4=new JTextField(10);
lb1=new JLabel("STU_ID:");
lb2=new JLabel("STU_Name:");
lb3=new JLabel("COURSE:");
lb4=new JLabel("PECENTAGE:");
lb=new JLabel();
JButton bt=new JButton("Submit");
bt.addActionListener(this);
f.add(lb1);
f.add(tf1);

f.add(lb2);
f.add(tf2);
f.add(lb3);
f.add(tf3);
f.add(lb4);
f.add(tf4);
f.add(bt);
f.add(lb);
f.setVisible(true);
f.setSize(500,500);
f.setLayout(new FlowLayout());
}
public void actionPerformed(ActionEvent ae)
{
Connection conn;
Statement stmt;
String s1,s2,s3;
double d1;

s1=tf1.getText();
s2=tf2.getText();
s3=tf3.getText();
d1=Double.parseDouble(tf4.getText());
try
{

Class.forName("com.mysql.jdbc.Driver");
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rkt","root","root");
stmt = conn.createStatement();
stmt.executeUpdate("Insert into student values('"+s1+"','"+s2+"','"+s3+"','"+d1+"')");
conn.close();
lb.setText("Success");

}

catch(Exception e)
{

lb.setText("failed");
System.err.println(e.getMessage());
}

public static void main(String[] args)
{
Insert i1=new Insert();
}
}
