package com.ums;

import java.sql.*;

public class LecturerSignIn {
    private String Lecturer_no;
    private String Password;

    public LecturerSignIn(){
    }

    public LecturerSignIn(String Lecturer_No,String Password){
        if(Lecturer_No!=null)
            this.Lecturer_no=Lecturer_No;
        this.Password=Password;
    }

    public String getLecturer_no() {
        return this.Lecturer_no;
    }

    public String getPassword(){
        return this.Password;
    }

    public boolean CheckDatabase(){
        try(
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS","root","root");

                Statement stmt=conn.createStatement();
        )
        {
            String sqlQuery="select * from com.ums.Lecturer where Lec_username=\""+this.Lecturer_no+"\";";

            ResultSet rset=stmt.executeQuery(sqlQuery);
            while(rset.next()){
                String Name=rset.getString("Name");
                int age=rset.getInt("Age");
                String password=rset.getString("Lec_password");
                if(password.equals(this.getPassword())){
                    return true;
                }
                else
                    return false;
            }


        }
        catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
}

