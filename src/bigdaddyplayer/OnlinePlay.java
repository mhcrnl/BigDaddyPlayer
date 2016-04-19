/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdaddyplayer;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;

import java.io.InputStream;
import static java.lang.System.in;
import java.net.URL;
import javazoom.jl.player.Player;
import java.net.URLConnection;
/**
 *
 * @author root
 */
public class OnlinePlay implements Playing{
    
    public String url2play;
    public Player player;
    public long PauseFrame=0;
    public long SongLength;
    public String FileLocation;
    
    
   
    public void play(String path){
        //FIS = new FileInputStream(path);
        //BIS = new BufferedInputStream(FIS);
        URL playingu; 
        try {
            playingu = new URL(path);
            url2play = path;
            URLConnection urlConn; 
            
            urlConn = (URLConnection) playingu.openConnection();
            System.out.println("2");
            
            
            //Inputs strm = new Inputs(urlConn);
            //strm.start();
            
            
            new Thread(){
            @Override
            public void run(){
                try {
                   InputStream in = urlConn.getInputStream();
                   player = new Player(in);
                   player.play();
                } catch (IOException ex) {
                    Logger.getLogger(OnlinePlay.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JavaLayerException ex) {
                    Logger.getLogger(OnlinePlay.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
            }.start();
            
            
            
            //InputStream in = strm.test();
            
            
            
            
            
            System.out.println("3");
            
            //SongLength = in.available();
            //in.skip(SongLength-PauseFrame);
            //System.out.println(SongLength);
            
            
        
         
             
            
        
    }   catch (IOException ex) {
            Logger.getLogger(OnlinePlay.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
  
    public void stop() {
       if (player != null){
            
            player.close();
            PauseFrame = 0;
            SongLength = 0;
        }
    }

    
    public void Pause() {
        try {
            PauseFrame = in.available();
            player.close();
        } catch (IOException ex) {
            Logger.getLogger(PlayMusic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    public void Resume() {
         URL playingu; 
        try {
            
            playingu = new URL(url2play);
       
            URLConnection urlConn; 
            
            urlConn = (URLConnection) playingu.openConnection();
            InputStream in = urlConn.getInputStream(); 
            in.skip(SongLength-PauseFrame);
            //SongLength = in.available();
            //System.out.println(SongLength);
            player = new Player(in);
        } catch (IOException | JavaLayerException ex) {
            Logger.getLogger(OnlinePlay.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        new Thread(){
            @Override
            public void run(){
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                   
                }
            }
        }.start();
    }
}
