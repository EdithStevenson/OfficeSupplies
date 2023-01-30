
/**
 * Write a description of class Projector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList; 
public class Projector
{
    // instance variables - replace the example below with your own
    private boolean power;
    
    
    /**
     * Constructor for objects of class Projector
     */
    public Projector()
    {
        // initialise instance variables
        power = false; 
    }

    public boolean getPowerStatus()
    {
        return power; 
    }
    public void changePower()
    {
        power = !power; 
    }
    
}
