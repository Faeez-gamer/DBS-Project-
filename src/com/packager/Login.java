package com.packager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Login extends JFrame implements ActionListener {
    Container c;
    JLabel user,pass,logi;
    JTextField u1;
    JPasswordField p1;
    JButton log;
    ImageIcon logg;

    Login(){
        setTitle("University Management System");
        setBounds(150,150,500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);



        user = new JLabel("User Name");
        user.setBounds(50,50,100,20);
        c.add(user);

        pass = new JLabel("Password");
        pass.setBounds(50,120,100,20);
        c.add(pass);

        u1 = new JTextField();
        u1.setBounds(150,50,150,30);
        c.add(u1);

        p1 = new JPasswordField();
        p1.setBounds(150,120,150,30);
        c.add(p1);

        log = new JButton("Login");
        log.setBounds(150,180,100,30);
        log.addActionListener(this);
        c.add(log);

        logg = new ImageIcon(this.getClass().getResource("logpic.jpg"));
        logi = new JLabel(logg);
        logi.setSize(500,300);
        c.add(logi);



        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"Successfully Logged In");



        if (e.getSource()==log){
            this.dispose();
            Portal p = new Portal();
        }
    }
}
