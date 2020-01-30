package com.ums;

public class Course{
    private String [] Course;
    private int No_of_courses;
    public Course(){

    }
    public Course(String [] course,int n){
        this.No_of_courses=n;
        this.Course=new String[n];
        for (int i=0;i<n;i++){
            this.Course[i]=course[i];
        }

    }


    public String getCourse(){
        String crs="";
        for (int i=0;i<this.Course.length;i++){
            crs+=this.Course[i]+"\n";
        }
        return crs;
    }
}