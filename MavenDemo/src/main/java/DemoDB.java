import java.sql.*;
public class DemoDB {
    public static void main(String[] a) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javademo", "postgres", "admin");
        System.out.println("Connected...");
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from student");
        System.out.println("result "+ rs.next());
        System.out.println("result "+ rs.getString("name"));
        System.out.println("result "+ rs.next());
        System.out.println("result "+ rs.getString("name"));
        con.close();
    }
}
