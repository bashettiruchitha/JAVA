import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    public static void main(String[] args) throws Exception {
        try{
        System.out.println("Hello, World!");
        DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from students");
        while(rs.next()){
            System.out.println("studentid: "+rs.getInt(1));
            System.out.println("studentname "+rs.getString(2));
            System.out.println("student age "+rs.getInt(3));
            System.out.println("-----------");
        }
        rs.close();
        st.close();
        con.close();  

    }catch(SQLException  e){
        System.out.println("excpetion handling"+e);
    }finally{
        System.out.println("finally block excuted");
    }
}
}