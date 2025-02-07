import java.sql.*;
import javax.swing.*;
import java.util.*;

class TAdd
{
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/wce","root","");
        PreparedStatement ps=con.prepareStatement("insert into trade values(?,?,?)");
        int id=0;
        String nm="";
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("Id:");
            id=s.nextInt();
            if(id==0)
            break;

            System.out.println("Trade Name:");
            nm=s.next();

            ps.setInt(1, id);
            ps.setString(2, nm);
            ps.setBoolean(3, true);

            ps.executeUpdate();
            System.out.println("Successfully");
        }
        con.close();

        
    }
}