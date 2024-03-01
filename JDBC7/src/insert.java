import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert {
    public static Date mysqlDate;

    public static void main(String[] args) {
        try{
            System.out.println("Hello, World!");
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
        PreparedStatement ps=conn.prepareStatement("insert into emp_master values(?,?,?,?)");
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in); 
        Scanner s4=new Scanner(System.in);

        System.out.println("enter the id ");
        int newid=s1.nextInt();
        System.out.println("enter the name");
        String newname=s2.nextLine();
        System.out.println("enter the date of birth");
        String newdate=s3.next();
        System.out.println("enter the stream ");
        String newstream=s4.nextLine();
        
        ps.setInt(1, newid);
        ps.setString(2, newname);
        ps.setString(3, newdate);
        ps.setString(4, newstream);

        int RowsAdded=ps.executeUpdate();
        System.out.println("rows added-"+RowsAdded);

        ps.close();
        conn.close();
        }catch(SQLException e){
            System.out.println("exception caught");
        }finally{
            System.out.println("block exceuted");
        }
    }
    
}
