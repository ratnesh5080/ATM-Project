import  java.sql.*;

public class cone {
    Connection connection;
    Statement statement;

    public cone() {
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Aktrkt5080@");
            
            
            statement = connection.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
