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
            PreparedStatement ps=conn.prepareStatement("update Laptab set lapname=?,lapprice=? where lapid=?");
            Scanner s1=new Scanner(System.in);
            Scanner s2=new Scanner(System.in);
            Scanner s3=new Scanner(System.in);

            System.out.println("enter the id ");
            int newid=s1.nextInt();

            System.out.println("enter the name to modify ");
            String newname=s2.nextLine();

            System.out.println("enter the price to modify ");
            double newprice=s3.nextDouble();

            ps.setString(1, newname);
            ps.setDouble(2, newprice);
            ps.setInt(3, newid);
            int RowsUpadted=ps.executeUpdate();
            System.out.println("rows updated"+RowsUpadted);
            ps.close();
            conn.close();

        }catch(SQLException e){
            System.out.println("exception caught "+e);
        }finally{
            System.out.println("finally block excuted ");
        }
    }
    
}
