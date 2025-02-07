import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
   <applet code="App6.java" width=400 height=400>
   </applet>  
*/
public class App6 extends Applet
{
    int lcnt,rcnt;
    public void init()
    {
        lcnt=rcnt=0;
        addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e)
            {
                if(e.getButton()==MouseEvent.BUTTON1)
                    lcnt++;
                else
                    rcnt++;
                repaint();
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawString("L-"+lcnt+"R-"+rcnt,100,100);
    }
}