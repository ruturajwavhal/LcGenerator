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
public class SerialNumberFetcher {
    public ArrayList getSr_no()
    {
        ArrayList sr_no=new ArrayList();
        try
        {
            
            Statement st = new DB_Connectivity().getConnection();
            
             String query="select * from lc_data";
             ResultSet rs=st.executeQuery(query);
             while(rs.next())
             {
                 sr_no.add(rs.getString(17));
             }
             System.out.println("SR_ no is "+sr_no);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return sr_no;
    }
}
