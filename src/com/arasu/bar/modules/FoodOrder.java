package com.arasu.bar.modules;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FoodOrder     {
    private static JLabel l;
   private static JCheckBox cb1,cb2,cb3;
    private static JButton b;
    private static JFrame jFrame;
    public static void main(String[] args){
        jFrame=new JFrame("Food Order");
        l=new JLabel("Food Ordering System");
        l.setBounds(50,50,300,20);
        cb1=new JCheckBox("Pizza @ 100");
        cb1.setBounds(100,100,150,20);
        cb2=new JCheckBox("Burger @ 30");
        cb2.setBounds(100,150,150,20);
        cb3=new JCheckBox("Tea @ 10");
        cb3.setBounds(100,200,150,20);
        b=new JButton("Order");
        b.setBounds(100,250,80,30);
        jFrame. add(l);
        jFrame.add(cb1);
        jFrame.add(cb2);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float amount=0;
                String msg="";
                if(cb1.isSelected()){
                    amount+=100;
                    msg="Pizza: 100\n";
                }
                if(cb2.isSelected()){
                    amount+=30;
                    msg+="Burger: 30\n";
                }
                if(cb3.isSelected()){
                    amount+=10;
                    msg+="Tea: 10\n";
                }
                msg+="-----------------\n";
                JOptionPane.showMessageDialog(jFrame,msg+"Total: "+amount);
            }
        });
        jFrame.add(cb3);
        jFrame.add(b);
        jFrame. setSize(400,400);
        jFrame.setLayout(null);
        jFrame. setVisible(true);
        jFrame.  setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


}
