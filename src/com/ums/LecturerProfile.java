package com.ums;

import javax.swing.*;

public class LecturerProfile {
    private JLabel Lec_Name;
    private JLabel sub;
    private JCheckBox enrollCheckBox;
    private JCheckBox enrollCheckBox1;
    private JLabel sub01;
    private JLabel sub02;
    private JPanel LecProfile;

    public static void main(String [] args){
        JFrame frame=new JFrame("Lecturer Profile");
        frame.setContentPane(new LecturerProfile().LecProfile);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
