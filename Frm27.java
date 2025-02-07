import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.imageio.*;
class MyPanel extends Panel 
{
    Image img;
    MyPanel()
    {
        super();
    }
    void setImage(Image i)
    {
        img=i;
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,0,0,100,100,this);
    }
}
public class Frm27 extends Frame
{
    MyPanel pan;
    Image img;
    Frm27()
    {
        super("Image");
        try
        {
            img=(Image)ImageIO.read(new File("d:\\java2223\\img0.jpg"));
        }
        catch(Exception e){}
        pan=new MyPanel();
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
    Frm27 a=new Frm27();
    }
}