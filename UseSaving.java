import Bank.Saving;
import mypkg.Util;

public class UseSaving 
{
    public static void main(String[] args)
    {
        Saving a=new Saving();
        a.depo(1000);
        a.depo(2000);
        a.with(500);
        a.display();
    }
}
