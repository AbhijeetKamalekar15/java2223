//Use of button
import java.awt.*;
import java.awt.event.*;
class Frm3 extends Frame implements ActionListener
{
    Button btn;
    Frm3(String s)
    {
        super(s);
        btn=new Button("Exit");
        btn.addActionListener(this);
        // setLayout(null);
        // btn.setBounds(50,100,100,20);
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
        Frm3 a=new Frm3("Button");
    }
}