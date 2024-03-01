import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        try{
        System.out.println("Hello, World!");
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root","admin"); 
        Statement st= conn.createStatement();
        ResultSet rs=st.executeQuery("select * from Laptab");
        while(rs.next()){
            System.out.println("current laptabid: "+rs.getInt(1));
            System.out.println("current laptab name:"+rs.getString(2));
            System.out.println("current laptab price: "+rs.getDouble(3));
            System.out.println("---------------------------");
        }
    
        rs.close();
        st.close();
        conn.close();

    }catch(SQLException e){
        System.out.println("exception caught"+e);
    }finally{
        System.out.println("finally block excecuted");
    }
}
}
