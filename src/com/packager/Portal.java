package com.packager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Portal extends JFrame implements ActionListener  {
    Container c1;
    ImageIcon bg;
    JLabel bg1;
    JMenuBar mb;
    JMenuItem j1,j2,j3;
    JMenu m,m1,m2,m3,m4,m5;

    Portal(){
        setTitle("University Management System");
        setBounds(150,150,1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c1=getContentPane();
        c1.setLayout(null);

        mb = new JMenuBar();
        m = new JMenu("Admissions");
        j1 = new JMenuItem("Add New Student");
        m.add(j1);
        j1.addActionListener(this);
        mb.add(m);
        setJMenuBar(mb);


        m1 = new JMenu("    Students");
        mb.add(m1);
        setJMenuBar(mb);

        m2 = new JMenu("    Teachers");
        mb.add(m2);
        setJMenuBar(mb);


        bg = new ImageIcon(this.getClass().getResource("muet.jpg"));
        bg1 = new JLabel(bg);
        bg1.setSize(1000,800);
        c1.add(bg1);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==j1){
            this.dispose();
            NewStudent ns = new NewStudent();
        }
    }
}
