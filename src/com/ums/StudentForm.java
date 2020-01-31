package com.ums;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame{
    private JLabel SignIn;
    private JTextField stdNo;
    private JLabel Student_No;
    private JLabel SignUp;
    private JLabel Student_no1;
    private JLabel Password_01;
    private JButton SignInbtn;
    private JButton SignUpBtn;
    private JLabel Head;
    private JPanel stdform;
    private JTextField stdAgeText;

    private String Student_name;
    private String Student_no;
    private int age;
    private String stdPasswordVar;
    private JTextField stdPassword;
    private JLabel stdName;
    private JTextField stdNameTxt;
    private JLabel StdAge;
    private JTextField ageInt;
    private JLabel StdPassword;
    private JTextField stdNoTxt;
    private JTextField stdPasswordTxt;

    //StudentSignIn SSi=new StudentSignIn();

    public StudentForm()  {
        SignInbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentSignIn SSi=new StudentSignIn(stdNo.getText(),stdPassword.getText());
                if(SSi.CheckDatabase()){
                    JOptionPane.showMessageDialog(null,"Success");
                   StudentProfile Sp1=new StudentProfile();
                   Sp1.setVisible(true);

                }
                else
                    JOptionPane.showMessageDialog(null,"Incorrect Password or Student no");
            }
        });
        SignUpBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student s1=new Student(stdNameTxt.getText(),Integer.parseInt(ageInt.getText()),stdNoTxt.getText(),stdPasswordTxt.getText());
                if(s1.insertStudent())
                    JOptionPane.showMessageDialog(null,"Success");
                else
                    JOptionPane.showMessageDialog(null,"Failed to sign in");

            }
        });
    }

    public static void main(String [] args){
        JFrame frame=new JFrame("Student");
        frame.setContentPane(new StudentForm().stdform);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
