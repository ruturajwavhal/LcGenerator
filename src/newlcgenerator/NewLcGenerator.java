/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newlcgenerator;

import GUI.MainFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author 4756
 */
public class NewLcGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame sg = new MainFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        sg.setVisible(true);
        sg.setSize(d);
    }
    
}
