package com.arasu.bar.modules;


import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SimpleButton extends JFrame{
    static JFrame j;
    static SimpleButton frame;
   public SimpleButton(){
       j=new JFrame("Example");
        JButton jButton=new JButton();
      //  jButton.setIcon(new ImageIcon("C:\\Users\\kyros\\Downloads\\icons and pictures\\naruto.jpg"));
        JTextField textField=new JTextField();
        JLabel jLabel=new JLabel();
        jLabel.setText("Jlabel");
        JPasswordField jPasswordField=new JPasswordField();
        jPasswordField.setBounds(50,200,100,30);
        jLabel.setBounds(50,150,300,30);
        textField.setBounds(50,50,150,20);
        jButton.setText("Click");
        jButton.setBounds(50,100,95,30);
        j.add(jButton);
       j.add(textField);
        j.add(jLabel);
        j.add(jPasswordField);
       j.setSize(400,400);
        jButton.addActionListener(e -> {
            String value= textField.getText();
            if(value!=null){
                try {
                    String ip= InetAddress.getByName(value).getHostAddress();
                    jLabel.setText("Ip of "+value+"is : "+ip);
                } catch (UnknownHostException e1) {
                    e1.printStackTrace();
                }
            }
        });

        j.setLayout(null);
        j.setVisible(true);

    //   j.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new SimpleButton();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
