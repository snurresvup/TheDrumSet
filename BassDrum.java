import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BassDrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BassDrum extends Actor
{
    private TcpClient client;

    public BassDrum() {
        client = TcpClient.getInstance();
    }

    public void act() {
        onClick();
    }   

    private void onClick() {
        if (Greenfoot.mousePressed(this)) {
            client.send("bass");
        }
    }   
}
