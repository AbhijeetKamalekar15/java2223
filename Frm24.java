//Use of checkbox
import java.awt.*;
import java.awt.event.*;

class Frm24 extends Frame implements ActionListener
{
    Checkbox c1,c2,c3,c4,c5;
    Button b1,b2;
    Frm24()
    {
        super("Checkbox");
        c1=new Checkbox("East");
        c2=new Checkbox("West");
        c3=new Checkbox("North");
        c4=new Checkbox("South");
        c5=new Checkbox("Centre");
        b1=new Button("OK");
        b2=new Button("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new FlowLayout());
        add(c1);add(c2);add(c3);add(c4);add(c5);
        add(b1);add(b2);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setSize(300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b1)
        {
            String str="Area\n";
            if(c1.getState())
                str=str+"\n"+c1.getLabel();
            if(c2.getState())
                str=str+"\n"+c2.getLabel();
            if(c3.getState())
                str=str+"\n"+c3.getLabel();
            if(c4.getState())
                str=str+"\n"+c4.getLabel();
            if(c5.getState())
                str=str+"\n"+c5.getLabel();
            System.out.println(str);
        }
        c1.setState(false);
        c2.setState(false);
        c3.setState(false);
        c4.setState(false);
        c5.setState(false);
    }
    public static void main(String[] args)
    {
        Frm24 a=new Frm24();
    }
}