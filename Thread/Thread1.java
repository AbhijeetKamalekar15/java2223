class Thread1
{
    public static void main(String[] args)
    {
        System.out.println("Main Start");
        Thread th=Thread.currentThread();
        System.out.println("Name:"+th.getName());
        System.out.println("Priority:"+th.getPriority());
        System.out.println("IsAlive:"+th.isAlive());
        System.out.println("Thread:"+th);
        System.out.println("Main Ends");
    }
}