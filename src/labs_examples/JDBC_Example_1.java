package labs_examples;

import java.sql.*;

public class JDBC_Example_1 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionString = "jdbc:mysql://localhost/college?"
                    +"user=root&password=Vakama1993!&useSSL=false";
            connection = DriverManager.getConnection(connectionString);

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from college.courses");

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int units = resultSet.getInt("credits");

                System.out.println("Course ID: " + id + " is " + name + " and has " + units + units);
            }

        } catch (SQLException e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        } catch (ClassNotFoundException exc){
            System.out.println("Exception occured - driver not found on classpath");
            exc.printStackTrace();
        }finally {
            try{
                // close all JDBC elements
                statement.close();
                resultSet.close();
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
