import javax.swing.*;
import java.awt.event.*;

public class menub implements ActionListener{
    JFrame f;
    JMenuBar mb;
    JMenu fileM,viewM,helpM;
    JMenuItem savei,loadi,exiti;
    menub(){
        f=new JFrame("menu item");
        mb=new JMenuBar();

        fileM=new JMenu("File");
        viewM=new JMenu("View");
        helpM=new JMenu("Help");

        savei=new JMenuItem("Save");
        loadi=new JMenuItem("Load");
        exiti=new JMenuItem("Exit");
        savei.addActionListener(this);
        loadi.addActionListener(this);
        exiti.addActionListener(this);

        fileM.add(savei);
        fileM.add(loadi);
        fileM.add(exiti);

        mb.add(fileM);
        mb.add(viewM);
        mb.add(helpM);
        f.setJMenuBar(mb);
        
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==savei){
            System.out.println("item saved!");
        }
        if(e.getSource()==loadi){
            System.out.println("item loved!");
        }
        if(e.getSource()==exiti){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new menub();
    }
}
