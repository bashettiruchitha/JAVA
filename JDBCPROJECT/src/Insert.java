import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
            PreparedStatement ps=con.prepareStatement("insert into students values(?,?,?)");
            Scanner s1=new Scanner(System.in);
            Scanner s2=new Scanner(System.in);
            Scanner s3=new Scanner(System.in);
            System.out.println("enter the new student id");
            int newid=s1.nextInt();  
            System.out.println("enter the student name");
            String newname=s2.nextLine();
            System.out.println("enter the new age");
            int newage=s3.nextInt();
            ps.setInt(1,newid);
            ps.setString(2, newname);
            ps.setInt(3, newage);
            int rowsAdded=ps.executeUpdate();
            System.out.println("rows added"+rowsAdded);
            ps.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println("sql exception  occurs ");

        }finally{
            System.out.println("finally blocked excuted ");

        }
    }

    
}
