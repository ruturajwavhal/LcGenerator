/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;
import java.sql.*;
/**
 *
 * @author 4756
 */
public class Register {
    public boolean isStaffRegister(Statement st, String name, String mob, String email,String id, String position, String username, String pass )
    {
        boolean flag = false;
        try
        {
            String query="insert into staff_registration_info values('"+name+"','"+mob+"','"+email+"','"+id+"','"+position+"','"+username+"','"+pass+"')";
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Staff Registeration is "+ex);
        }
        return flag;
    }
    
    
    public boolean isStudentRegister(Statement st, String name, String mob, String email,String id, String username, String pass )
    {
        boolean flag = false;
        try
        {
            String query="insert into student_registration_info values('"+name+"','"+mob+"','"+email+"','"+id+"','"+username+"','"+pass+"')";
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Student Registeration is "+ex);
        }
        return flag;
    }
}
