import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update {
    public static void main(String[] args) {
        try{
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
        PreparedStatement ps=conn.prepareStatement("update students set studname=?,studage=? where studid=?");

        
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in) ;
        
        System.out.println("emter the existing  student id");
        int newid=s1.nextInt();

        System.out.println("enter the  modify student name ");
        String newname=s2.nextLine();

        System.out.println("enter the  modify student age ");
        int newage=s3.nextInt();

        ps.setInt(3, newid);
        ps.setString(1, newname);
        ps.setInt(2,newage);

        int rowsUpdated=ps.executeUpdate();
        System.out.println("new rows updated"+rowsUpdated);
        ps.close();
        conn.close();

    }catch(SQLException e){
        System.out.println("exception "+e);
    }
}
    
}
