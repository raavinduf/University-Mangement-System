package com.ums;

import java.sql.*;
public class Lecturer extends com.ums.Course {
    private String Name;
    private int age;
    private String Username;
    private String Password;

    public Lecturer() {
        super();

    }

    public Lecturer(String Name, int age, String[] Course, int n, String Username, String Password) {
        super(Course, n);
        if (Name != null)
            this.Name = Name;
        else
            this.Name = "";
        if (age > 0)
            this.age = age;
        else
            this.age = 0;
        if (Username != null)
            this.Username = Username;
        else
            this.Username = "";
        if (Password != null)
            this.Password = Password;
        else
            this.Username = Username;
    }

    public Lecturer(String Name, int age, String Username, String Password) {
        if (Name != null)
            this.Name = Name;
        else
            this.Name = "";
        if (age > 0)
            this.age = age;
        else
            this.age = 0;
        if (Username != null)
            this.Username = Username;
        else
            this.Username = "";
        if (Password != null)
            this.Password = Password;
        else
            this.Username = Username;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(String Age) {
        this.age = age;
    }

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        return this.age;
    }

    public String getUsername() {
        return this.Username;
    }

    public String getPassword() {
        return this.Password;
    }

    public void getLecturerInfo() {
        System.out.println("Lecturer Info :");
        System.out.println("Name :" + this.getName());
        System.out.println("Age :" + this.getAge());
        System.out.println("Registered course details :\n" + this.getCourse());
    }

    public boolean insertLecturer() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/UMS",
                        "root", "root");


                Statement stmt = conn.createStatement();
        ){
            //int countUpdated;
           // String crs=super.getCourse();

            String sqlInsert = "insert into Lecturer values (\""+ this.getName()+"\",\"" + this.getAge()+"\",\"" + this.getUsername()+"\",\""+ this.getPassword()+"\");";
            //System.out.println(sqlInsert);
            //System.out.println(sqlInsert);
            stmt.executeUpdate(sqlInsert);
            return true;



        } catch(SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
