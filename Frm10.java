import java.awt.event.*;
import java.awt.*;
import mypkg.Util;
public class Frm10 extends Frame implements ActionListener,FocusListener{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    int no,mrk;
    String nm;
    Frm10(String s)
    {
        super(s);
        l1=new Label("Roll no");
        l2=new Label("Name");
        l3=new Label("Marks");
        t1=new TextField(10);
        t2=new TextField(30);
        t3=new TextField(10);
        b1=new Button("ok");
        b2=new Button("Clear");
        t3.addFocusListener(this);
        t1.addFocusListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new GridLayout(4,2,5,5));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        addWindowListener(new WindowAdapter()
        {
        public void windowClosing(WindowEvent e)
        {
        System.exit(0);
         } 
        });
         
         setSize(400,400);
         setResizable(false);
         setVisible(true);
        } 
        public void focusGained(FocusEvent e){}
        public void focusLost(FocusEvent e)
        {
            TextField t=(TextField)e.getSource();
            if(t==t1)
            
        {  try
            {
                no=Integer.parseInt(t1.getText());
            }
            catch(Exception e1)
            {
                t1.requestFocus();
                return;
            }
            if(no<=0)
            {
                t1.requestFocus();
                return;
            }
    
        }

        else
        {
            try
            {
                mrk=Integer.parseInt(t3.getText());
            }
            catch(Exception e2)
            {
                t3.requestFocus();
                return;
            }
            if(mrk<0||mrk>100)
            {
                t3.requestFocus();
                return;
            }
        }
        }

        public void actionPerformed(ActionEvent e)
        {
            Button b=(Button)e.getSource();
            if(b==b1)
            {
                nm=t2.getName();
                String a="Roll No"+no+"\nName"+nm+"\nMarks"+mrk;
                Util.display(a);
            }
            t1.setText("1");
            t2.setText("0");
            t1.requestFocus();
        }
        public static void main(String[] args) {
            Frm10 a=new Frm10("Student");
        }



    

        

        
    
}