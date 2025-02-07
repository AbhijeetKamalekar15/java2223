import java.awt.*;
import java.awt.event.*;



class Frm13 extends Frame implements MouseListener
{
    int x,y;
    String str;
    Frm13()
    {
        super("MouseListener");
        x=70;y=70;
        str="Mouse";
        addMouseListener(this);
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
    public void paint(Graphics g)
    {
        g.drawString(str,x,y);
    }
    public void mouseEntered(MouseEvent e)
    {
        x=70;y=70;
        str="Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent e)
    {
        x=70;y=70;
        str="Mouse Exited";
        repaint();
    }
    public void mousePressed(MouseEvent e)
    {
        x=e.getX();y=e.getY();
        str="Mouse Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {
        x=e.getX();y=e.getY();
        str="Mouse Released";
        repaint();
    }
    public void mouseClicked(MouseEvent e)
    {
        x=e.getX();y=e.getY();
        str="Mouse Clicked";
        repaint();
    }
    public static void main(String[] args)
    {
        Frm13 a=new Frm13();
    }
}