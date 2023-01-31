
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
        cap = true;
        inkAmount = 1.5; //amount in mL
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
        cap = false;
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
        String printMessage = "";
        if (!cap)
        {
            for (int i = 0; i<message.length(); i++)
            {
                if (inkAmount < 0)
                {
                    printMessage += "Oh no! You've ran out of ink";
                    break;
                }
                
                if (!message.substring(i).equals(" "))
                {
                   inkAmount -= 0.001;
                   printMessage += message.substring(i); 
                }
                else
                {
                    printMessage += message.substring(i);
                }
            }
            return printMessage;
        }
        else
        {
            return "Whoops! The cap is still on!";
        }
    }
}