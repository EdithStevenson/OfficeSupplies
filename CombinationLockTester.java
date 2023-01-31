
/**
 * CombinationLockTester
 *
 * @author Edith and Grace
 * @version 01-30-2023
 */
public class CombinationLockTester
{
    public static void main(String[] args)
    {
        System.out.println("Testing the CombinationLock");
        System.out.println("");
        
        System.out.println("First constructing a lock where we set the code!");
        CombinationLock lockA = new CombinationLock(23,1,34);
        System.out.println("Here's the code");
        System.out.println(lockA.getCombo());
        System.out.println("");
        
        System.out.println("Now constructing a lock where the computer randomizes the code!");
        CombinationLock lockB = new CombinationLock();
        System.out.println("Here's the code");
        System.out.println(lockB.getCombo());
        System.out.println("We can also get it this way");
        System.out.println(lockB.getFirstNum());
        System.out.println(lockB.getSecondNum());
        System.out.println(lockB.getThirdNum());
        System.out.println("");
        
        System.out.println("Is the lock locked or unlocked? It needs to be locked for us to try cracking it!");
        if (lockB.getLockStatus())
        {
            System.out.println("Locked");
        }
        else
        {
            System.out.println("Unlocked");
        }
        System.out.println("");
        
        System.out.println("If I try to open it without locking it, it should reject my attempt");
        System.out.println(lockB.openLock(0,0,0));
        System.out.println("");
        
        System.out.println("Let's lock it!");
        lockB.lock();
        if (lockB.getLockStatus())
        {
            System.out.println("Locked");
        }
        else
        {
            System.out.println("Unlocked");
        }
        System.out.println("");
        
        System.out.println("I'm going to mess up the first number");
        System.out.println(lockB.openLock(70,0,0));
        System.out.println("");
        
        System.out.println("I'm going to mess up the second number");
        System.out.println(lockB.openLock(lockB.getFirstNum(),70,0));
        System.out.println("");
        
        System.out.println("I'm going to mess up the third number");
        System.out.println(lockB.openLock(lockB.getFirstNum(),lockB.getSecondNum(),70));
        System.out.println("");
        
        System.out.println("I'm going to open it now!");
        System.out.println(lockB.openLock(lockB.getFirstNum(),lockB.getSecondNum(),lockB.getThirdNum()));
        System.out.println("");
        
        System.out.println("Let's check the lock status");
        lockB.lock();
        if (lockB.getLockStatus())
        {
            System.out.println("Locked");
        }
        else
        {
            System.out.println("Unlocked");
        }
        System.out.println("");
        
        System.out.println("Let's reset the lock");
        lockB.reset();
        System.out.println("The new combo");
        System.out.println(lockB.getCombo());
        System.out.println("");
        
        System.out.println("Locking it again!");
        lockB.lock();
        System.out.println("And openning it with the new combo!");
        System.out.println(lockB.openLock(lockB.getFirstNum(),lockB.getSecondNum(),lockB.getThirdNum()));
        System.out.println("");
        
        System.out.println("Let's check the lock status");
        lockB.lock();
        if (lockB.getLockStatus())
        {
            System.out.println("Locked");
        }
        else
        {
            System.out.println("Unlocked");
        }
        System.out.println("");
        
        
    }
}
