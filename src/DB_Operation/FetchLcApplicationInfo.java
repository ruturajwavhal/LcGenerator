/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;

import Staff.StaffDataKepper;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 4756
 */
public class FetchLcApplicationInfo {
    public ArrayList isStudentPendingLcApplicationInfo(Statement st1, String student_id)
    {
       ArrayList<String> pendingInfo = new ArrayList();
        try
        {
            
            String query = "select * from lc_application_info where student_id = '"+student_id+"'";
            ResultSet rs1=st1.executeQuery(query);
            while(rs1.next())
            {
                
                pendingInfo.add(rs1.getString(6));
                pendingInfo.add(rs1.getString(7));
                pendingInfo.add(rs1.getString(8));
                pendingInfo.add(rs1.getString(9));
                pendingInfo.add(rs1.getString(10));
            }
            
            }
        catch(Exception ex)
        {
            System.out.println("Exception in fetching applied data : "+ex);
        }
        return pendingInfo;
    }
    
    
    public void fetchAllLcApplicationData()
    {
        boolean flag = false;
        try
        {
            Statement st1= new DB_Connectivity().getConnection();
            Statement st2= new DB_Connectivity().getConnection();
            
            String query = "select * from lc_application_info";
            System.out.println("Query = "+query);
            ResultSet rs1=st1.executeQuery(query);
            ResultSet rs2=st2.executeQuery(query);
            int x=0;
            while(rs1.next())
            {
                x++;
                flag=true;
            }
            String data1[][]=new String[x][11];
            int n=0;
            while(rs2.next())
            {
                data1[n][0]=rs2.getString(1);
                data1[n][1]=rs2.getString(2);
                data1[n][2]=rs2.getString(3);
                data1[n][3]=rs2.getString(4);
                data1[n][4]=rs2.getString(5);
                data1[n][5]=rs2.getString(6);
                data1[n][6]=rs2.getString(7);
                data1[n][7]=rs2.getString(8);
                data1[n][8]=rs2.getString(9);
                data1[n][9]=rs2.getString(10);
//                data1[n][10]=rs2.getString(11);
                n++;   
            }
            StaffDataKepper.lcApplicationData=data1;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in fetching lc applied info : "+ex);
        }
        
    }
    
    
}
