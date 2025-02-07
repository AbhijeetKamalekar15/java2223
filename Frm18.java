import java.awt.*;
import java.awt.event.*;
import mypkg.Util;

class AccDialog extends Dialog implements ActionListener
{
    Label lno,lnm,lbal;
    TextField tno,tnm,tbal;
    Button bok,bcl;
    int no,bal;
    String nm;
    AccDialog(Frame prnt,String title,boolean state)
    {
        super(prnt,title,state);
        lno=new Label("A/C No");
        lnm=new Label("name");
        lbal=new Label("Balance");
        tno=new TextField(10);
        tnm=new TextField(40);
        tbal=new TextField(10);
        bok=new Button("ok");
        bcl=new Button("clear");
        bok.addActionListener(this);
        bcl.addActionListener(this);
        setLayout(new GridLayout(4,2,5,5));
        add(lno);
        add(tno);
        add(lnm);
        add(tnm);
        add(lbal);
        add(tbal);
        add(bok);
        add(bcl);
        setSize(400,300);
        addWindowListener(new WindowAdapter(){
            
                public void windowClosing(WindowEvent e)
                {
                    setVisible(false);
                }
            
            });

    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==bok)
        {
            try
            {
                no=Integer.parseInt(tno.getText());
            }
            catch(Exception e1)
            {
                tno.requestFocus();
                  return;
            }
            if(no<=0)
            {
                tno.requestFocus();
                return;
            }
            nm=tnm.getText();
            try
            {
                bal=Integer.parseInt(tbal.getText());
            }
            catch(Exception e2)
            {
                tbal.requestFocus();
                return;
            }
            if(bal<=0)
            {
                tbal.requestFocus();
                return;
            }
            String s="A*c No:"+no+"\nName"+nm+"\nBalance:"+bal;
            Util.display(s);
        }
        tbal.setText("");
        tnm.setText("");
        tno.setText("");
        tno.requestFocus();
    }

}public class Frm18 extends Frame implements ActionListener
{
    Button ba;
    AccDialog da;
    Frm18()
    {
        super("Dialog");
        ba=new Button("Dialog");
        ba.addActionListener(this);
        setLayout(null);
        ba.setBounds(100,100,100,20);
        add(ba);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setSize(300,220);
        setVisible(true);
        setResizable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        da=new AccDialog(this, "A/C", true);
        da.setVisible(true);
    }
    public static void main(String[] args) {
        Frm18 a=new Frm18();
    }
}