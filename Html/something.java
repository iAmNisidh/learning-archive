import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseHelper {
    public static Connection connect() {
        try {
            String url = "jdbc:sqlite:plants.db";
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connection to database established.");
            return conn;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Plants ("
                   + "id INTEGER PRIMARY KEY, "
                   + "name TEXT, "
                   + "sunlight TEXT, "
                   + "watering_frequency TEXT, "
                   + "soil_type TEXT)";
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table created.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

