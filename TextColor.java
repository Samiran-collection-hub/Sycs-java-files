import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextColor extends JFrame implements ActionListener{
    JLabel l;
    JButton b;
    TextColor(){
        l=new JLabel("This is example Text");
        b=new JButton("Color");
        new JColorChooser();
        l.setBackground(Color.white);
        l.setOpaque(true);
        l.setFont(new Font("Curlz MT",Font.PLAIN,100));
        b.addActionListener(this);
        this.add(b);
        this.add(l);

        this.setBackground(Color.red);
        this.setVisible(true);
        this.pack();
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b) {
            Color color = JColorChooser.showDialog(null,"Picking the color",Color.BLACK);
            l.setForeground(color);
        }
    }
    public static void main(String[] args) {
        new TextColor();
    }
}
