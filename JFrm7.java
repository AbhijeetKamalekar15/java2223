import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class JFrm7 extends JFrame {

    JTree obj;
    JLabel l1;
    JFrm7()
    {
        super("JTree");
        l1=new JLabel("Choice");
        DefaultMutableTreeNode o=new DefaultMutableTreeNode("Choice");
        DefaultMutableTreeNode c=new DefaultMutableTreeNode("City");
        DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Miraj");
        DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Sangli");
        DefaultMutableTreeNode c3=new DefaultMutableTreeNode("Kolhapur");
        c.add(c1);
        c.add(c2);
        c.add(c3);

        DefaultMutableTreeNode d=new DefaultMutableTreeNode("District");
        DefaultMutableTreeNode d1=new DefaultMutableTreeNode("Sangli");
        DefaultMutableTreeNode d2=new DefaultMutableTreeNode("Solapur");
        DefaultMutableTreeNode d3=new DefaultMutableTreeNode("Satard");
        d.add(d1);
        d.add(d2);
        d.add(d3);

        DefaultMutableTreeNode s=new DefaultMutableTreeNode("State");
        DefaultMutableTreeNode s1=new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode s2=new DefaultMutableTreeNode("Karnataka");
        DefaultMutableTreeNode s3=new DefaultMutableTreeNode("Gujrat");
        s.add(s1);
        s.add(s2);
        s.add(s3);

        o.add(c);
        o.add(d);
        o.add(s);
        obj=new JTree(o);
        JScrollPane jsp=new JScrollPane(obj);
        add(jsp,BorderLayout.CENTER);
        add(l1,BorderLayout.SOUTH);
        obj.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e)
            {
                l1.setText("Selection is"+e.getPath());
            }
            
        });
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
       
    }
    public static void main(String[] args) {
        JFrm7 a=new JFrm7();
    }
}