package com.packager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewStudent extends JFrame implements ActionListener {
    Container c1;
    ImageIcon bg;
    JLabel sname,sfname,address,email,city,roll,cont,bg1;
    static JButton j1;
    JButton j2;
    JTextField s1,s2,a1,e1,r1,c2,g1;
   // JComboBox g1;

    NewStudent(){

        setTitle("University Management System");
        setBounds(150,150,1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c1=getContentPane();
        c1.setLayout(null);


        sname = new JLabel("Student Name");
        sname.setBounds(50,50,100,30);
        c1.add(sname);

        s1 = new JTextField();
        s1.setBounds(150,50,200,30);
        c1.add(s1);

        sfname = new JLabel("Father's / Guardian Name");
        sfname.setBounds(500,50,200,30);
        c1.add(sfname);

        s2 = new JTextField();
        s2.setBounds(650,50,200,30);
        c1.add(s2);

        address = new JLabel("Address");
        address.setBounds(50,150,200,30);
        c1.add(address);

        a1 = new JTextField();
        a1.setBounds(150,150,200,30);
        c1.add(a1);

        email = new JLabel("Email");
        email.setBounds(500,150,200,30);
        c1.add(email);

        e1 = new JTextField();
        e1.setBounds(650,150,200,30);
        c1.add(e1);

        city = new JLabel("City");
        city.setBounds(50,250,200,30);
        c1.add(city);

        g1 = new JTextField();
        g1.setBounds(150,250,200,30);
        c1.add(g1);



        /*String [] values = {"Hyderabad","Karachi","Islamabad","Kotri"};
        g1 = new JComboBox<>(values);
        g1.setBounds(150,250,100,40);
        c1.add(g1);
         */



        roll = new JLabel("Roll Number");
        roll.setBounds(500,250,200,30);
        c1.add(roll);

        r1 = new JTextField();
        r1.setBounds(650,250,200,30);
        c1.add(r1);

        cont = new JLabel("Contact Number");
        cont.setBounds(50,350,200,30);
        c1.add(cont);

        c2 = new JTextField();
        c2.setBounds(150,350,200,30);
        c1.add(c2);



        j1 = new JButton("Add Data");
        j1.setBounds(80,480,100,40);
        j1.addActionListener(this);
        c1.add(j1);

        j2 = new JButton("View Data");
        j2.setBounds(280,480,100,40);
        j2.addActionListener(this);
        c1.add(j2);


        bg = new ImageIcon(this.getClass().getResource("bg.jpg"));
        bg1 = new JLabel(bg);
        bg1.setSize(1000,800);
        c1.add(bg1);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {

         if (e.getSource()==j2){
            JFrame jj = new JFrame("Details");
            jj.setBounds(150,150,1000,800);
            jj.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jj.setLayout(null);


            String t1 = sname.getText();
            String t2 = sfname.getText();
            sname.setText("Details: ");

            jj.setVisible(true);
         this.dispose();
         //StudentTable s = new StudentTable();

        }
        else if (e.getSource() == j1) {

             //DefaultTableModel model = (DefaultTableModel j11.getModel());

            if (s1.getText().equals("") || s2.getText().equals("") || e1.getText().equals("") || c2.getText().equals("") || r1.getText().equals("") || g1.getText().equals("") || a1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Add Complete Data");



            } else {
                JOptionPane.showMessageDialog(null, "Data Added Successfully");
            }


        }

    }


}
