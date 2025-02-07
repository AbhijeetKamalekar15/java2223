import java.awt.*;
import java.awt.event.*;

import javax.swing.event.MouseInputAdapter;

import java.applet.*;
/*
   <applet code="App5.java" width=400 height=400>
   </applet>  
*/
public class App5 extends Applet
{
    int x,y,w,h,flg;
    Image img;
    public void init()
    {
        img=getImage(getDocumentBase(),"img0.jpg");
        flg=0;
        x=y=10;
        w=h=100;
        addMouseListener(new MouseInputAdapter() 
        {
            public void mouseClicked(MouseEvent e)
            {
                if(flg==0)
                {
                    x=e.getX();
                    y=e.getY();
                    w=h=0;
                    flg=1;
                }
                else
                {
                    w=e.getX()-x;
                    h=e.getY()-y;
                    flg=0;
                    repaint();
                }
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,x,y,w,h,this);
    }
}