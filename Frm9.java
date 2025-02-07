import java.awt.*;
import java.awt.event.*;
import mypkg.Util;
class Frm9 extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    int no,price;
    String nm;
    Frm9(String s)
    {
        super(s);
        l1=new Label("No");
        l2=new Label("Name");
        l3=new Label("Price");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        b1=new Button("Ok");
        b2=new Button("clear");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new GridLayout(4,2,5,5));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
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
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b1)
        {
            try
            {
                no=Integer.parseInt(t1.getText());
            }
            catch(Exception e1)
            {
                t1.requestFocus();
                return;
            }
            if(no<0)
            {
                t1.requestFocus();
                return;
            }
            nm=t2.getText();
            try
            {
                price=Integer.parseInt(t3.getText());
            }
            catch(Exception e1)
            {
                t3.requestFocus();
                return;
            }
            if(price<=0)
            {
                t3.requestFocus();
                return;
            }
            String a="Book Data\nNo:"+no+"\nName:"+nm+"\nPrice:"+price;
            Util.display(a);
        }
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }    
    public static void main(String[] args)
    {
        Frm9 a=new Frm9("Book Data");
    }
}