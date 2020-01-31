package com.ums;

import javax.swing.*;

public class Front {
    private JButton lecturerButton;
    private JButton studentButton;
    private JPanel Front;

    public static void main(String [] args){
        JFrame frame=new JFrame("Front");
        frame.setContentPane(new Front().Front);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
