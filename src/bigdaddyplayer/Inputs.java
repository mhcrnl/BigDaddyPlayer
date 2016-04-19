/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdaddyplayer;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class Inputs extends Thread {
    URLConnection streamer;
    InputStream in;
    public Inputs(URLConnection urlconn){
       streamer = urlconn; 
    }
    
    
    
    
    public void run(){
        try {
            in = streamer.getInputStream();
        } catch (IOException ex) {
            Logger.getLogger(Inputs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public InputStream test(){
        return in;
    }
    
}
