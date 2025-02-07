import java.util.*;
class IO
{
	static Scanner s;
	static
	{
		s=new Scanner(System.in);
	}
	static int iInput(String msg)
	{
		System.out.println(msg);
		int no=0;
		try
		{
			no=s.nextInt();
		}
		catch (Exception e){}
		return no;
	}
	static double dInput(String msg)
	{
		System.out.println(msg);
		double d=s.nextDouble();
		return d;
	}
	static String sInput(String msg)
	{
		System.out.println(msg);
		String str=s.next();
		return str;
	}
}
class XNumber
{
	int no;
	XNumber()
	{
		no=0;
	}
	void setData()
	{
		no=IO.iInput("Roll No");
	}
	public String toString()
	{
		String s="Roll No:"+no;
		return s;
	}
	void display()
	{
		System.out.println(toString());
	}
}
class XName extends XNumber
{
	String nm;
	XName()
	{
		super();
	}
	void setData()
	{
		super.setData();
		nm=IO.sInput("Name");
	}
	public String toString()
	{
		String s=super.toString()+"\nName:"+nm;
		return s;
	}
	void display()
	{
		System.out.println(toString());
	}
}
class XMarks extends XName			//XNumber->XXName->XMarks
{
	double mrk;
	XMarks()
	{
		super();
	}
	void setData()
	{
		super.setData();
		mrk=IO.dInput("Marks");
	}
	public String toString()
	{
		String s=super.toString()+"\nMarks:"+mrk;
		return s;
	}
	void display()
	{
		System.out.println(toString());
	}
}
class MultilevelInheritance
{
	public static void main(String[]args)
	{
		XNumber a=new XMarks();
		a.setData();
		a.display();
		XName b=new XName();
		b.setData();
		b.display();
	}
}