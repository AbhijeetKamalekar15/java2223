import java.awt.*;
import java.awt.event.*;

class Frm8 extends Frame
{
    Frm8(String s)
    {
        super(s);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String [] args)
    {
        Frm8 a=new Frm8("Window Adapter");
    }
}