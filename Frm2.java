//Use of button
import java.awt.*;
import java.awt.event.*;
class Frm2 extends Frame implements ActionListener
{
    Button btn;
    Frm2(String s)
    {
        super(s);
        btn=new Button("Exit");
        btn.addActionListener(this);
        setLayout(null);
        btn.setBounds(50,100,100,20);
        add(btn);
        setSize(200,220);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
    public static void main(String[] args)
    {
        Frm2 a=new Frm2("Button");
    }
}