import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Frm22 extends Frame implements ActionListener,TextListener
{
    Button bn,bo,bs,bx;
    Panel p;
    TextArea ta;
    String str;
    boolean flg;
    Frm22()
    {
        super("Editor");
        flg=false;
        bn=new Button("New");
        bo=new Button("Open");
        bs=new Button("Save");
        bx=new Button("Exit");
        bn.addActionListener(this);
        bo.addActionListener(this);
        bs.addActionListener(this);
        bx.addActionListener(this);
        p=new Panel();
        p.add(bn);p.add(bo);p.add(bs);p.add(bx);
        add(p,BorderLayout.SOUTH);
        ta=new TextArea("",10,80,TextArea.SCROLLBARS_BOTH);
        ta.addTextListener(this);
        add(ta,BorderLayout.CENTER);
        setSize(400,300);
        setVisible(true);
    }
    public void textValueChanged(TextEvent e)
    {
        flg=true;
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==bn)
        {
            ta.setText("");
            flg=false;
        }
        if(b==bo)
        {
            open();
            flg=false;
        }
        if(b==bs)
        {
            save();
            flg=false;
        }
        if(b==bx)
        {
            if(flg==true)
            {
                if(JOptionPane.showConfirmDialog(null,"Want to save?")==JOptionPane.YES_OPTION);
                save();
            }
            System.exit(0);
        }
    }
    public void open()
    {
        FileDialog fd=null; int val=0; str="";
        fd=new FileDialog(this,"Open",FileDialog.LOAD);
        fd.setVisible(true);
        String fnm=fd.getDirectory()+fd.getFile();
        File f=new File(fnm);
        FileInputStream fis=null;
        try
        {
            fis=new FileInputStream(f);
            while(true)
            {
                val=fis.read();
                if(val==-1)
                    break;
                str=str+(char)val;
            }
            fis.close();
            ta.setText(str);
        }
        catch(Exception e1)
        {}

    }
    public void save()
    {
        FileDialog fd=null; 
        int i=0;
        str=ta.getText();
        char[]ch=new char[str.length()];
        ch=str.toCharArray();
        fd=new FileDialog(this,"Save",FileDialog.SAVE);
        fd.setVisible(true);
        String fnm=fd.getDirectory()+fd.getFile();
        File f=new File(fnm);
        FileOutputStream fos=null;
        try
        {
            fos=new FileOutputStream(f);
            while(i<ch.length)
            {
                fos.write(ch[i]);
                i++;
            }
            fos.close();
        }
        catch(Exception e1)
        {}

    }
    public static void main(String[] args)
    {
        Frm22 a=new Frm22();
    }
}
