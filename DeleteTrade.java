import java.sql.*;
import javax.swing.*;
import java.util.*;

class DeleteTrade
{
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/wce","root","");
        PreparedStatement ps=con.prepareStatement("update trade set tstate=false where tid=?");
        PreparedStatement ps1=con.prepareStatement("select * from trade where tid=?");
        int id=0;
        String nm="";
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("Id:");
            id=s.nextInt();
            if(id==0)
            break;

            ps1.setInt(1, id);
            ResultSet rs=ps1.executeQuery();
            if(rs.next())
            {
                System.out.println("Record Exists");
                continue;
            }
            if(rs.getBoolean(3)==false)
            {
                System.out.println("Record already Deleted");
                continue;
            }
            // System.out.println("Trade Name:");
            // nm=s.next();

            // ps.setInt(1, id);
            // ps.setString(2, nm);
            // ps.setBoolean(3, true);
            // ps.setString(1, nm);
            // ps.setBoolean(2, true);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Successfully");
        }
        con.close();

        
    }
}