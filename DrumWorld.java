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
        addObject(new BassDrum(), 461, 224);
        addObject(new SnareDrum(), 356, 334);
        addObject(new Button("reverb"), 70, 90);
        addObject(new ReverbEffect(), 200, 90);
        addObject(new TomTomLarge(), 550, 355);
        addObject(new ChinaCymbal(), 677, 350);
        addObject(new TomTomSmall(), 360, 230);
        addObject(new HiHat(), 245, 355);
        addObject(new CrashCymbal(), 260, 264); 
    }
}
