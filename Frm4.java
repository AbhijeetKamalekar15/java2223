import java.awt.*;
import java.awt.event.*;
class Frm4 extends Frame implements ActionListener
{
    Button b1,b2;
    Color cr;
    Frm4()
    {
        super("Background Colors");
        b1=new Button("Color");
        b2=new Button("Exit");

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);
        b1.setBounds(50,100,100,20);
        b2.setBounds(170,100,100,20);

        add(b1);
        add(b2);

        setSize(320,220);
        setResizable(false);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b2)
            System.exit(0);
        else
        {
            int r1=(int)(Math.random()*255);
            int g1=(int)(Math.random()*255);
            int b1=(int)(Math.random()*255);
            cr=new Color(r1,g1,b1);
            setBackground(cr);
        }
    }
    public static void main(String[] args)
    {
        Frm4 a=new Frm4();
    }
}