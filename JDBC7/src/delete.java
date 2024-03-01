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
        PreparedStatement ps=conn.prepareStatement("delete from emp_master where studentrollno=?");
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the id to delete");
        int newid=s1.nextInt();
        ps.setInt(1, newid);

        int RowsDeleted=ps.executeUpdate();
        System.out.println("delted "+RowsDeleted);

        ps.close();;
        conn.close();
    }catch(SQLException e){
        System.out.println("exception caught");
    }
    
}
}
