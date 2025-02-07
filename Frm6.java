import java.awt.*;
import java.awt.event.*;
import mypkg.Util;
class Frm6 extends Frame implements WindowListener,ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    String id,pwd;
    Frm6()
    {
        super("Login");
        l1=new Label("ID");
        l2=new Label("Password");
        t1=new TextField(10);
        t2=new TextField(20);
        t2.setEchoChar('*');
        b1=new Button("Ok");
        b2=new Button("clear");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new GridLayout(3,2,5,5));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        addWindowListener(this);
        setSize(300,300);
        setResizable(false);
        setVisible(true);
        id="Operater";
        pwd="Pab#1234";
    }
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Opened");
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Closed");
    }
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Iconified");
    }
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Deiconified");
    }
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Activated");
    }
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Deactivated");
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b1)
        {
            String p=t1.getText();
            String q=t2.getText();
            if(p.equals(id))
            {
                if(q.equals(pwd))
                    Util.display("Succes");
                else
                    Util.display("Wrong Password");
            }
            else
                Util.display("Invalid Id");
        }
        t2.setText("");
        t1.setText("");
        t1.requestFocus();
    }
    public static void main(String[] args)
    {
        Frm6 a=new Frm6();
    }

}