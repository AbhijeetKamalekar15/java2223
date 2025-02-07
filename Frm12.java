/* Use Linked list to store data
 * Roll no must be unique
 * Marks must be in the range 0-100
 * if record not found 
 *      Enable ADD
 *      disable mod,DEL
 * otherwise
 *      Enable mod,del
 *      disable ADD
 * Save record to file and also load record from file
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import mypkg.Util;

class WStudent implements Serializable {
    int no;
    String nm;
    int mrk;

    WStudent() {
        no = mrk = 0;
        nm = new String();
    }

    WStudent(int a, String b, int c) {
        no = a;
        nm = b;
        mrk = c;
    }

    void setData(int a, String b, int c) {
        no = a;
        nm = b;
        mrk = c;
    }

    int getNo() {
        return no;
    }

    int getMarks() {
        return mrk;
    }

    String getName() {
        return nm;
    }

    public String toString() {
        String a = "Student Data\nRoll No:" + no + "\nName:" + nm + "\nMarks:" + mrk;
        return a;
    }

}

class WStAMD {
    WStudent st;
    LinkedList<WStudent> ls;

    WStAMD() {
        st = null;
        ls = new LinkedList<WStudent>();
    }

    void add(int a, String b, int c) {
        st = new WStudent(a, b, c);
        ls.add(st);
    }

    void mod(int a, String b, int c) {
        st.nm = b;
        st.no = a;
        st.mrk = c;
    }

    void del(int a, String b, int c) {
        ls.remove(st);// element delete from Linked List
    }

    void display() {
        int i = 0, n = ls.size();
        while (i < n) {
            st = ls.get(i);
            Util.display(st.toString());
            i++;
        }

    }

    boolean search(int no) {
        int i = 0, n = ls.size();
        boolean state = false;
        while (i < n) 
        {
            st = ls.get(i);
            if (st.getNo() == no) 
            {
                state = true;
                break;
            }
            i++;
        }
        return state;
    }

    // copy from file
    void load() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("stu2122.dat");
            ois = new ObjectInputStream(fis);
            ls = (LinkedList<WStudent>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
        }
    }

    // copy to file
    void save() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Stu2122.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
            fos.close();
        } catch (Exception e) {
        }
    }
}

public class Frm12 extends Frame implements ActionListener, FocusListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button ba, bm, bd, bdisp;
    Panel p1, p2;
    WStAMD obj;
    int no, mrk;
    String nm;

    Frm12() {
        super("Student");
        l1 = new Label("Roll No");
        l2 = new Label("Name");
        l3 = new Label("Marks");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t1.addFocusListener(this);
        t3.addFocusListener(this);
        p1 = new Panel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1, BorderLayout.CENTER);
        ba = new Button("Add");
        bm = new Button("Mod");
        bd = new Button("Del");
        bdisp = new Button("Display");
        ba.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        bdisp.addActionListener(this);
        p2 = new Panel();
        p2.add(ba);
        p2.add(bm);
        p2.add(bd);
        p2.add(bdisp);
        add(p2, BorderLayout.SOUTH);
        obj = new WStAMD();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                obj.save();
                System.exit(0);
            }

            public void windowOpened(WindowEvent e) {
                obj.load();
            }
        });
        setSize(400, 500);
        setVisible(true);

    }

    public void focusGained(FocusEvent e) {
        TextField t = (TextField) e.getSource();
        if (t == t1) {
            ba.setEnabled(false);
            bm.setEnabled(false);
            bd.setEnabled(false);
        }
    }

    public void focusLost(FocusEvent e) {
        TextField t = (TextField) e.getSource();
        if (t == t1) {
            try {
                no = Integer.parseInt(t1.getText());
            } catch (Exception e1) {
                t1.requestFocus();
                return;
            }
            if (no <= 0) {
                t1.requestFocus();
                return;
            }
            if (obj.search(no) == true) 
            {
                ba.setEnabled(false);
                bm.setEnabled(true);
                bd.setEnabled(true);
                t2.setText(obj.st.nm);
                t3.setText("" + obj.st.mrk);
            } else {
                ba.setEnabled(true);
                bm.setEnabled(false);
                bd.setEnabled(false);
            }

        }
        if (t == t3) {
            try {
                mrk = Integer.parseInt(t3.getText());
            } catch (Exception e2) {
                t3.requestFocus();
                return;
            }
            if (mrk < 0 || mrk > 100) {
                t3.requestFocus();
                return;
            }
            nm = t2.getText();
        }

    }

    public void actionPerformed(ActionEvent e) {
        Button b = (Button) e.getSource();
        if (b == ba) {
            obj.add(no, nm, mrk);
        }
        if (b == bm) {
            obj.mod(no, nm, mrk);
        }
        if (b == bd)
            obj.del(no, nm, mrk);
        if (b == bdisp)
            obj.display();
    }

    public static void main(String[] args) {
        Frm12 a = new Frm12();
    }

}