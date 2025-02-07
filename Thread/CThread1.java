class CThread extends Thread
{
    Shared obj;
    CThread1(Shared a)
    {
        super();
        obj=a;
        start();
    }
    public void run()
    {
        obj.consumer();
    }
}
class CThread2 extends Thread
{
    Shared obj;
    CThread2(Shared a)
    {
        super();
        obj=a;
        start();
    }
    public void run()
    {
        obj.producer();
    }
}
class InterThreadCommunication
{
    public static void main(String[] args)
    {
        Shared obj=new Shared();
        CThread1 a=new CThread1(obj);
        CThread2 b=new CThread(obj);
    }
}