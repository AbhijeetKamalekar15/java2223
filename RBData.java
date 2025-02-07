import java.io.*;
import mypkg.Util;
class RBData
{
    public static void main(String[] args)
    {
        int val=0;
        FileInputStream fis=null;
        try
        {
            fis=new FileInputStream("num.dat");
            while(true)
            {
                val=fis.read();
                if(val==-1)
                    break;
                System.out.println(val);
            }
            fis.close();
        }
        catch(Exception e){}
    }
}