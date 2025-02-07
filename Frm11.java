//use of Panel class
import java.awt.*;
import java.awt.event.*;
class Frm11 extends Frame implements ActionListener,FocusListener
{
    int v1,v2,res;
    char opr;
    Panel p,q;
    Button ba,bs,bm,bd;
    Label l1,l2,l3,l4;
    TextField t1,t2;
    Frm11()
    {
        super("Calci");
        l1=new Label("Value 1");
        l2=new Label("Value 2");
        l3=new Label("Result");
        l4=new Label("");
        t1=new TextField(10);
        t2=new TextField(10);
        // t3=new TextField(10);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        p=new Panel();
        p.setLayout(new GridLayout(3,2,5,5));
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(l4);
        add(p,BorderLayout.CENTER);
        ba=new Button("+");
        bs=new Button("-");
        bm=new Button("*");
        bd=new Button("/");
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        q=new Panel();
        q.add(ba);
        q.add(bs);
        q.add(bm);
        q.add(bd);
        add(q,BorderLayout.SOUTH);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setSize(400,400);
        setVisible(true);
    }
    void comp()
    {
        switch(opr)
        {
            case '+':
                res=v1+v2;break;
            case '-':
                res=v1-v2;break;
            case '*':
                res=v1*v2;break;
            case '/':
                res=v1/v2;break;
        }
        l4.setText(""+res);
    }
    public void focusGained(FocusEvent e)
    {}
    public void focusLost(FocusEvent e)
    {
        TextField t=(TextField)e.getSource();
        if(t==t1)
        {
            try
            {
                v1=Integer.parseInt(t1.getText());
            }
            catch(Exception e1)
            {
                t1.requestFocus();
                return;
            }
            if(v1==0)
            {
                t1.requestFocus();
                return;
            }
        }
        if(t==t2)
        {
            try
            {
                v2=Integer.parseInt(t2.getText());
            }
            catch(Exception e1)
            {
                t2.requestFocus();
                return;
            }
            if(v2==0)
            {
                t2.requestFocus();
                return;
            }
            // comp();
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        opr=(e.getActionCommand()).charAt(0);
        comp();
    }
    public static void main(String[] args)
    {
        Frm11 a=new Frm11();
    }
}