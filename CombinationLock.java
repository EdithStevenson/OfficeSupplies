
/**
 * Combination Lock
 *
 * @Edith and Grace
 * @version 01-30-2023
 */
public class CombinationLock
{
    private int firstNum;
    private int secondNum;
    private int thirdNum;
    private boolean lockedStatus;

    /**
     * Constructor for objects of class CombinationLock (if user enters own combination)
     */
    public CombinationLock(int firstNum, int secondNum, int thirdNum)
    {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
        lockedStatus = false;
    }
    
    /**
     * Constructor for objects of class CombinationLock (randomizes code)
     */
    public CombinationLock()
    {
        firstNum = (int) (Math.random() * 40);
        secondNum = (int) (Math.random() * 40);
        thirdNum = (int) (Math.random() * 40);
        lockedStatus = false;
    }
    
    /**
     * returns lock status
     * 
     * @return the locked status of lock
     * 
     */
    public boolean getLockStatus()
    {
        return lockedStatus;
    }
    
     /**
     * changes locked status
     * 
     */
    public void lock()
    {
         lockedStatus = true;
    }
    
     /**
     * gets lock combo
     * 
     * @return String version of combo
     */
    public String getCombo()
    {
         String combo = firstNum +"-" + secondNum + "-"+ thirdNum;
         return combo;
    }
    
     /**
     * gets 1st number of lock combo
     * 
     * @return int of 1st number of lock combo
     */
    public int getFirstNum()
    {
         return firstNum;
    }
    
     /**
     * gets 2nd number of lock combo
     * 
     * @return int of 2nd number of lock combo
     */
    public int getSecondNum()
    {
         return secondNum;
    }
    
     /**
     * gets 3rd number of lock combo
     * 
     * @return int of 3rd number of lock combo
     */
    public int getThirdNum()
    {
         return thirdNum;
    }
    
     /**
     * try openning the lock (must be locked to begin)
     * 
     * @param first number
     * @param second number
     * @param third number
     * @return message of success/error
     */
    public String openLock(int oneNum, int twoNum,int threeNum)
    {
         String message = "";
        if (lockedStatus)
         {
             if (oneNum == firstNum)
             {
                 if (twoNum == secondNum)
                 {
                     if (threeNum == thirdNum)
                     {
                         lockedStatus = false;
                         message = "Unlocked!";
                     }
                     else
                         message = "Still locked! 3rd number wrong";
                 }
                 else
                     message = "Still locked! 2nd number wrong";
             }
             else
             message = "Still locked! 1st number wrong";
         }
         else
         {
             message = "Whoops! Lock needs to be locked for you to try to unlock it!";
         }
         return message;
    }
    
     /**
     * reset the lock combo
     * 
     */
    public void reset()
    {
        firstNum = (int) (Math.random() * 40);
        secondNum = (int) (Math.random() * 40);
        thirdNum = (int) (Math.random() * 40);
    }
}
