
import javax.swing.*;
import java.awt.*;

public class probar {
    JFrame f=new JFrame("progras bar");
    JProgressBar bar=new JProgressBar();

    probar(){
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);

        f.add(bar);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,200);
        f.setLayout(new FlowLayout());
        fill();
    }
    public void fill(){
        int cot=0;
        while (cot<=100) {
            bar.setValue(cot);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.getStackTrace();
            }
            cot++;
        }
    }
    public static void main(String[] args) {
        new probar();

    }
}
