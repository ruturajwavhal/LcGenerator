/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 4756
 */
public class FetchRegistrationInfo {
    public ArrayList isFetchStaffRegistrationInfo(Statement st, String username)
    {
        ArrayList <String>staffData = new ArrayList();
        
        try
        {
            String query = "select * from staff_registration_info where username='"+username+"'";
            //System.out.println("Query  = "+query);
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                staffData.add(rs.getString(1));
                staffData.add(rs.getString(2));
                staffData.add(rs.getString(3));
                staffData.add(rs.getString(4));
                staffData.add(rs.getString(5));
                staffData.add(rs.getString(6));
                staffData.add(rs.getString(7));
                
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Staff fetching regiseration info is "+ex);
        }
        return staffData;
    }
    
    
    public ArrayList isFetchStudentRegistrationInfo(Statement st, String username)
    {
        ArrayList <String>StudentData = new ArrayList();
        
        try
        {
            String query = "select * from student_registration_info where username='"+username+"'";
            System.out.println("Query  = "+query);
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                StudentData.add(rs.getString(1));
                StudentData.add(rs.getString(2));
                StudentData.add(rs.getString(3));
                StudentData.add(rs.getString(4));
                StudentData.add(rs.getString(5));
                StudentData.add(rs.getString(6));
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Student fetching regiseration info is "+ex);
        }
        return StudentData;
    }
    
    
    
    public String isFetchStudentEmail(Statement st, String student_id)
    {
        String email = "";
        
        try
        {
            String query = "select * from student_registration_info where id='"+student_id+"'";
            System.out.println("Query  = "+query);
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                
                email = rs.getString(3);
                
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Student fetching Email info is "+ex);
        }
        return email;
    }
}
