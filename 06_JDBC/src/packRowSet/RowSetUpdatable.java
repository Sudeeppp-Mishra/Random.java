package packRowSet;

// RowSetUpdatable.java
// This program demonstrates how to update a row in a database using JdbcRowSet created via RowSetFactory

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetUpdatable {
    public static void main(String[] args) throws Exception {
        // Create RowSetFactory (preferred over using JdbcRowSetImpl directly)
        RowSetFactory factory = RowSetProvider.newFactory();

        // Create JdbcRowSet using the factory
        JdbcRowSet rowSet = factory.createJdbcRowSet();

        // Set DB connection details
        rowSet.setUrl("jdbc:mysql://localhost:3306/TestPractice");
        rowSet.setUsername("root");
        rowSet.setPassword("");  // Set your DB password here if needed

        // Set SQL SELECT command (the rowset will be scrollable and updatable)
        rowSet.setCommand("SELECT * FROM test");
        rowSet.execute(); // Executes the query and fills rowSet with the data

        // Iterate and update the matching record
        while (rowSet.next()) {
            if (rowSet.getInt("roll") == 1) {
                // Update the "name" column
                rowSet.updateString("name", "Updated Name");

                // Commit the update to the database
                rowSet.updateRow();

                System.out.println("Successfully updated record with roll = 1");
            }
        }

        //  Close the rowSet
        rowSet.close();
    }
}

/*
NOTES:
 What makes it Updatable?
- You can use methods like:
    - updateString(columnName, value)
    - updateInt(columnName, value)
    - updateRow() → to commit those changes to DB

Requirements:
- Add `rs2xml.jar` or required rowset JARs if you face class loading issues.
- Your database user must have UPDATE privileges on the table.
*/
