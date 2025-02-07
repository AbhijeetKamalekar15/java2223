import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
   <applet code="app2.java" width=400 height=400>
   </applet>  
*/
public class app2 extends Applet
{
    int x,y;
    Color cr;
    public void init()
    {
        addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e)
            {
                x=e.getX();
                y=e.getY();
                draw();
            }    
        });
    }
    void draw()
    {
        Graphics g=getGraphics();
        cr=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        g.setColor(cr);
        g.fillOval(x,y,20,20);
    }
    public void paint(Graphics g)
    {}
}