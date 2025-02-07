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
        g.drawImage(img,0,0,this);
    }
}
public class Frm30 extends Frame implements ActionListener
{
    int index,i;
    Image[] arr;
    MyPanel p1;
    Panel p2;
    Button bf,bl,bp,bn;
    Frm30()
    {
        super("SlideShow");
        arr=new Image[10];
        for(i=0;i<10;i++)
        {
            try
            {
                arr[i]=(Image)ImageIO.read(new File("img"+i+".jpg"));
            }
            catch(Exception e){}
        }
        p1=new MyPanel();
        add(p1,BorderLayout.CENTER);
        bf=new Button("|<");
        bp=new Button("<<");
        bn=new Button(">>");
        bl=new Button(">|");
        bf.addActionListener(this);
        bp.addActionListener(this);
        bn.addActionListener(this);
        bl.addActionListener(this);
        p2=new Panel();
        p2.add(bf);
        p2.add(bp);
        p2.add(bn);
        p2.add(bl);
        add(p2,BorderLayout.SOUTH);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        index=0;
        p1.setImage(arr[index]);
        setSize(700,700);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==bf)
            index=0;
        if(b==bl)
            index=9;
        if(b==bp)
        {
            if(--index<0)
                index=0;
        } 
        if(b==bn)
        {
            if(++index>9)
                index=9;
        }
        p1.setImage(arr[index]);
    }
    public static void main(String[] args)
    {
        Frm30 a=new Frm30();
    }
}
