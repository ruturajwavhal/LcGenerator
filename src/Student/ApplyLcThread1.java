/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import javax.swing.JOptionPane;

/**
 *
 * @author 4756
 */
public class ApplyLcThread1 extends Thread
{
    public void run()
    {
         try
        {
            Thread.sleep(2000);
        }
        catch(Exception ex)
        {
            System.out.println("Exception while waiting  "+ex);
        }
        
        JOptionPane.showMessageDialog(null, "Please Add Personal Info Then Apply");
    }
}
