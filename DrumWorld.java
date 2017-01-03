import greenfoot.*;

/**
 * Write a description of class DrumWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrumWorld extends World
{

    /**
     * Constructor for objects of class DrumWorld.
     * 
     */
    public DrumWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 572, 1); 
        addObject(new SnareDrum(), 350, 350);
        addObject(new BassDrum(), 480, 225);
        addObject(new Button("reverb"), 70, 90);
        addObject(new ReverbEffect(), 200, 90);
    }
}
