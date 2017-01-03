import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.event.*;

/**
 * Write a description of class Instrument here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrument extends Actor {
    private TcpClient client;
    private String key;
    private String sound;
    private boolean released;

    public Instrument(String key, String sound) {
        client = TcpClient.getInstance();
        this.key = key;
        this.sound = sound;
    }

    protected void playSound(String sound) {
        client.send(sound);
    }

    public void act() {
        if (Greenfoot.mousePressed(this)) { 
            playSound(sound);
        }

        if (Greenfoot.isKeyDown(key) && released) {
            released = false;
            playSound(sound);
        }

        if (!Greenfoot.isKeyDown(key) && !released) {
            released = true;
        }
    }
}
