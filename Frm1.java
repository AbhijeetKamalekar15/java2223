import java.awt.*;
import java.awt.event.*;
import java.awt.*;
class Frm1 extends Frame
{
    Frm1(String s)
    {
        super(s);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        Frm1 a=new Frm1("Window");
    }
}