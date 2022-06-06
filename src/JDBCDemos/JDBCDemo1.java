package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

      //  1. Loading a driver

        Class.forName("com.mysql.cj.jdbc.Driver");

      //  2. Creating connection

        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/730batch";

        Connection con = DriverManager.getConnection(url,username,password);

      //  3. Creating statement

        Statement st = con.createStatement();

      //  4. Executing query ( for DML queries)
     //   String sql = "insert into student values(1,'Paramesh','IT',78)";
     //    String sql = "update student set branch='Comp' where rno=1";
        String sql = "delete from student where rno=1";

        st.executeUpdate(sql);

        st.close();
        con.close();

    }
}
