//WAP to copy source file abc.txt with new name pqr.txt
import java.io.*;
class CopyFile
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
        FileWriter fw=null;
        try
        {
            fr=new FileReader(f);
            fw=new FileWriter("pqr.txt");
            while(true)
            {
                val=fr.read();
                if(val==-1)
                    break;
                fw.write(val);
            }
            fr.close();
            fw.close();
        }
        catch(Exception e){}
    }
}