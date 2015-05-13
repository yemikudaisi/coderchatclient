/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderchat.core.helpers;

import com.coderchat.ui.Shell;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yemikudaisi
 */
public class DialogHelper {
    public static void showError(Exception ex){
        JOptionPane.showMessageDialog(null,
                ex.toString(),
                "Error" ,
                JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Shell.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    public static void showMessage(String title, String message){
        JOptionPane.showMessageDialog(null,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
