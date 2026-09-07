import javax.swing.*;

public class tables {
    public static void main(String[] args) {
        JFrame frame=new JFrame("first way");
        String[] col={"Sr.","Name","Status"};
        String[][] data={
            {"1","Alice","Present"},
            {"2","Bob","Working"},
            {"3","Jack","Absent"}
        };
        JTable table=new JTable(data,col);
        JScrollPane Sp=new JScrollPane(table);
        frame.add(Sp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300,200);
    }
}
