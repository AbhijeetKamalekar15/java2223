class thrd2 extends Thread
{
    int num;
    String tnm;
    thrd2(String nm,int cnt)
    {
        super(nm);
        num=cnt;
        tnm=nm;
        start();
    }
    public void run()
    {
        int i=1;
        while(i<=num)
        {
            System.out.println(tnm+" "+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e){}
            i++;
        }
    }
}
public class Thread3
{
    public static void main(String[] args)
    {
        System.out.println("Main Starts");
        thrd2 a=new thrd2("A",3);
        thrd2 b=new thrd2("B",5);
        thrd2 c=new thrd2("C",7);
        // System.out.println("Main Ends");
        try
        {
            a.join();
            b.join();
            c.join();
        }
        catch(Exception e){}
        System.out.println("Main Ends");
    }
}