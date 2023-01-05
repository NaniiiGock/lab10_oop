package singleton;

import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class DBConnection {
    private static DBConnection dbconnection;
    private Connection connection;
    @SneakyThrows
    private DBConnection() {
        connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
    }
    @SneakyThrows
    public void executeQuery(String query) {
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        statement.close();
    }

    public static DBConnection getInstance() {
        if (dbconnection == null) {dbconnection = new DBConnection();}
        return dbconnection;
    }
}
