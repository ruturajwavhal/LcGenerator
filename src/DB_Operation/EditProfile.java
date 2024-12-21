/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;
import java.sql.*;
import java.util.*;

/**
 *
 * @author 4756
 */
public class EditProfile {
    public boolean isEditStaffRegistrationInfo(Statement st, String name, String id, String mob, String email, String username, String pass)
    {
        boolean flag = false;
        try
        {
            String query = "update staff_registration_info set name='"+name+"', id='"+id+"', mobile='"+mob+"', email='"+email+"', password='"+pass+"' where username='"+username+"'";;
            int x = st.executeUpdate(query);
            if(x>0)
                flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in edit Staff Profile is "+ex);
        }
        
        return flag;
    }
    
    
    
    public boolean isEditStudentRegistrationInfo(Statement st, String name, String id, String mob, String email, String username, String pass)
    {
        boolean flag = false;
        try
        {
            String query = "update student_registration_info set name='"+name+"', id='"+id+"', mobile='"+mob+"', email='"+email+"', password='"+pass+"' where username='"+username+"'";;
            int x = st.executeUpdate(query);
            if(x>0)
                flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in edit Student Profile is "+ex);
        }
        return flag;
    }
}
