// implementation of Runable Interface
public class Thread4 implements Runnable
{
    int no;
    Thread4(int a)
    {
        super();
        no=a;
    }
    public void run()
    {
        int i=1;
        System.out.println("Table");
        while(i<=10)
        {
            System.out.println(""+(no*i));
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e){}
            i++;
        }
    }
    public static void main(String[] args)
    {
        Thread4 a=new Thread4(16);
        Thread obj=new Thread(a);
        obj.start();
        System.out.println("Main Ends");
    }
}