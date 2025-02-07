import mypkg Util;
class UseUtil
{
    public static void main(String []args)
    {
        int rno=Util.iInput("Roll No:");
        String nm=Util.sInput("Name:");
        double mrk=Util.dInput("Marks:");
        String str="Roll No:"+rno+"\nName:"+nm+"\nMarks:"+mrk;
        Util.display(str);
    }
}