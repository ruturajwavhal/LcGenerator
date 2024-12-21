/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;

import java.sql.Statement;

/**
 *
 * @author 4756
 */
public class ApplyLc {
    public boolean isApplyLc(Statement st, String student_id, String StdS, String ROL, String ErNo)
    {
        boolean flag = false;
        try
        {
            String query = "update lc_data set standard='"+StdS+"', reason='"+ROL+"', en_number='"+ErNo+"' where student_id='"+student_id+"'";
            //System.out.println(query);
            int x = st.executeUpdate(query);
            if(x>0)
                flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Apply LC Info : "+ex);
        }
        return flag;
    }
    
    
    
    public boolean isAddedLcApplication(Statement st, String student_id ,String en_number, String StdS, String student_name, String dateTime, String hod, String addmision, String fee, String mess, String hostel)
    {
        boolean flag = false;
        try
        {
            String query = "insert into lc_application_info values('"+student_id+"','"+en_number+"','"+StdS+"','"+student_name+"','"+dateTime+"','"+hod+"','"+addmision+"','"+fee+"','"+mess+"','"+hostel+"')";
            System.out.println(query);
            int x = st.executeUpdate(query);
            if(x>0)
                flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Add LC Application Info : "+ex);
        }
        return flag;
    }
    
    public boolean isUpdateLcApplication(Statement st, String student_id ,String en_number, String StdS, String student_name, String hod, String addmision, String fee, String mess, String hostel)
    {
        boolean flag = false;
        try
        {
            String query = "update lc_application_info set en_number='"+en_number+"',standard='"+StdS+"',student_name='"+student_name+"', hod='"+hod+"',addmission='"+addmision+"',fee='"+fee+"',mess='"+mess+"',hostel='"+hostel+"' where student_id ='"+student_id+"'";
            System.out.println(query);
            int x = st.executeUpdate(query);
            if(x>0)
                flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Update LC Application Info : "+ex);
        }
        return flag;
    }

   
}
