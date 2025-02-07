//File creation using byte stream classes
import java.io.*;
import mypkg.Util;
class WBData
{
    public static void main(String[] args)
    {
        int val=0;
        FileOutputStream fos=null;
        try
        {
            fos=new FileOutputStream("num.dat");
            while(true)

            {
                val=Util.iInput("Number");
                if(val==0)
                    break;
                fos.write(val);
            }
            fos.close();
        }
        catch(Exception e){}
    }
}