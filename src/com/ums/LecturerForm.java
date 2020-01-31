package com.ums;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LecturerForm {
    private JLabel Head;
    private JLabel SignInl;
    private JLabel Lecturer_no;
    private JTextField lecNoTxt;
    private JTextField lecPasswordTxt;
    private JLabel SignUp;
    private JButton signInBtn;
    private JLabel Lecturer_no01;
    private JTextField lecNoTxt01;
    private JLabel Password01;
    private JButton signUpButton;
    private JPanel LecForm;
    private JTextField lecNameTxt;
    private JTextField ageInt;
    private JTextField lecPasswordTxt01;
    //private JButton signInBtn;

    public LecturerForm() {
        signInBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LecturerSignIn LSi=new LecturerSignIn(lecNoTxt.getText(),lecPasswordTxt.getText());
                if(LSi.CheckDatabase())
                    JOptionPane.showMessageDialog(null,"Success");
                else
                    JOptionPane.showMessageDialog(null,"Incorrect Lecturer no or password");
            }
        });
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Lecturer l1=new Lecturer(lecNameTxt.getText(),Integer.parseInt(ageInt.getText()),lecNoTxt01.getText(),lecPasswordTxt01.getText());
                if(l1.insertLecturer()){
                    JOptionPane.showMessageDialog(null,"Success");
                }
                else
                    JOptionPane.showMessageDialog(null,"Incorrect Lecturer no or password");
            }
        });
    }

    public static void main(String [] args){
        JFrame frame=new JFrame("Lecturer");
        frame.setContentPane(new LecturerForm().LecForm);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
