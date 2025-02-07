//program to add student class object avoiding duplication to the linkesdlist and write linked list to the file
import java.io.*;
import java.util.*;
import mypkg.Student;
import mypkg.Util;
class WObject1
{
    Student ref;
    LinkedList<Student>ls;
    WObject1()
    {
        ref=null;
        ls=new LinkedList<Student>();

    }
    boolean search(int no)
    {
        int i=0,n=ls.size();
        while(i<n)
    {
        ref=ls.get(i);
        if(ref.getNo()==no)
        break;
        i++;
    }
    if(i==n)
    {
        ref=null;
        return false;
    }
    else 
    return true;

    }
    void add()
    {
        int no=Util.iInput("Roll No");
        boolean res=search(no);
        if(res==true)
        {
            Util.display("Record Exists");
            return;
        }
        ref=new Student();
        ref.setData(no);
        ls.add(ref);
    }
    void mod()
    {
        int no=Util.iInput("Roll No");
        boolean res=search(no);
        if(res==false)
        {
            Util.display("Record not Exists");
            return;
        }
        ref.setData(no);
    }
    void delete()
    {
        int no=Util.iInput("Roll No");
        boolean res=search(no);
        if(res==false)
        {
            Util.display("Record not Exists");
            return;
        }
        ls.remove(ref);
    }
    void display()
    {
        int i=0,n=ls.size();
        while(i<n)
        {
            ref=ls.get(i);
            ref.display();
            i++;
        }
    }
    void save()
    {
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try{
            fos=new FileOutputStream("stu1214.dat");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(is);
            oos.close();
            fos.close();
        }
        catch(Exception e){}
    }
    void open()
    {
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try{
            fis=new FileInputStream("stu1214.dat");
            ois=new ObjectInputStream(fis);
            ls=(LinkedList<Student>)ois.readObject();
            ois.close();;
            fis.close();
        }
        catch(Exception e){}
    }
    void menu()
    {
        String []option=new String []{Add,Mod,del,Displayall,Exit};
        int opt=0;
        open();
        while(true)
        {
            opt=Util.oInput("choose Option","Student",option);
            if(opt==4)
            {    
                save();
                break;
            }
            switch(opt)
            {
                case 0:
                    add();break;
                case 1:
                    mod();break;
                case 2:
                    displayall();
                    break;
            }
        }
    }
    public static void main(String[] args) {
        WObject1 a=new WObject1();
        a.menu();
        /*a.add();
        a.add();
        a.add();
        a.display();
        a.mod();
        a.display();
        a.delete();
        a.display();*/
    }
}