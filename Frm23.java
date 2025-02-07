//Calculator
import java.awt.*;
import java.awt.event.*;

class Frm23 extends Frame implements ActionListener
{
    int val1,val2,res,flg;
    char ch,opr;
    Button[] btn;
    Panel pan;
    TextField t1;
    String str;

    Frm23()
    {
        super("Calci");
        str="";
        String[] cap=new String[]{"1","2","3","+","4","5","6","-","7","8","9","*","0","=","C","/"};
        btn=new Button[16];
        pan=new Panel();
        pan.setLayout(new GridLayout(4,4,5,5));
        for(int i=0;i<16;i++)
        {
            btn[i]=new Button(cap[i]);
            btn[i].addActionListener(this);
            pan.add(btn[i]);
        }
        add(pan,BorderLayout.CENTER);
        t1=new TextField(10);
        t1.setEditable(false);
        add(t1,BorderLayout.NORTH);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setSize(300,400);
        setResizable(false);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        ch=(e.getActionCommand()).charAt(0);
        if(ch=='C')
        {
            str="";
            flg=0;
            t1.setText(str);
            return;
        }
        if(ch=='=')
        {
            if(flg==1)
            {
                try
                {
                    val2=Integer.parseInt(str);
                }
                catch(Exception e1){}
                comp();
                flg=0;
                str="";
            }
            return;
        }
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
        {
            if(flg==0)
            {
                try
                {
                    val1=Integer.parseInt(str);
                }
                catch(Exception e1){}
                str="";
                flg=1;
                opr=ch;
            }
            else
            {
                try
                {
                    val2=Integer.parseInt(str);
                }
                catch(Exception e1){}
                comp();
                str="";
                opr=ch;
                val1=res;
            }
            return;
        }
        str=str+ch;
        t1.setText(str);
    }
    void comp()
    {
        switch(opr)
        {
            case '+':
                res=val1+val2;break;
            case '-':
                res=val1-val2;break;
            case '/':
                res=val1/val2;break;
            case '*':
                res=val1*val2;break;
        }
        t1.setText(""+res);
    }
    public static void main(String[] args)
    {
        Frm23 a=new Frm23();
    }
}