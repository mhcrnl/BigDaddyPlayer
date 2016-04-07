/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdaddyplayer;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author root
 */
public class OpenVideo {
    public void OpenWebsite(String Sitename){
        try{
            Process P;
            P = Runtime.getRuntime().exec("/bin/bash firefox https://youtube.com/"+Sitename);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error unable to open site");
        }
    }
    
}
