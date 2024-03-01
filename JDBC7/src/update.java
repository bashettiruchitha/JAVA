import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update{
    public static void main(String[] args) {
        try{
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
        PreparedStatement ps=conn.prepareStatement("update emp_master set studentname=?,studentDOB=?,stream=? where studentrollno=?");
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        Scanner s4=new Scanner(System.in);
        System.out.println("enter the id ");
        int id=s1.nextInt();

        System.out.println("enter the new name ");
        String newname=s2.nextLine();

        System.out.println("enter the new date of birth");
        String newdate=s3.nextLine();

        System.out.println("enter the new stream");
        String newStream=s4.nextLine();

        ps.setString(1,newname);
        ps.setString(2, newdate);
        ps.setString(3, newStream);
        ps.setInt(4,id);
  

        int RowsUpdated=ps.executeUpdate();
        System.out.println("rows updated"+RowsUpdated);

        ps.close();
        conn.close();

    }catch(SQLException e){
        System.out.println("exception caught"+e);
    }
}
}