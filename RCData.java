//program to read file abc.txt using steam file classes
import java.io.*;
class RCData
{
    public static void main(String[] args)
    {
        int val=0;
        File f=new File("abc.txt");
        if(f.exists()==false)
        {
            System.out.println("File not found");
            return;
        }
        FileReader fr=null;
        try
        {
            fr=new FileReader(f);
            while(true)
            {
                val=fr.read();
                if(val==-1)
                    break;
                System.out.println((char)val);
            }
            fr.close();
        }
        catch(Exception e){}
    }
}