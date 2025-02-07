import java.awt.*;
import java.awt.event.*;
public class Frm20 extends Frame implements ActionListener {
    MenuBar mb;
    Menu ms,mc,mx;
    MenuItem msl,msr,mso;
    MenuItem mcr,mcg,mcb,mcrnd;
    MenuItem mxn,mxy;
    Color cr;
    int flg,x,y,w,h,shp;
    Frm20()
    {
        super("Menu");
        flg=0;
        msl= new MenuItem("Line");
        msr =new MenuItem("rect");
        mso=new MenuItem("Oval");
        msl.addActionListener(this);
        msr.addActionListener(this);
        mso.addActionListener(this);
        ms=new Menu("Shape");
        ms.add(msl);
        ms.add(msr);
        ms.add(mso);
        mcr=new MenuItem("Red");
        mcg=new MenuItem("Green");
        mcb=new MenuItem("blue");
        mcrnd=new MenuItem("Random");
        mcr.addActionListener(this);
        mcg.addActionListener(this);
        mcb.addActionListener(this);
        mc=new Menu("Color");
        mc.add(mcr);
        mc.add(mcg);
        mc.add(mcb);
        mc.add(mcrnd);
        mxn=new MenuItem("No");
        mxy=new MenuItem("Yes");
        mxn.addActionListener(this);
        mxy.addActionListener(this);
        mx=new Menu("Exit");
        mx.add(mxn);
        mx.add(mxy);
        mb=new MenuBar();
        mb.add(ms);
        mb.add(mc);
        mb.add(mx);
        setMenuBar(mb);
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
                    if(shp==1) //line
                    {
                        w=e.getX();
                        h=e.getY();
                    }
                    else
                    {
                        w=e.getX()-x;
                        h=e.getY()-y;
                        draw();
                        flg=0;
                    }
                    draw();
                    flg=0;
                }
            }
        });
        setSize(600,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        MenuItem a=(MenuItem)e.getSource();
        if(a==msl)
            shp=1;
        if(a==msr)
            shp=2;
        if(a==mso)
            shp=3;
        if(a==mcr)
            cr=new Color(255,0,0);
        if(a==mcg)
            cr=new Color(0,255,0);
        if(a==mcb)
            cr=new Color(0,0,225);
        if(a==mcrnd)
            cr=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        if(a==mxy)
            System.exit(0);
    }
    void draw()
    {
        Graphics g=getGraphics();
        g.setColor(cr);
        switch(shp)
        {
            case 1:
                g.drawLine(x,y,w,h);
                break;
            case 2:
                g.drawRect(x,y,w,h);
                break;
            case 3:
                g.drawOval(x,y,w,h);
        }
    }
    public static void main(String[] args)
    {
        Frm20 a=new Frm20();
    }
}