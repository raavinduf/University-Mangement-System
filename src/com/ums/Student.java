package com.ums;

import java.sql.*;
public class Student extends com.ums.Course {
    private String Name;
    private int age;
    private String Student_no;
    private String Password;

    public Student(){

    }

    public Student(String name,int age,String [] Course,int n,String Student_no,String Password){
        super(Course,n);
        if (name!=null)
            this.Name=name;
        else
            this.Name="";
        if (age>0)
            this.age=age;
        else
            this.age=0;
        if (Student_no!=null)
            this.Student_no=Student_no;
        else
            this.Student_no="";
        if (Password!=null)
            this.Password=Password;
        else
            this.Password="";
    }

    public Student(String name,int age,String Std_no,String Password){
        if(name!=null)
            this.Name=name;
        else
            this.Name="";
        if (age>0)
            this.age=age;
        else
            this.age=0;
        if (Std_no!=null)
            this.Student_no=Std_no;
        else
            this.Student_no="";
        if (Password!=null)
            this.Password=Password;
        else
            this.Password="";
    }



    public void setName(String name){
        this.Name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.Name;
    }

    public int getAge(){
        return this.age;
    }

    public String getStudent_no(){ return this.Student_no;}

    public String getPassword(){ return this.Password;}

    public void getStudentInfo(){
        System.out.println("...\nStudent Info :");
        System.out.println("Name :"+this.getName()) ;
        System.out.println("Age :"+this.getAge());
        System.out.println("Registered courses\n"+this.getCourse());
    }
    public boolean insertStudent(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/UMS",
                        "root", "root");


                Statement stmt = conn.createStatement();
        ){
            //int countUpdated;
            //String crs=super.getCourse();
            //String [] crs1=crs.split("\n");

            String sqlInsert = "insert into student values (\""+ this.getName()+"\",\"" + this.getAge()+"\",\"" + this.getStudent_no()+"\",\""+ this.getPassword()+"\");";
            //System.out.println(sqlInsert);
            //System.out.println(sqlInsert);
            stmt.executeUpdate(sqlInsert);

            return true;
        }


        catch (SQLException e){
            System.out.println(e);
            return false;
        }
    }

    public void insertStudent1(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/UMS",
                        "root", "root");


                Statement stmt = conn.createStatement();
        ){
            int countUpdated;
            String crs=super.getCourse();
            String [] crs1=crs.split("\n");

            String sqlInsert = "insert into student values (\""+ this.getName()+"\",\"" + this.getAge()+"\",\"" + this.getStudent_no()+"\",\""+ this.getPassword()+"\");";
            //System.out.println(sqlInsert);
            //System.out.println(sqlInsert);
            stmt.executeUpdate(sqlInsert);
            for (int i=0;i<crs1.length;i++){
                String sqlnsert1="insert into stdcourse values(\""+crs1[i]+"\",\""+this.getStudent_no()+"\");";
                stmt.executeUpdate(sqlnsert1);
            }


        }


        catch (SQLException e){
            System.out.println(e);

        }
    }
}
