class SyncThrd
{
    SyncThrd(){}
    synchronized void table(int no)
    {
        System.out.println("Table\n");
        for(int i=1;i<=10;i++)
            System.out.println(""+(no*i));
    }
}
class Thread9 extends Thread
{
    SyncThrd obj;
    int no;
    Thread9(SyncThrd a,int n)
    {
        super();
        obj=a;
        no=n;
        start();
    }
    public void run()
    {
        obj.table(no);
    }
    public static void main(String []args)
    {
        SyncThrd obj=new SyncThrd();
        Thread9 a=new Thread9(obj,8);
        Thread9 b=new Thread9(obj,13);
        try
        {
            a.join();
            b.join();
        }
        catch(Exception e){}
        System.out.println("Main Ends");
    }
}