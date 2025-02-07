//define a program to write student class object to the file
import mypkg.Student;
import mypkg.Util;
import java.io.*;
class WObject
{
    public static void main(String[] args) {
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        Student ref=null;
        int no=0;
        try{
            fos =new FileOutputStream("stu123.dat");
            oos=new ObjectOutputStream(fos);
            while(true)
            {
                no=Util.iInput("Roll No");
                if(no==0)
                break;
                ref=new Student();
                ref.setData(no);
                oos.writeObject(ref);
            }
            oos.close();
            fos.close();

        }
        catch(Exception e){}
    }
}