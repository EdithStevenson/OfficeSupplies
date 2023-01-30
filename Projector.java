
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
    private ArrayList<String> slideshow; 
    
    /**
     * Constructor for objects of class Projector
     */
    public Projector()
    {
        // initialise instance variables
        power = false; 
        slideshow = new ArrayList<String>(); 
    }

    public boolean getPowerStatus()
    {
        return power; 
    }
    public void changePower()
    {
        power = !power; 
    }
    public void addSlide(String slide)
    {
        slideshow.add(slide); 
    }
    public ArrayList getPresentation()
    {
        return slideshow; 
    }
}
