//Scrollbar
import java.awt.*;
import java.awt.event.*;
class Frm21 extends Frame implements ActionListener, FocusListener, AdjustmentListener
{
    int r,g,b;
    Color cr,cg,cb,cclr;
    Button bc,bx;
    Label lr,lg,lb,lclr;
    TextField tr,tg,tb;
    Panel pr,pg,pb,pclr;
    Scrollbar sr,sg,sb;
    Frm21()
    {
        super("Scrollbar");
        r=g=b=0;
        cr=cg=cb=cclr=new Color(255,255,255);
        lr=new Label("R");
        lg=new Label("G");
        lb=new Label("B");
        lclr=new Label("Color");
        pr=new Panel();
        pg=new Panel();
        pb=new Panel();
        pclr=new Panel();
        tr=new TextField();
        tg=new TextField();
        tb=new TextField();
        tr.addFocusListener(this);
        tg.addFocusListener(this);
        tb.addFocusListener(this);
        bc=new Button("Clear");
        bx=new Button("Exit");
        bc.addActionListener(this);
        bx.addActionListener(this);
        sr=new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
        sg=new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
        sb=new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
        sr.addAdjustmentListener(this);
        sg.addAdjustmentListener(this);
        sb.addAdjustmentListener(this);
        setLayout(null);
        lr.setBounds(50,50,50,20);
        sr.setBounds(50,80,50,100);
        pr.setBounds(50,190,50,20);
        tr.setBounds(50,220,50,20);

        lg.setBounds(110,50,50,20);
        sg.setBounds(110,80,50,100);
        pg.setBounds(110,190,50,20);
        tg.setBounds(110,220,50,20);

        lb.setBounds(170,50,50,20);
        sb.setBounds(170,80,50,100);
        pb.setBounds(170,190,50,20);
        tb.setBounds(170,220,50,20);

        lclr.setBounds(230,50,100,20);
        pclr.setBounds(230,80,100,100);
        bc.setBounds(230,190,100,20);
        bx.setBounds(230,220,100,20);

        add(lr);add(lg);add(lb);add(lclr);
        add(sr);add(sb);add(sg);add(pclr);
        add(pr);add(pg);add(pb);add(bc);
        add(tr);add(tg);add(tb);add(bx);

        setSize(380,290);
        setVisible(true);
    }

    public void focusGained(FocusEvent e){}
    
    public void focusLost(FocusEvent e)
    {
        int val=0;
        TextField t=(TextField)e.getSource();
        try
        {
            val=Integer.parseInt(t.getText());
        }
        catch(Exception e1)
        {
            t.requestFocus();
            return;
        }
        if(val<0||val>255)
        {
            t.requestFocus();
            return;
        }
        if(t==tr)
            r=val;
        if(t==tg)
            g=val;
        if(t==tb)
            b=val;
        sr.setValue(r);
        sg.setValue(g);
        sb.setValue(b);
        cr=new Color(r,0,0);
        cg=new Color(0,g,0);
        cb=new Color(0,0,b);
        cclr=new Color(r,g,b);
        pr.setBackground(cr);
        pg.setBackground(cg);
        pb.setBackground(cb);
        pclr.setBackground(cclr);
    }
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        r=sr.getValue();
        g=sg.getValue();
        b=sb.getValue();
        cr=new Color(r,0,0);
        cg=new Color(0,g,0);
        cb=new Color(0,0,b);
        cclr=new Color(r,g,b);
        pr.setBackground(cr);
        pg.setBackground(cg);
        pb.setBackground(cb);
        pclr.setBackground(cclr);
        tr.setText(""+r);
        tg.setText(""+g);
        tb.setText(""+b);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button c=(Button)e.getSource();
        if(c==bx)
            System.exit(0);
        else
        {
            r=g=b=255;
            sr.setValue(r);
            sg.setValue(g);
            sb.setValue(b);
            cr=new Color(r,0,0);
            cg=new Color(0,g,0);
            cb=new Color(0,0,b);
            cclr=new Color(r,g,b);
            sr.setValue(r);
            sg.setValue(g);
            sb.setValue(b);
            tr.setText(""+r);
            tg.setText(""+g);
            tb.setText(""+b);
            pr.setBackground(cr);
            pg.setBackground(cg);
            pb.setBackground(cb);
            pclr.setBackground(cclr);
        
        }
    }
    public static void main(String[] args)
    {
        Frm21 a=new Frm21();
    }
}