import java.awt.*;
import java.awt.event.*;
import mypkg.Util;

class Frm26 extends Frame implements ActionListener
{
    List obj;
    Label l1;
    Button ba,br,bc,bd;
    Frm26()
    {
        super("ListBox");
        l1=new Label("City");
        obj=new List(5);
        ba=new Button("ADD");
        br=new Button("Remove");
        bc=new Button("Clear");
        bd=new Button("Display");
        ba.addActionListener(this);
        br.addActionListener(this);
        bc.addActionListener(this);
        bd.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setLayout(null);
        l1.setBounds(50,50,50,20);
        ba.setBounds(170,50,50,20);
        obj.setBounds(50,90,50,100);
        br.setBounds(170,90,50,20);
        bc.setBounds(170,130,50,20);
        bd.setBounds(170,170,50,20);
        add(l1);
        add(ba);
        add(obj);
        add(br);
        add(bc);
        add(bd);
        setSize(240,240);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==ba)
        {
            String s=Util.sInput("City Name");
            obj.add(s);
        }
        if(b==br)
        {
            int r=obj.getSelectedIndex();
            obj.remove(r);
        }
        if(b==bc)
        {
            obj.removeAll();
        }
        if(b==bd)
        {
            int i=0,cnt=obj.getItemCount();
            while(i<cnt)
            {
                Util.display(obj.getItem(i));
                i++;
            }
        }
    }
    public static void main(String[] args)
    {
        Frm26 a=new Frm26();
    }
}