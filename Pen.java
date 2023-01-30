
/**
 * It's a pen!
 *
 * @author Edith and Grace
 * @version 01-30-2023
 */
public class Pen
{
    private boolean cap;
    private double inkAmount;

    /**
     * Constructor for objects of class Pen
     */
    public Pen()
    {
        cap = false;
        inkAmount = 1.5;
    }

    /**
     * Tells user if cap is on or off
     *
     * @return    cap status (on or off)
     */
    public boolean getCap()
    {
        return cap;
    }
    
    /**
     * Puts cap on
     * 
     */
    public void capOn()
    {
        cap = true;
    }
    
    
    /**
     * Puts cap on
     * 
     */
    public void capOff()
    {
        cap = true;
    }
    
    /**
     * Returns amount of ink left
     *
     * @return    amount of ink
     */
    public double getInkAmount()
    {
        return inkAmount;
    }
    
    /**
     * Refills ink
     *
     * @return    amount of ink
     */
    public void refillInk()
    {
        inkAmount=1.5;
    }
    
    /**
     * writes message (only if cap is on) and subtracts ink
     *
     * @return    amount of ink
     */
    public String write(String message)
    {
        int characters = 0;
        if (cap)
        {
            for (int i = 0; i < message.length(); i++)
            {
                if (!message.substring(i).equals(" "))
                {
                    characters += 1;
                }
            }
            
            for (int j = 0; j<characters; j++)
            {
                inkAmount -= 0.001;
                if (inkAmount <= 0)
                {
                    message += " You've ran out of ink";
                    break;
                }
            }
            return message;
        }
        else
        {
            return "Whoops! The cap is still on!";
        }
    }
}