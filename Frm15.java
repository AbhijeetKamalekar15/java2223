//Pragram to draw rectangle using two point method
import java.awt.*;
import java.awt.event.*;
class Frm15 extends Frame
{
    int x,y,w,h,flg;
    Frm15()
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
            public void mouseClicked(MouseEvent e)
            {
                if(flg==0)
                {
                    x=e.getX();y=e.getY();
                    flg=1;
                }
                else
                {
                    w=e.getX()-x;
                    h=e.getX()-y;
                    draw();
                    flg=0;
                }
            }
        });
        setSize(400,400);
        setVisible(true);
    }
    void draw()
    {
        int a=(int)(Math.random()*225);
        int b=(int)(Math.random()*225);
        int c=(int)(Math.random()*225);
        Graphics g=getGraphics();
        g.setColor(new Color(a,b,c));
        g.drawRect(x,y,w,h);
    }
    public static void main(String[] args)
    {
        Frm15 a=new Frm15();
    }
}