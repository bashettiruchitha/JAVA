import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updatevalues {
    public static void main(String[] args)  {
        try {
            // 1. know your database - MySQL
            // 2. know your driver - com.mysql.jdbc.Driver

            //3. connect to the database
            //         3a) load the driver
            System.out.println("Loading the driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            System.out.println("Driver loaded..");

            //       3b) acquire the connection
            System.out.println("Acquiring the connection to the database....");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root123");
            System.out.println("Connected to the database : "+conn);

            //4. make a desired statement [ Statement/PreparedStatement/CallableStatement]
            System.out.println("Creating a prepared statement");
            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE emp3 SET DNAME=?, LOC=? WHERE DEPTNO=?");
            System.out.println("PreparedStatement created...");

            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter THE EXISTING deptno : ");
            int newDeptno = scanner1.nextInt();

            System.out.println("Enter MODIFIED deptname : ");
            String newdeptname = scanner2.nextLine();

            System.out.println("Enter MODIFIED deptage : ");
            String newdeptage= scanner3.nextLine();

            preparedStatement.setInt(1, newDeptno);
            preparedStatement.setString(2, newdeptname);
            preparedStatement.setString(3, newdeptage);
            //5. fire the statement
            System.out.println("Executing the query...");
            int rowsUpdated  = preparedStatement.executeUpdate();
            System.out.println("Query fired..rows modified..."+rowsUpdated);
            
            //6. close the statement
            preparedStatement.close();
            //7. close the connection
            conn.close();
        }
        catch(SQLException e) {
            System.out.println("Some problem with SQL : "+e);
        }
        finally {
            System.out.println("Finally block bound to run ragardless of exceptions...");
        }

    }
}