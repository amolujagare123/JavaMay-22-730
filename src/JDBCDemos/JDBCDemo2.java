package JDBCDemos;

import java.sql.*;

public class JDBCDemo2 {

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

      //  4. Executing query ( for DDL queries)
       String sql = "select * from candidate";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("fullname")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.print(rs.getInt("marks")+"\t");
            System.out.println(rs.getInt("phone"));
        }


        st.close();
        con.close();

    }
}
