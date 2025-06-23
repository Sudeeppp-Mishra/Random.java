import java.sql.*;

/**
 * NOTE:
 * This Java program connects to the MySQL server (not a specific database)
 * and creates a new database named 'NewDB' if it doesn't already exist.
 */
public class CreateDB {
    public static void main(String[] args) throws Exception {

        // JDBC URL format: jdbc:mysql://host:port/database
        // Here, we’re connecting only to the server (not a specific DB) to create one.
        String url = "jdbc:mysql://localhost:3306/";

        // Your MySQL credentials (must be correct for connection to succeed)
        String user = "root";
        String password = "<your-password>"; // Replace with your MySQL password

        // STEP 1: Establishing a connection to the database server
        // getConnection() returns a Connection object that represents the link between Java and MySQL.
        // Think of it like: Java opens a pipeline to talk to the MySQL server.
        Connection conn = DriverManager.getConnection(url, user, password);

        // STEP 2: Create a Statement object
        // Statement is used to send simple SQL queries to the database.
        // This object allows us to "talk" to the database through our Connection.
        Statement stmt = conn.createStatement();

        // STEP 3: Write SQL command
        // This SQL command tells MySQL to create a database only if it doesn't exist already.
        String sql = "CREATE DATABASE IF NOT EXISTS NewDB";

        // STEP 4: Execute SQL command
        // executeUpdate() is used for SQL statements that **change** the database (like CREATE, INSERT, UPDATE, DELETE).
        // It returns an int: number of rows affected. For CREATE DATABASE, it often returns 0.
        stmt.executeUpdate(sql);

        // Feedback on successful operation
        System.out.println("Database created successfully!");

        // STEP 5: Clean up
        // Always close Statement and Connection objects to free resources.
        stmt.close();
        conn.close();
    }
}