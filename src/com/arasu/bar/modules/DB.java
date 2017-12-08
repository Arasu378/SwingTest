package com.arasu.bar.modules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DB {
    public static Connection getCon(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //
            con= DriverManager.getConnection("jdbc:mysql://210.18.177.47:3306/bar?useSSL=true","root","kyrostechnologies");
        }catch(Exception e){System.out.println(e);}
        return con;
    }
    public static List<BarModels> view(){
        List<BarModels> list=new ArrayList<BarModels>();
        try{
            Connection con=getCon();
            PreparedStatement ps=con.prepareStatement("select * from bar.userprofile");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                BarModels a=new BarModels();
                a.setId(rs.getInt("Id"));
               a.setUserProfileId(rs.getInt("UserProfileId"));
               a.setUserFirstName(rs.getString("UserFirstName"));
               a.setUserLastName(rs.getString("UserLastName"));
               a.setUserMobileNumber(rs.getString("UserMobileNumber"));
               a.setUserEmail(rs.getString("UserEmail"));
               a.setUserVenueName(rs.getString("UserVenueName"));
               a.setUserCountry(rs.getString("UserCountry"));
               a.setUserOfternInventory(rs.getString("UserOftenInventory"));
               a.setUserInventoryTime(rs.getInt("UserInventoryTime"));
               a.setCreatedOn(rs.getString("CreatedOn"));
               a.setModifiedOn(rs.getString("ModifiedOn"));
               a.setPassword(rs.getString("Password"));
               a.setIsActive(rs.getBoolean("IsActive"));
               a.setUserLastLogin(rs.getString("UserLastLogin"));
               a.setUserAuthorizationKey(rs.getString("UserAuthorizationKey"));
               a.setUserRole(rs.getString("UserRole"));
               a.setParentUserProfileId(rs.getInt("ParentUserProfileId"));
                list.add(a);
            }
            con.close();
        }catch(Exception e){System.out.println(e);}
        return list;
    }
}
