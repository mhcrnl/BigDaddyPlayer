package bigdaddyplayer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;





public class PlayMusic{
    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;
    public long PauseFrame;
    public long SongLength;
    public String FileLocation;
    public void stop(){
        if (player != null){
            
            player.close();
            PauseFrame = 0;
            SongLength = 0;
        }
    }
    
    public void Pause() throws IOException{
        PauseFrame = FIS.available();
        player.close();
    }
    public void Resume() throws FileNotFoundException{
        FIS = new FileInputStream(FileLocation);
        BIS = new BufferedInputStream(FIS);
        try {
            FIS.skip(SongLength-PauseFrame);
        } catch (IOException ex) {
            Logger.getLogger(PlayMusic.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            player = new Player(BIS);
        } catch (JavaLayerException ex) {
          
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
    
    
    
    public void play(String path) throws FileNotFoundException{
        FIS = new FileInputStream(path);
        BIS = new BufferedInputStream(FIS);
        
        try {
            player = new Player(BIS);
            SongLength= FIS.available();
            FileLocation = path + "";
        } catch (JavaLayerException ex) {
            
        } catch (IOException ex) {
            
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