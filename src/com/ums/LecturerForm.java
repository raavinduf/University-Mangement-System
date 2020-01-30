package com.ums;

import javax.swing.*;

public class LecturerForm {
    private JLabel Head;
    private JLabel SignInl;
    private JLabel Lecturer_no;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel SignUp;
    private JButton button1;
    private JLabel Lecturer_no01;
    private JTextField textField2;
    private JLabel Password01;
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;
    private JButton button2;
    private JPanel LecForm;

    public static void main(String [] args){
        JFrame frame=new JFrame("Lecturer");
        frame.setContentPane(new LecturerForm().LecForm);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
