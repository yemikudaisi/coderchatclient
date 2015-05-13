/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderchat;

import com.coderchat.app.Globals;
import com.coderchat.core.helpers.DialogHelper;
import com.coderchat.ui.LoginFrame;
import com.coderchat.ui.Shell;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author yemikudaisi
 */
public class CoderChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } catch (ParseException | UnsupportedLookAndFeelException ex) {
            DialogHelper.showError(ex);
            System.exit(7);
        }
        //Shell app =new Shell();
        LoginFrame app = new LoginFrame();
        app.setVisible(true);
        try {
            Globals.init();
        } catch (IOException ex) {
            Logger.getLogger(CoderChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
