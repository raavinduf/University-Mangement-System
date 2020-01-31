package com.ums;

import javax.swing.*;
import java.awt.*;

public class StudentProfile extends JFrame{
    private JLabel std_name;
    private JLabel std_no;
    private JCheckBox ENROLLCheckBox;
    private JCheckBox ENROLLCheckBox1;
    private JLabel stdNameLbl;
    private JLabel stdNoLbl;
    private JPanel StdProfile;

    public StudentProfile(){
        JFrame frame=new JFrame("Student Profile");
        frame.setContentPane(new StudentProfile().StdProfile);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }



    public static void main(String [] args){
        JFrame frame=new JFrame("Student Profile");
        frame.setContentPane(new StudentProfile().StdProfile);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);

            }
        }





