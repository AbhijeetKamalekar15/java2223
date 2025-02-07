class SyncThrd extends Thread
{
    int no;
    SyncThrd(int n)
    {
        super();
        no=n;
        start();
    }
    public void table()
    {
        System.out.println("Table\n");
        for(int i=1;i<=10;i++)
            System.out.println(""+(no*i));
    }
    public void run()
    {
        table();
    }
}
class Thread8
{
    public static void main(String []args)
    {
        SyncThrd a=new SyncThrd(8);
        SyncThrd b=new SyncThrd(13);
        try
        {
            a.join();
            b.join();
        }
        catch(Exception e){}
        System.out.println("Main Ends");
    }
}