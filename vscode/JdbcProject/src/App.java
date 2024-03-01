import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try{

            System.out.println("loading the driver:");
            DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
            System.out.println("connecting to the database:");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ruchi", "root", "admin");
            System.out.println("connected to the database"+conn);
            System.out.println("creating a stmt");
            Statement statement= conn.createStatement();
            System.out.println("statement is created:");

           // ResultSet result=statement.executeQuery("Select * from emp3");

            statement.execute("create table accounts(accno int primary key, accname varchar(20))");
            
            //statement.executeQuery();

            System.out.println("the table is displayed");

           /*  while(result.next()){
                System.out.println("deptno"+result.getInt(1));
                System.out.println("deptname"+result.getString(2));
                System.out.println("deptage"+result.getString(3));
            }*/

           // result.close();
            statement.close();
            conn.close();

            }catch(SQLException e1){
                System.out.println("some problem in sql query"+e1);
            }finally{
                System.out.println("finally i not excuted");
            }
        }
    }


