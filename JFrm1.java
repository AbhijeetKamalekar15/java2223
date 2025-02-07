import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JFrm1 extends JFrame
{
    JFrm1()
    {
        super("Swing Frame");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        JFrm1 a=new JFrm1();
    }
}