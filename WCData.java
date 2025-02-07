import java.io.*;
class WCData
{
    public static void main(String [] args)
    {
        FileWriter fw=null;
        int val=0;
        try
        {
            fw=new FileWriter("abc.txt");
        }
        catch(Exception e){}
        System.out.println("Type Characters\n");
        while(true)
        {
            try
            {
                val=System.in.read();
                System.in.skip(5);
                if((char)val=='#')
                    break;
                fw.write(val);
            }
            catch(Exception e){}
        }
        try
        {
            fw.close();
        }
        catch(Exception e){}
    }
}