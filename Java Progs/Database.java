import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static void main(String[] arg) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "username", "password");
            Statement st = con.createStatement();
            String s = "select * from emp";
            ResultSet rs = st.executeQuery(s);
            while (rs.next()) {
                System.out.println("Emp Id: " + rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

