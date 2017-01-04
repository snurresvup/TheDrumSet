import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class ReverbEffect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Effect extends Actor
{
    private Effects currentlySelectedEffect = Effects.HALL;
    private TcpClient client;

    private enum Effects {
        HALL("hall"),

        BATHROOM("bathroom");

        private String name;

        private Effects(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }        
    }

    public Effect() {
        updateImage();
        getImage().scale(150, 150);
        client = TcpClient.getInstance();
    }

    public void act() {
        if (Greenfoot.mousePressed(this)) {
            currentlySelectedEffect = Effects.values()[(currentlySelectedEffect.ordinal() + 1) % Effects.values().length];
            updateImage();
            client.send("effects-" + currentlySelectedEffect.getName());
        }
    }       

    private void updateImage() {
        setImage(currentlySelectedEffect.getName() + ".jpg");
    }
}
