package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class datafill {

    static boolean f = false;
    public static boolean insertToDb(Student stu){
        try{
            Connection con = mysqlconnection.connection();
            String ins = "insert into studentinfo(sid ,sname , sphone , studentCity) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(ins);

            ps.setInt(1, stu.getStudentId());
            ps.setString(2, stu.getStudentName());
            ps.setString(3, stu.getStudentPhone());
            ps.setString(4, stu.getStudentCity());

            ps.executeUpdate();
            f = true;

        }
        catch (Exception e){
            e.printStackTrace();
        }

        return f;


    }

    public static boolean deleteStudent(int id) {

        boolean f = false;

        try{
            Connection con = mysqlconnection.connection();
            String ins = "delete from studentinfo where sid = ?";
            PreparedStatement ps = con.prepareStatement(ins);

            ps.setInt(1, id);

            ps.executeUpdate();
            f = true;

        }
        catch (Exception e){
            e.printStackTrace();
        }

        return f;

    }

    public static void displayStudents() {


        try{
            Connection con = mysqlconnection.connection();
            String ins = "select * from studentinfo";

            Statement stmnt = con.createStatement();

            ResultSet rs = stmnt.executeQuery(ins);

            while (rs.next()){

                int id = rs.getInt(1);
                String name = rs.getString(2);
                String phone = rs.getString(3);
                String city = rs.getString(4);

                System.out.println("ID" + " "+id);
                System.out.println("Name" +" " +name);
                System.out.println("Phone Number"+" " +phone);
                System.out.println("City"+" " +city);
                System.out.println("...................................................");
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }

    }



}
