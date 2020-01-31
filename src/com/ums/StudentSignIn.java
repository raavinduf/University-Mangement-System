package com.ums;

import java.sql.*;

public class StudentSignIn {
    private String Student_no;
    private String Password;

    public StudentSignIn() {
    }

    public StudentSignIn(String Student_No, String Password) {
        if (Student_No != null)
            this.Student_no = Student_No;
        this.Password = Password;
    }

    public String getStudent_no() {
        return this.Student_no;
    }

    public String getPassword() {
        return this.Password;
    }

    public boolean CheckDatabase() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "root");

                Statement stmt = conn.createStatement();
        ) {
            String sqlQuery = "select * from student where Student_no=\"" + this.Student_no + "\";";

            ResultSet rset = stmt.executeQuery(sqlQuery);
            while (rset.next()) {
                String Name = rset.getString("Name");
                int age = rset.getInt("Age");
                String password = rset.getString("Password");
                if (password.equals(this.getPassword())) {
                    return true;
                } else
                    return false;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;

    }

    public void CheckDatabase1() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS", "root", "root");

                Statement stmt = conn.createStatement();
        ) {
            String sqlQuery = "select * from student where Student_no=\"" + this.Student_no + "\";";

            ResultSet rset = stmt.executeQuery(sqlQuery);
            while (rset.next()) {
                String Name = rset.getString("Name");
                int age = rset.getInt("Age");
                String password = rset.getString("Password");
                if (password.equals(this.getPassword())) {
                    System.out.println("Name : " + Name + "\nAge :" + age);
                    System.out.println("Registered Course");
                    String sqlQuery1 = "Select Course_name from stdcourse where Student_no=\"" + this.getStudent_no() + "\";";
                    ResultSet rset1 = stmt.executeQuery(sqlQuery1);
                    while (rset1.next()) {
                        String Course = rset1.getString("Course_name");
                        System.out.println(Course);
                    }
                }
                else
                    System.out.println("invalid inputs");



            }
        }

        catch(SQLException e){
                System.out.println(e);
            }


        }
    }



