package com.student.manage;
import com.mysql.jdbc.Driver;
import java.sql.*;

public class mysqlconnection {
    static Connection con;

    public static Connection connection()
    {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String pass = "********";
            String url = "jdbc:mysql://localhost:3306/Student";
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (Exception e){
            e.printStackTrace();

        }
        return con;

    }
}
