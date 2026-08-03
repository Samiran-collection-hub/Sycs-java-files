import javax.swing.*;

public class borT {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JPanel p=new JPanel();
        p.setBounds(0, 0, 200, 200);
        p.setBorder(BorderFactory.createTitledBorder("Title"));
        
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.add(p);
    }
}
