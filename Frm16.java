//Pragram to draw rectangle using two point method
import java.awt.*;
import java.awt.event.*;
class Frm16 extends Frame
{
    int x,y,w,h,flg;
    Frm16()
    {
        super("Rectangles");
        flg=0;
        addWindowListener(new WindowAdapter()
        {
            public void windowCLosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
                x=e.getX();y=e.getY();
                w=h=0;
            }
            public void mouseReleased(MouseEvent e)
            {
                w=e.getX()-x;h=e.getY()-y;
            }
        });
        addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseDragged(MouseEvent e)
            {
                draw();
                w=e.getX()-x;
                h=e.getY()-y;
                draw();
            }
        });
        w=h=0;
        setSize(600,600);
        setVisible(true);
    }
    void draw()
    {
        Graphics g=getGraphics();
        g.setXORMode(Color.WHITE);
        g.drawRect(x,y,w,h);
    }
    public static void main(String[] args)
    {
        Frm16 a=new Frm16();
    }
}