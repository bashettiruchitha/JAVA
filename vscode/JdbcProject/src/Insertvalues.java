import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertvalues {
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
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
            System.out.println("Connected to the database : "+conn);

            //4. make a desired statement [ Statement/PreparedStatement/CallableStatement]
            System.out.println("Creating a prepared statement");
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO emp3 VALUES (?,?,?)");
            System.out.println("PreparedStatement created...");

            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter new deptno : ");
            int newdeptno = scanner1.nextInt();

            System.out.println("Enter new deptname : ");
            String newdeptname = scanner2.nextLine();

            System.out.println("Enter new deptage : ");
            String newdeptage= scanner3.nextLine();

            preparedStatement.setInt(1, newdeptno);
            preparedStatement.setString(2, newdeptname);
            preparedStatement.setString(3, newdeptage);
            
            //5. fire the statement
            System.out.println("Executing the query...");
            int rowsAdded  = preparedStatement.executeUpdate();
            System.out.println("Query fired..rows added..."+rowsAdded);
            
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