import java.util.*;
interface DataIO
{
    void setData();
    void display();
}
interface Comp
{
    int total();
    int avg();
}
interface size
{
    int size=5;
}
interface IArray extends DataIO,Comp,size
{
    int findMax();
    int findMin();
}
class ArrayImpl implements IArray
{
    int []arr;
    static Scanner s;
    ArrayImpl()
    {
        arr=new int[size];
    }
    static 
    {
        s=new Scanner(System.in);
    }
    public void setData()
    {
        int i=0;
        while(i<size)
        {
            System.out.println("Data:");
            arr[i]=s.nextInt();
            i++;
        }
    }
    public int total()
    {
        int tot=arr[0],i=1;
        while(i<size)
            tot+=arr[i++];
        return tot;
    }
    public int avg()
    {
        return total()/size;
    }
    public int findMax()
    {
        int max=arr[0],i=1;
        while(i<size)
        {
            if(arr[i]>max)
                max=arr[i];
            i++;
        }
        return max;
    }
    public int findMin()
    {
        int min=arr[0],i=1;
        while(i<size)
        {
            if(arr[i]<min)
                min=arr[i];
            i++;
        }
        return min;
    }
    public String toString()
    {
        String str="Array Data\n"+Arrays.toString(arr)+"\nTotal:"+total()+"\nAvg:"+avg()+"\nMin:"+findMin()+"\nMax:"+findMax();
        return str;
    }
    public void display()
    {
        System.out.println(toString());
    }
    public static void main(String[] args)   
    {
        ArrayImpl a=new ArrayImpl();
        a.setData();
        a.display();
    }
}
