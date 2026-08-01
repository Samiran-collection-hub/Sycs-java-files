
import javax.swing.*;

public class Dialog {
    JFrame f;
    Dialog(){
        f=new JFrame();
        f.setVisible(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(f, "HEllo everyone !!");
    }
    public static void main(String[] args) {
        new Dialog();

    }
}
