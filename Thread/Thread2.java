class thrd1 extends Thread
{
    int num;
    String tnm;
    thrd1(String nm,int cnt)
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
public class Thread2
{
    public static void main(String[] args)
    {
        System.out.println("Main Starts");
        thrd1 a=new thrd1("A",3);
        thrd1 b=new thrd1("B",5);
        thrd1 c=new thrd1("C",7);
        System.out.println("Main Ends");
    }
}