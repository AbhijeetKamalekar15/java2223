import java.awt.*;
import java.awt.event.*;
class Frm14 extends Frame
{
    int x,y;
    Frm14()
    {
        super("Mouse");
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                x=e.getX();
                y=e.getY();
                draw();
            }
        });
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setSize(600,600);
        setVisible(true);
    }
    void draw()
    {
        int r=(int)(Math.random()*255);
        int g=(int)(Math.random()*255);
        int b=(int)(Math.random()*255);
        Color cr=new Color(r,g,b);
        Graphics g1=getGraphics();
        g1.setColor(cr);
        g1.drawRect(x,y,30,30);
    }
    public static void main(String[] args)
    {
        Frm14 a=new Frm14();
    }
}