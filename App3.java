import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
   <applet code="App3.java" width=400 height=400>
   </applet>  
*/
public class App3 extends Applet
{
    int x,y;
    Color cr;
    public void init()
    {
        cr=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        x=10;
        y=10;
        addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode()==KeyEvent.VK_UP)
                {
                    if(--y<10)
                        y=10;
                    repaint();
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN)
                {
                    if(++y<590)
                        y=590;
                    repaint();
                }
                if(e.getKeyCode()==KeyEvent.VK_LEFT)
                {
                    if(--x<10)
                        x=10;
                    repaint();
                }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT)
                {
                    if(++x>590)
                        x=590;
                    repaint();
                }
            }
        });
    }
    public void paint(Graphics g)
    {
        g.setColor(cr);
        g.fillOval(x,y,30,30);
    } 
}