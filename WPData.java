//WAP to create a file containing premitive type data
import java.io.*;
import mypkg.Util;
class WPData
{
    public static void main(String [] args)
    {
        DataOutputStream dos=null;
        FileOutputStream fos=null;
        int no=0;
        String nm="";
        double mrk=0.0;
        try
        {
            fos=new FileOutputStream("Stu.dat");
            dos=new DataOutputStream(fos);
            while(true)
            {
                no=Util.iInput("Roll no:");
                if(no==0)
                    break;
                nm=Util.sInput("Name:");
                mrk=Util.dInput("Marks:");
                dos.writeInt(no);
                dos.writeUTF(nm);
                dos.writeDouble(mrk);
            }
            fos.close();
            dos.close();
        }
        catch(Exception e){}
    }
}
