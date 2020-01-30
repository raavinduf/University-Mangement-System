package com.ums;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        Scanner input3=new Scanner(System.in);
        Scanner input4=new Scanner(System.in);
        Student s1 = new Student();
        Lecturer l1 =new Lecturer();
        StudentSignIn Ss1=new StudentSignIn();
        LecturerSignIn Ls1=new LecturerSignIn();
        String [] num;
        String name;
        int age;
        String courseNo;
        String Username;  //used for student_no and lecturer_no
        String Password;
        System.out.println("Select [1] to sign up and [2] to sign in");
        int nChoice=input2.nextInt();
        switch(nChoice){
            case 1:
                System.out.println("Welcome to University Management System\n");
                System.out.println("Please select an option to proceed,");
                System.out.println("press [1] Register as a Student");
                System.out.println("press [2] Register as a Lecturer");
                int choice = input.nextInt();



                switch(choice){
                    case 1:
                        System.out.println("...\nStudent Registration\nPlease submit the following information");
                        System.out.println("Name :");
                        name=input3.nextLine();
                        System.out.println("Age :");
                        age=input.nextInt();
                        System.out.println("Student number :");
                        Username=input2.nextLine();
                        System.out.println("Password :");
                        Password=input2.nextLine();
                        System.out.println("Select the course number from the following list");
                        System.out.println("[1] SENG 11111 - Introducttion to Programming");
                        System.out.println("[2] SENG 11112 - Fundamentals of Engineering");
                        System.out.println(("[3] SENG 11113 - Data Structures and Algorithms"));
                        courseNo=input2.nextLine();
                        num = courseNo.split(",");
                        int n=num.length;
                        String [] crs=new String[n];
                        for (int i=0;i<num.length;i++) {
                            if (num[i].equals("1")) {
                                crs[i] = "SENG 11111 - Introduction to programming";

                            } else if (num[i].equals("2")) {
                                crs[i] = "SENG 11112 - Fundamentals of Engineering";
                            } else if (num[i].equals("3"))
                                crs[i] = "SENG 11113 - Data Structures and Algorithms";
                            else
                                System.out.println("Not a valid input");
                        }

                        s1=new Student(name,age,crs,n,Username,Password);
                        s1.insertStudent();
                        break;
                    case 2:
                        System.out.println("...\nLecture Registration \nPlease submit the following information");
                        System.out.println("Name :");
                        name=input4.nextLine();
                        System.out.println("Age :");
                        age=input.nextInt();
                        System.out.println("Username :");
                        Username=input4.nextLine();
                        System.out.println("Password :");
                        Password=input4.nextLine();

                        System.out.println("Select the course number from the following list ");
                        System.out.println("[1] SENG 11111 - Introducttion to Programming");
                        System.out.println("[2] SENG 11112 - Fundamentals of Engineering");
                        System.out.println(("[3] SENG 11113 - Data Structures and Algorithms"));
                        courseNo=input4.nextLine();
                        num = courseNo.split(",");
                        int n1=num.length;
                        String [] crs2=new String[n1];
                        for (int i=0;i<num.length;i++) {
                            if (num[i].equals("1")) {
                                crs2[i] = "SENG 11111 - Introduction to programming";

                            }
                            else if (num[i].equals("2")) {
                                crs2[i] = "SENG 11112 - Fundamentals of Engineering";
                            }
                            else if (num[i].equals("3")){
                                crs2[i] = "SENG 11113 - Data Structures and Algorithms";
                            }
                            else{
                                System.out.println("Not a valid input");
                            }
                            //System.out.println(num[i]);
                        }
                        l1=new Lecturer(name,age,crs2,n1,Username,Password);
                        l1.insertLecturer();

                        break;
                    default:
                        System.out.println("Not a valid input");
                        break;
                }
                break;
            case 2:

                System.out.println("Welcome to University Management System\n");
                System.out.println("Please select an option to proceed,");
                System.out.println("Please Select Your registration role");
                System.out.println("press [1] to login as a Student\npress [2] to login as a lecturer");
                int choice1 = input.nextInt();
                switch(choice1){
                    case 1:
                        System.out.println("Student login form");
                        System.out.println("\nStudent_no :");
                        String Student_no=input3.nextLine();
                        System.out.println("Password :");
                        Password=input3.nextLine();
                        Ss1=new StudentSignIn(Student_no,Password);
                        System.out.println("Hello");
                        Ss1.CheckDatabase();
                        break;
                    case 2:
                        System.out.println("Lecturer login form");
                        System.out.println("\nLecturer No :");
                        String Lecturer_no=input4.nextLine();
                        System.out.println("Password");
                        Password=input4.nextLine();
                        Ls1=new LecturerSignIn(Lecturer_no,Password);
                        Ls1.CheckDatabase();

                }
                break;
            default:
                System.out.println("Not a default input");
        }


    }
}

