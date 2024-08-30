import java.sql.*;

class demo1{
    public static void main(String args[]) {
        try {
            // Step 1: Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create a connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root","Hr-#e$t98");

            // Step 3: Create a statement object
            Statement stmt = con.createStatement();

            // Step 4: Execute a query
			int res= stmt.executeUpdate("insert into details values(2,'jack','jack@123','jacl@gmail.com')");
			System.out.println("Rows updated "+res);
            ResultSet rs = stmt.executeQuery("SELECT * FROM details");
			
            // Step 5: Process the result set
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"	"+rs.getString(4));
            }

            // Step 6: Close the connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
