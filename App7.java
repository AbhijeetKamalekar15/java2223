import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
   <applet code="App7.java" width=400 height=400>
   </applet>  
*/
public class App7 extends Applet implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    public void init()
    {
        l1=new Label("No");
        l2=new Label("Name");
        t1=new TextField(10);
        t2=new TextField(30);
        b1=new Button("OK");
        b2=new Button("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new GridLayout(3,2,5,5));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
    }
    public void paint(Graphics g)
    {

    }
    public void actionPerformed(ActionEvent e)
    {
        t1.setText("");
        t2.setText("");
        t1.requestFocus();
    }
}