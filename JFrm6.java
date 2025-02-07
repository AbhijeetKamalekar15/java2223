import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JFrm6 extends JFrame 
{ 
    JList list;
    JLabel l1;
    String[] city={"Sangli","kolhapur","solapur","ratnagiri","vijapur","pune","mumbai","buldhana","beed","kagal"};
    JFrm6()
    {
        super("UseList");
        l1=new JLabel("Choose city");
        list=new JList(city);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e)
            {
                int choice=list.getSelectedIndex();
                if(choice==-1)
                l1.setText("Choose city");
                else
                l1.setText("Current Selection"+city[choice]);
            }
        });
        setLayout(new FlowLayout());
        JScrollPane jsp=new JScrollPane(list);
        jsp.setPreferredSize(new Dimension(200,300));
        add(jsp);
        add(l1);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {
        JFrm6 a=new JFrm6();
    }
    
}