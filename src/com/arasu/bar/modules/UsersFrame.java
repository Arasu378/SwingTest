package com.arasu.bar.modules;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class UsersFrame extends JFrame {
    static UsersFrame frame;
    public UsersFrame() {
        //Code to view data in JTable
        List<BarModels> list=DB.view();
        int size=list.size();

        String data[][]=new String[size][18];
        int row=0;
        for(BarModels a:list){
            data[row][0]=String.valueOf(a.getId());
            data[row][1]=String.valueOf(a.getUserProfileId());
            data[row][2]=a.getUserFirstName();
            data[row][3]=a.getUserLastName();
            data[row][4]=a.getUserMobileNumber();
            data[row][5]=a.getUserEmail();
            data[row][6]=a.getUserVenueName();
            data[row][7]=a.getUserCountry();
            data[row][8]=a.getUserOfternInventory();
            data[row][9]=String.valueOf(a.getUserInventoryTime());
            data[row][10]=a.getCreatedOn();
            data[row][11]=a.getModifiedOn();
            data[row][12]=a.getPassword();
            data[row][13]=String.valueOf(a.getIsActive());
            data[row][14]=a.getUserLastLogin();
            data[row][15]=a.getUserAuthorizationKey();
            data[row][16]=a.getUserRole();
            data[row][17]=String.valueOf(a.getParentUserProfileId());
            row++;
        }
        String columnNames[]={"Id","UserProfileId","UserFirstName","UserLastName","UserMobileNumber",
        "UserEmail","UserVenueName","UserCountry","UserOftenInventory","UserInventoryTime","CreatedOn","ModifiedOn",
        "Password","IsActive","UserLastLogin","UserAuthorizationKey","UserRole","ParentUserProfileId"};

        JTable jt=new JTable(data,columnNames);
        JScrollPane sp=new JScrollPane(jt);
        add(sp);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 400);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new UsersFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
