import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin"); 
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from emp_master");
        while(rs.next()){
            System.out.println("student no "+rs.getInt(1));
            System.out.println("student name  "+rs.getString(2));
            System.out.println("student date "+rs.getDate(3));
            System.out.println("student stream "+rs.getString(4));
            System.out.println("-----------------------");

        }
        rs.close();
        st.close();
        conn.close();

    }
}
