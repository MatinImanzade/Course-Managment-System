package az.company.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Singleton Desing Pattern
 */
public class DBConfig {
    Connection connection = null;

    public Connection connect() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/Course_Managment_System";
        String userName = "postgres";
        String password = "Metin598";
        if (connection == null) {
            connection = DriverManager.getConnection(url, userName, password);
        }
        return connection;
    }

}
