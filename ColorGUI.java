import javax.swing.*;

public class ColorGUI {
    JFrame f;
    JColorChooser cc;

    public ColorGUI(){
        f=new JFrame("Colar chooser");
        cc=new JColorChooser();
        f.add(cc);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,400);
    }
    public static void main(String[] args) {
        new ColorGUI();
    }
}
