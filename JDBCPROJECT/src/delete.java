import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
            PreparedStatement ps=conn.prepareStatement("delete from students where studid=?");

            Scanner s1=new Scanner(System.in);
            System.out.println("enter the id  to e deleted ");
            int newage=s1.nextInt();

            ps.setInt(1, newage);
            int rowsDeleted=ps.executeUpdate();
            System.out.println("rows deleted-"+rowsDeleted);
            ps.close();
            conn.close();

        }catch(SQLException e){
            System.out.println("exception handling"+e);
        }
    }
    
}
