class SyncThrd
{
    SyncThrd(){}
    void table(int no)
    {
        System.out.println("Table\n");
        for(int i=1;i<=10;i++)
            System.out.println(""+(no*i));
    }
}
class Thread10 extends Thread
{
    SyncThrd obj;
    int no;
    Thread10(SyncThrd a,int n)
    {
        super();
        obj=a;
        no=n;
        start();
    }
    public void run()
    {
        synchronized(obj)
        {
            obj.table(no);
        }
    }
    public static void main(String []args)
    {
        SyncThrd obj=new SyncThrd();
        Thread10 a=new Thread10(obj,8);
        Thread10 b=new Thread10(obj,13);
        try
        {
            a.join();
            b.join();
        }
        catch(Exception e){}
        System.out.println("Main Ends");
    }
}