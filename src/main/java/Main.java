import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true", "root", "");
        String sql = "SELECT * FROM pessoas";
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while(result.next()){
            System.out.println(result.getString("nome"));
        }

        connection.close();
    }
}
