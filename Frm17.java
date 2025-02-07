import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class Shape implements Serializable
{
    int x,y,w,h;
    Color cr;
    int shp;
    Shape(int a,int b,int c,int d,Color e,int f)
    {
        x=a;y=b;
        w=c;h=d;
        cr=e;
        shp=f;
    }
    void draw(Graphics g)
    {
        g.setColor(cr);
        if(shp==1)
            g.drawOval(x,y,w,h);
        if(shp==2)
            g.drawRect(x,y,w,h);
    }
}

class Frm17 extends Frame
{
    LinkedList<Shape> ls;
    int x,y,w,h,flg,shp;
    Color cr;
    Shape obj;
    Frm17()
    {
        super("Paint");
        ls=new LinkedList<Shape>();
        shp=1;flg=0;
        addWindowListener(new WindowAdapter()
        {
            public void windowOpened(WindowEvent e)
            {
                load();
            }
            public void windowClosing(WindowEvent e)
            {
                save();
                System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter()
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
                    int a=(int)(Math.random()*255);
                    int b=(int)(Math.random()*255);
                    int c=(int)(Math.random()*255);
                    cr=new Color(a,b,c);
                    obj=new Shape(x,y,w,h,cr,shp);
                    ls.add(obj);
                    repaint();
                    flg=0;
                }
            }
        });
        setSize(600,600);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        int i=0,n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            obj.draw(g);
            i++;
        }
    }
    public void load()
    {
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try
        {
            fis=new FileInputStream("Shape.dat");
            ois=new ObjectInputStream(fis);
            ls=(LinkedList<Shape>)ois.readObject();
            fis.close();
            ois.close();
        }
        catch(Exception e){}
    }
    public void save()
    {
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try
        {
            fos=new FileOutputStream("Shape.dat");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
            fos.close();
        }
        catch(Exception e){}
    }
    public static void main(String[] args)
    {
        Frm17 a=new Frm17();
    }
}