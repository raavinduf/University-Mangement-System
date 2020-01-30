package com.ums;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm {
    private JLabel SignIn;
    private JTextField stdNo;
    private JLabel Student_No;
    private String Password;
    private JLabel SignUp;
    private JTextField textField2;
    private JLabel Student_no1;
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;
    private JLabel Password_01;
    private JLabel RePassword_01;
    private JButton SignInbtn;
    private JButton SignUpBtn;
    private JLabel Head;
    private JPanel stdform;
    private JTextField stdAgeText;
    private JLabel stdAge;

    private String Student_name;
    private String Student_no;
    private int age;
    private String stdPasswordVar;
    private JTextField stdPassword;

    public StudentForm() {
        SignInbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student_no=stdNo.getText();
                age=Integer.parseInt(stdAgeText.getText());
                stdPasswordVar=stdPassword.getText();
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
