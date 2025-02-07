import java.awt.event.*;
import java.awt.*;
class T1 extends Thread
{
    int x,y;
    Graphics g;
    T1(Graphics g)
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
class T2 extends Thread
{
    int x,y;
    Graphics g;
    T2(Graphics g)
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
class T3 extends Thread
{
    int x,y;
    Graphics g;
    T3(Graphics g)
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
public class Thread6 extends Frame
{
    
    T1 a;
    T2 b;
    T3 c;
    Thread6()
    {
        super();
        setSize(400,400);
        setVisible(true);
        a=new T1(getGraphics());
        b=new T2(getGraphics());
        c=new T3(getGraphics());
    }
    public static void main(String []args)
    {
        Thread6 obj=new Thread6();
    }
}
