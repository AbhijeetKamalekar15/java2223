import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import mypkg.Util;
class JFrm2 extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    JFrm2()
    {
        super("Login");
        l1=new JLabel("ID");
        l2=new JLabel("Password");
        t1=new JTextField(10);
        b1=new JButton("Login");
        b2=new JButton("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new GridLayout(3,2,5,5));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b1)
        {
            String a=t1.getText();
            // String c=t2.getText();
            if(a.equals("operator"))
            {
                String c=t2.getText();
                if(c.equals("abc@1234"))
                    Util.display("Login Success");
                else
                    Util.display("Wrong password");
            }
            else
                Util.display("Invalid Id");
        }
    }

    public static void main(String[] args)
    {
        JFrm2 a=new JFrm2();
    }
}