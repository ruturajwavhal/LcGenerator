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
public class LcData {
    public boolean isAddLcData(Statement st, String student_id, String pulpilName, String motherName, String caste, String nationality, String POB, String DOB, String DOBW, String LSA, String DOA, String progress, String conduct, String DOL, String StdS, String ROL, String ErNo, String lcNum)
    {
        boolean flag = false;
        try
        {
            String query = "insert into lc_data values('"+student_id+"','"+pulpilName+"','"+motherName+"', '"+caste+"', '"+nationality+"', '"+POB+"', '"+DOB+"', '"+DOBW+"', '"+LSA+"', '"+DOA+"', '"+progress+"', '"+conduct+"', '"+DOL+"', '"+StdS+"', '"+ROL+"', '"+ErNo+"','"+lcNum+"')";
            //System.out.println(query);
            int x = st.executeUpdate(query);
            if(x>0)
                flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Add LC Info : "+ex);
        }
        return flag;
    }
    
    
    public ArrayList isFetchLcInfo(Statement st, String studentId)
    {
        ArrayList <String>lcData = new ArrayList();
        
        try
        {
            String query = "select * from lc_data where student_id='"+studentId+"'";
            //System.out.println("Query  = "+query);
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                lcData.add(rs.getString(2));
                lcData.add(rs.getString(3));
                lcData.add(rs.getString(4));
                lcData.add(rs.getString(5));
                lcData.add(rs.getString(6));
                lcData.add(rs.getString(7));
                lcData.add(rs.getString(8));
                lcData.add(rs.getString(9));
                lcData.add(rs.getString(10));
                lcData.add(rs.getString(11));
                lcData.add(rs.getString(12));
                lcData.add(rs.getString(13));
                lcData.add(rs.getString(14));
                lcData.add(rs.getString(15));
                lcData.add(rs.getString(16));
                lcData.add(rs.getString(17));
                
                
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Fetch LC info is "+ex);
        }
        return lcData;
    }
    
    public boolean isModifyLcData(Statement st, String student_id, String pulpilName, String motherName, String caste, String nationality, String POB, String DOB, String DOBW, String LSA, String DOA, String progress, String conduct, String DOL, String StdS, String ROL, String ErNo)
    {
        boolean flag = false;
        try
        {
            String query = "update lc_data set pulpil_name='"+pulpilName+"', mother_name='"+motherName+"', caste='"+caste+"', nationality='"+nationality+"', pb='"+POB+"', dob='"+DOB+"', dob_word='"+DOBW+"', last_school_attended='"+LSA+"', doa='"+DOA+"' where student_id='"+student_id+"'";
            //System.out.println(query);
            int x = st.executeUpdate(query);
            if(x>0)
                flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Modify LC Info : "+ex);
        }
        return flag;
    }
    
    
        
}
