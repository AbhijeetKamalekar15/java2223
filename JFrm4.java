import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JFrm4 extends JFrame  
{
    JLabel l1;
    JFrm4()
    {
        super("Frame");
        l1=new JLabel(new ImageIcon("img4.jpg"));
        add(l1);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        JFrm4 a=new JFrm4();
    } 
}