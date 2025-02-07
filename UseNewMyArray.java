import mypkg.NewMyArray;
class UseNewMyArray
{
    public static void main(String []args)
    {
        NewMyArray p=new NewMyArray();
        p.setData();
        p.display();
        p.get(2);
        System.out.println("Updated Value:"+p.get(2));
        p.set(3,2);
    }
}
