import java.awt.*;
import java.awt.event.*;

class Frm25 extends Frame implements ActionListener
{
    Label l1,l2;
    CheckboxGroup cg1,cg2;
    Checkbox y1,y2,y3,y4;
    Checkbox t1,t2,t3,t4,t5;
    Button b1,b2;
    Frm25()
    {
        super("RadioButton");
        setLayout(new FlowLayout());
        l1=new Label("Year");
        l2=new Label("Trade");
        cg1=new CheckboxGroup();
        y1=new Checkbox("I",cg1,true);
        y2=new Checkbox("II",cg1,false);
        y3=new Checkbox("III",cg1,false);
        y4=new Checkbox("IV",cg1,false);
        cg2=new CheckboxGroup();
        t1=new Checkbox("Tronics",cg2,true);
        t2=new Checkbox("Trical",cg2,false);
        t3=new Checkbox("IT",cg2,false);
        t4=new Checkbox("CSE",cg2,false);
        t5=new Checkbox("Mech",cg2,false);
        add(l1);
        add(y1);add(y2);add(y3);add(y4);
        add(l2);
        add(t1);add(t2);add(t3);add(t4);add(t5);
        b1=new Button("OK");
        b2=new Button("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);add(b2);
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
            String s="Year:"+(cg1.getSelectedCheckbox()).getLabel()+"\nTrade:"+(cg2.getSelectedCheckbox()).getLabel();
            System.out.println(s);
        }
    }
    public static void main(String[] args)
    {
        Frm25 a=new Frm25();
    }
}