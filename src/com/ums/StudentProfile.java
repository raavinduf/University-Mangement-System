package com.ums;

import javax.swing.*;

public class StudentProfile {
    private JLabel std_name;
    private JLabel std_no;
    private JCheckBox ENROLLCheckBox;
    private JCheckBox ENROLLCheckBox1;
    private JLabel std_namelbl;
    private JLabel std_nolbl;
    private JPanel StdProfile;

    public static void main(String [] args){
        JFrame frame=new JFrame("Student Profile");
        frame.setContentPane(new StudentProfile().StdProfile);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
