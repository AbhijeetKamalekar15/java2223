import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.imageio.*;
class MyPanel extends Panel 
{
    Image img;
    int x,y,w,h;
    MyPanel()
    {
        super();
        x=y=0;
        w=h=0;
    }
    MyPanel(Image i)
    {
        super();
        img=i;
        x=y=0;
        w=h=0;
    }
    void setImage(Image i)
    {
        img=i;
        // repaint();
        x=y=0;
    }
    void draw(int a,int b,int c,int d)
    {
        x=a;
        y=b;
        w=c;
        h=d;
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,x,y,w,h,this);
    }
}
public class Frm29 extends Frame
{
    int x,y,w,h,flg;
    MyPanel pan;
    Image img;
    Frm29()
    {
        super("Image");
        flg=0;
        try
        {
            img=(Image)ImageIO.read(new File("d:\\java2223\\img0.jpg"));
        }
        catch(Exception e){}
        pan=new MyPanel();
        pan.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if(flg==0)
                {
                    x=e.getX();
                    y=e.getY();
                    flg=1;
                }
                else
                {
                    w=e.getX()-x;
                    h=e.getY()-y;
                    pan.draw(x,y,w,h);
                    flg=0;
                }
                // x=e.getX();
                // y=e.getY();
                // pan.draw(x,y,w,h);
            }
        });
        add(pan);
        pan.setImage(img);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args)
    {
    Frm29 a=new Frm29();
    }
}