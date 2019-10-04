package Books;

import java.sql.*;

public class Run {

    private static void input_author(Connection connection) throws SQLException {
        String resultSet = "INSERT INTO public.\"Author\" (id,name,\"birthDate\") VALUES (?,?,?)";

        // String resultId = "SELECT * FROM public.Author";



        PreparedStatement pstmt = connection.prepareStatement(resultSet);

        pstmt.setInt(1, 4);
        pstmt.setString(2, "jeka");
        pstmt.setDate(3, Date.valueOf("2016-06-23"));
        pstmt.executeUpdate();
        System.out.println("строки внесены");

    }
    private static void input_book(){

    }
    private static void input_genre(){

    }
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AllBook", "postgres", "post123") ;//ini

            System.out.println("Status connection" + connection.toString() + connection.getMetaData());
            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();

            System.out.println("statement "+statement.toString());

            input_author(connection);




    }
}
