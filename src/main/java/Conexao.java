import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private final String USER = "rm565703";
    private final String PASSWORD = "181006";

    public Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
