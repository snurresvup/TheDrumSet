import greenfoot.*;

/**
 * Write a description of class SnareDrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnareDrum extends Actor
{
    private TcpClient client;

    public SnareDrum() {
        client = TcpClient.getInstance();
    }

    public void act() {
        onClick();
    }   

    private void onClick() {
        if (Greenfoot.mousePressed(this)) {
            client.send("snare");
        }
    }
}
