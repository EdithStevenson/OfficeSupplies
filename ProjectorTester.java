
/**
 *  ProjectorTester
 *
 * @author Edith and Grace
 * @version 01-30-2023
 */
import java.util.ArrayList; 
public class ProjectorTester
{
    public static void main(String[] args)
    {
        Projector a = new Projector(); 
        System.out.println("Projector power status meaning: false = off/ true = on"); 
        System.out.println("Power status? " + a.getPowerStatus());  
        System.out.println("Turning projector on."); 
        a.changePower(); 
        System.out.println("Power status? " + a.getPowerStatus()); 
        
        System.out.println("Making a slideshow!"); 
        Projector mySlideshow = new Projector(); 
        System.out.println("Adding slides to the slideshow"); 
        mySlideshow.addSlide("Introduction");
        mySlideshow.addSlide("Presentation Outline"); 
        mySlideshow.addSlide("First Data Summary"); 
        mySlideshow.addSlide("Second Data Summary"); 
        mySlideshow.addSlide("Conclusion"); 
        System.out.println("Showing full presentation.."); 
        System.out.println(mySlideshow.getPresentation()); 
        
        System.out.println("Finished slideshow, powering off.."); 
        a.changePower(); 
        System.out.println("Power status? " + a.getPowerStatus()); 
        
        
    }
}
