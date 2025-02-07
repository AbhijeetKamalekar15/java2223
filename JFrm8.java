import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

import java.util.*;
class Trade implements Serializable
{
    int id;
    String nm;
    int cap;
    Trade()
    {
        id=cap=0;
        nm=new String();
    }
    Trade(int id,String nm,int cap)
    {
        this.id=id;
        this.nm=nm;
        this.cap=cap;
    }
    public String toString()
    {
        String a="Trade\n ID:"+id+"\nName"+nm+"\nCapacity:"+cap;
        return a;
    }
}
class TAdd extends JDialog implements ActionListener,FocusListener
{
    Trade obj=null;
    int id,cap;
    String nm;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2;
    LinkedList<Trade>ls;
    TAdd(JFrame frm,String title,boolean state,LinkedList<Trade>ls)
    {
        super(frm,title,state);
        this.ls=ls;
        l1=new JLabel("ID");
        l2=new JLabel("Name");
        l3=new JLabel("Capacity");
        t1=new JTextField(10);
        t2=new JTextField(30);
        t3=new JTextField(10);
        t1.addFocusListener(this);
        t3.addFocusListener(this);
        b1=new JButton("Add");
        b2=new JButton("Back");
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
        setSize(500,500);
    }
    public void focusGained(FocusEvent e){}
    public void focusLost(FocusEvent e)
    {
        JTextField t=(JTextField)e.getSource();
        if(t==t1)
        {
            try
            {
                id=Integer.parseInt(t1.getText());
            }
            catch(Exception e1)
            {
                t1.requestFocus();
                return;
            }
            int i=0,n=ls.size();
            while(i<n)
            {
                obj=ls.get(i);
                if(obj.id==id)
                    break;
                i++;
            }
            if(i!=n)
            {
                JOptionPane.showMessageDialog(null,"Record Exists");
                t1.requestFocus();
                return;
            }
        }
        if(t==t3)
        {
            try
            {
                cap=Integer.parseInt(t3.getText());
            }
            catch(Exception e2)
            {
                t3.requestFocus();
                return;
            }
            nm=t2.getText();
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b2)
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        else
        {
            nm=t2.getText();
            obj=new Trade(id,nm,cap);
            ls.add(obj);
        }
    }
}
class TMod extends JDialog implements ActionListener,FocusListener
{
    Trade obj=null;
    int id,cap;
    String nm;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2;
    LinkedList<Trade>ls;
    TMod(JFrame frm,String title,boolean state,LinkedList<Trade>ls)
    {
        super(frm,title,state);
        this.ls=ls;
        l1=new JLabel("ID");
        l2=new JLabel("Name");
        l3=new JLabel("Capacity");
        t1=new JTextField(10);
        t2=new JTextField(30);
        t3=new JTextField(10);
        t1.addFocusListener(this);
        t3.addFocusListener(this);
        b1=new JButton("Mod");
        b2=new JButton("Back");
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
        setSize(500,500);
    }
    public void focusGained(FocusEvent e){}
    public void focusLost(FocusEvent e)
    {
        JTextField t=(JTextField)e.getSource();
        if(t==t1)
        {
            try
            {
                id=Integer.parseInt(t1.getText());
            }
            catch(Exception e1)
            {
                t1.requestFocus();
                return;
            }
            int i=0,n=ls.size();
            while(i<n)
            {
                obj=ls.get(i);
                if(obj.id==id)
                    break;
                i++;
            }
            if(i==n)
            {
                JOptionPane.showMessageDialog(null,"Record Not Exists");
                t1.requestFocus();
                return;
            }
            else
            {
                t2.setText(obj.nm);
                t3.setText(""+obj.cap);
            }
        }
        if(t==t3)
        {
            try
            {
                cap=Integer.parseInt(t3.getText());
            }
            catch(Exception e2)
            {
                t3.requestFocus();
                return;
            }
            nm=t2.getText();
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b2)
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        else
        {
            nm=t2.getText();
            obj.id=id;
            obj.nm=nm;
            obj.cap=cap;
            t1.requestFocus();
        }
    }
}
class TDel extends JDialog implements ActionListener,FocusListener
{
    Trade obj=null;
    int id,cap;
    String nm;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2;
    LinkedList<Trade>ls;
    TDel(JFrame frm,String title,boolean state,LinkedList<Trade>ls)
    {
        super(frm,title,state);
        this.ls=ls;
        l1=new JLabel("ID");
        l2=new JLabel("Name");
        l3=new JLabel("Capacity");
        t1=new JTextField(10);
        t2=new JTextField(30);
        t3=new JTextField(10);
        t2.setEditable(false);
        t3.setEditable(false);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        b1=new JButton("Del");
        b2=new JButton("Back");
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
        setSize(500,500);
    }
    public void focusGained(FocusEvent e){}
    public void focusLost(FocusEvent e)
    {
        JTextField t=(JTextField)e.getSource();
        if(t==t1)
        {
            try
            {
                id=Integer.parseInt(t1.getText());
            }
            catch(Exception e1)
            {
                t1.requestFocus();
                return;
            }
            int i=0,n=ls.size();
            while(i<n)
            {
                obj=ls.get(i);
                if(obj.id==id)
                    break;
                i++;
            }
            if(i==n)
            {
                JOptionPane.showMessageDialog(null,"Record Not Exists");
                t1.requestFocus();
                return;
            }
            else
            {
                t2.setText(obj.nm);
                t3.setText(""+obj.cap);
            }
        }
        if(t==t3)
        {
            try
            {
                cap=Integer.parseInt(t3.getText());
            }
            catch(Exception e2)
            {
                t3.requestFocus();
                return;
            }
            nm=t2.getText();
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b2)
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        else
        {
            ls.remove(obj);
            t1.requestFocus();
        }
    }
}
class TDialog extends JDialog implements ActionListener
{
    LinkedList<Trade>ls;
    DefaultTableModel dtm;
    JTable jt;
    JButton b1;
    JScrollPane jsp;
    int no,cap;
    String nm;
    int i=0,n=0;
    Trade obj;
    String[][]arr=null;
    String[] colhead={"ID","Name","Capacity"};
    TDialog(JFrame f,String title,boolean state,LinkedList<Trade>ls)
    {
        super(f,title,state);
        this.ls=ls;
        b1=new JButton("Print");
        dtm=new DefaultTableModel(arr,colhead);
        n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            no=obj.id;
            nm=obj.nm;
            cap=obj.cap;
            dtm.insertRow(i,new String[]{""+no,nm,""+cap});
            i++;
        }
        jt=new JTable(dtm);
        jsp=new JScrollPane(jt);
        b1.addActionListener(this);
        add(jsp,BorderLayout.CENTER);
        add(b1,BorderLayout.SOUTH);
        setSize(500,500);
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        if(b==b1)
        {
            try
            {
                jt.print();
            }
            catch(Exception e1){}
        }
    }
}
class JFrm8 extends JFrame
{
    JTree obj;
    TAdd tda;
    TMod tdm;
    TDel tdd;
    TDialog tdisplay;
    DefaultMutableTreeNode t,tr,ta,tm,td,d,da,f,fs,fl;
    LinkedList<Trade>ls;
    JFrm8()
    {
        super("J Tree");
        ls=new LinkedList<Trade>();
         t=new DefaultMutableTreeNode("Trade");
         tr=new DefaultMutableTreeNode("Record");
         ta=new DefaultMutableTreeNode("Add");
         tm=new DefaultMutableTreeNode("Mod");
         td=new DefaultMutableTreeNode("Del");
        tr.add(ta);
        tr.add(tm);
        tr.add(td);
         d=new DefaultMutableTreeNode("Display");
         da=new DefaultMutableTreeNode("DiaplayAll");
        d.add(da);
         f=new DefaultMutableTreeNode("File");
         fs=new DefaultMutableTreeNode("Save");
        fl=new DefaultMutableTreeNode("Load");
        f.add(fs);
        f.add(fl);
        t.add(tr);
        t.add(d);
        t.add(f);
        obj=new JTree(t);
        JScrollPane jsp=new JScrollPane(obj);
        add(jsp,BorderLayout.CENTER);
        obj.addTreeSelectionListener(new TreeSelectionListener()
        {
            public void valueChanged(TreeSelectionEvent e)
            {
                DefaultMutableTreeNode node=(DefaultMutableTreeNode)obj.getLastSelectedPathComponent();
                if(node!=null)
                {
                    Object nodeInfo =node.getUserObject();
                    if(node.isLeaf()&& node==ta)
                    {
                        tda=new TAdd(null,"Add",true,ls);
                        tda.setVisible(true); 
                    }
                    if(node.isLeaf()&& node==tm)
                    {
                        tdm=new TMod(null,"Mod",true,ls);
                        tdm.setVisible(true); 
                    }
                    if(node.isLeaf()&& node==td)
                    {
                        tdd=new TDel(null,"Del",true,ls);
                        tdd.setVisible(true); 
                    }
                    if(node.isLeaf()&& node==fs)
                    {
                        save();
                    }
                    if(node.isLeaf()&& node==fl)
                    {
                        load();
                    }
                    if(node.isLeaf()&&node==da)
                    {
                        tdisplay=new TDialog(null,"Trade Data",true,ls);
                        tdisplay.setVisible(true);
                    }
                }
            }
        });
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    void save()
    {
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try
        {
            fos=new FileOutputStream("trd.dat");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
            fos.close();
        }
        catch(Exception e1){}
    }
    void load()
    {
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try
        {
            fis=new FileInputStream("trd.dat");
            ois=new ObjectInputStream(fis);
            
            ls=(LinkedList<Trade>)ois.readObject();

            ois.close();
            fis.close();
        }
        catch(Exception e1){}
    }
    public static void main(String []args)
    {
        JFrm8 a=new JFrm8();
    }
}