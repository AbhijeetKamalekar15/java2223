import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.imageio.*;
class MyPanel extends Panel 
{
    Image img;
    int x,y;
    MyPanel()
    {
        super();
        x=y=0;
    }
    MyPanel(Image i)
    {
        super();
        img=i;
        x=y=0;
    }
    void setImage(Image i)
    {
        img=i;
        // repaint();
        x=y=0;
    }
    void draw(int a,int b)
    {
        x=a;
        y=b;
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,x,y,this);
    }
}
public class Frm28 extends Frame
{
    int x,y;
    MyPanel pan;
    Image img;
    Frm28()
    {
        super("Image");
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
                x=e.getX();
                y=e.getY();
                pan.draw(x,y);
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
    Frm28 a=new Frm28();
    }
}
