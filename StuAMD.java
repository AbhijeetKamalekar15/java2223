import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class StuAMD extends Frame implements FocusListener, ActionListener
{
    int no,id;
    String nm,tnm;
    Connection con;
    PreparedStatement pssa,pssm,pssd,psss,psst;
    PreparedStatement psts;
    Label lno,lid,lnm,ltnm;
    TextField tno,tid,tsnm,ttnm;
    Button ba,bm,bd,bx;
    ResultSet rss,rst;
    StuAMD()
    {
        super("Student");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql:\\localhost:3306:wce","root","");
            pssa=con.prepareStatement("insert into Student values("?,?,?")");
            pssm=con.prepareStatement("update Student set.name=? for rno=?");
            pssd=con.prepareStatement("delete from Student where rno=?");
            psst=con.prepareStatement("select a.rno,a.name, from Student a, Trade b b.tnm where a.tid=b.tid");
            psts=con.prepareStatement("select * from trade where tid=?");
            psss=con.prepareStatement("select * from student where rno=?");
        }
        catch(Exception e){}
        lno=new Label("Roll No");
        lnm=new Label("Name");
        lid=new Label("Trade ID");
        ltnm=new Label("Trade Name");
        tno=new TextField(10);
        tno.addFocusListener(this);
        tsnm=new TextField(20);
        tid=new TextField(10);
        tid.addFocusListener(this);
        ttnm=new TextField(20);
        ttnm.setEditable(false);
        ba=new Button("Add");
        bm=new Button("Modify");
        bd=new Button("Delete");
        bx=new Button("Exit");
        ba.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        bx.addActionListener(this);

        Panel p=new Panel();
        p.setLayout(new GridLayout(4,2,5,5));
        p.add(lno);
        p.add(tno);
        p.add(lnm);
        p.add(tsnm);
        p.add(lid);
        p.add(tid);
        p.add(ltnm);
        p.add(ttnm);
        Panel q=new Panel();
        q.add(ba);
        q.add(bm);
        q.add(bd);
        q.add(bx);
        add(p,BorderLayout.CENTER);
        add(q,BorderLayout.SOUTH);
        setSize(400,400);
        setVisible(true);
    }
}
