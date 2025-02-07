import java.awt.event.*;
import java.awt.*;
class CT1 extends Thread
{
    int x,y;
    Graphics g;
    CT1(Graphics g)
    {
        super();
        this.g=g;
        start();
    }
    public void run()
    {
        while(true)
        {
            x=(int)(Math.random()*400);
            y=(int)(Math.random()*400);
            g.drawString("Welcome",x,y);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}
class CT2 extends Thread
{
    int x,y;
    Graphics g;
    CT2(Graphics g)
    {
        super();
        this.g=g;
        start();
    }
    public void run()
    {
        while(true)
        {
            x=(int)(Math.random()*400);
            y=(int)(Math.random()*400);
            g.drawOval(x,y,20,20);
            try
            {
                Thread.sleep(700);
            }
            catch(Exception e){}
        }
    }
}
class CT3 extends Thread
{
    int x,y;
    Graphics g;
    CT3(Graphics g)
    {
        super();
        this.g=g;
        start();
    }
    public void run()
    {
        while(true)
        {
            x=(int)(Math.random()*400);
            y=(int)(Math.random()*400);
            g.drawRect(x,y,20,20);
            try
            {
                Thread.sleep(700);
            }
            catch(Exception e){}
        }
    }
}
public class Thread7 extends Frame implements Runnable
{
    
    CT1 a;
    CT2 b;
    CT3 c;
    Thread7()
    {
        super();
        setSize(400,400);
        setVisible(true);
        a=new CT1(getGraphics());
        b=new CT2(getGraphics());
        c=new CT3(getGraphics());
        new Thread(this).start();
    }
    public void paint(Graphics g)
    {}
    public void run()
    {
        while(true)
        {
            try
            {
                Thread.sleep(5000);
            }
            catch(Exception e){}
            repaint();
        }
    }
    public static void main(String []args)
    {
        Thread7 obj=new Thread7();
    }
}
