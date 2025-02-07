//Object of NewMyArray as a field in class MyStack
package ds;
import mypkg.NewMyArray;
import mypkg.Util;

public class MyStack 
{
    NewMyArray obj;
    int top;
    public MyStack()
    {
        top=-1;
        obj=new NewMyArray();
    }
    public void push()
    {
        if(top==4)
            Util.display("Overflow");
        else
        {
            int d=Util.iInput("Data");
            obj.set(d,++top);
        }
    }
    public void pop()
    {
        if(top==-1)
            Util.display("Underflow");
        else
            Util.display("Data:"+obj.get(top--));  
    }
    public void display()
    {
        if(top==-1)
            Util.display("Empty Stack");
        else
        {
            String s="\nStack\n";
            for(int i=top;i>=0;i--)
                s=s+""+obj.get(i);
            Util.display(s);
        }
    } 
    public void menu()
    {
        String [] option=new String []{"push","pop","display","exit"};
        while(true)
        {
            int opt=Util.oInput("choose Option","Stack",option);
            if(opt==3)
                break;
            switch(opt)
            {
                case 0:
                    push();break;
                case 1:
                    pop();break;
                case 2:
                    display();
            }
        }
    }
}
