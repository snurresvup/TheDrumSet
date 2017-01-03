import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private boolean on;
    private String effectType;
    private TcpClient client;

    public Button(String effectType) {
        getImage().scale(90, 30);
        this.effectType = effectType;
        client = TcpClient.getInstance();
    }

    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            on = !on;
            swapImage();
            String onOrOff = (on) ? "on" : "off";
            client.send(effectType + "-" + onOrOff);
        }
    }   

    private void swapImage() {
        if (on) {
            setImage("button-on.png"); 
        } else {
            setImage("button-off.png");
        }    
        getImage().scale(90, 30);
    }
}