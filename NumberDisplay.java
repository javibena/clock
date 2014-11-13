
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int display;
    private int setLimitDisplay;
    
    /**
     * Method to set the value limit of display.
     */
    public NumberDisplay( int limitDisplay)
    {
      setLimitDisplay = limitDisplay;
      display = 0;
    }

    /**
     * Method to set the value of display.
     */
    public void setValue(int value)
    {
        if (display < 10 )
        {
            System.out.println("0" + display);
        }
        else
        {
             System.out.println(display);
        }
    }

    
    /**
     * Returns the value of display.
     */
    public String getDisplayValue()
    {
        String s = String.format("%02d", (display));
        return s;
    }

    /**
     *
     */
    public int getValue()
    {
        return display;
    }
    
    /**
     * Increments display in 1 until the stablished limit. 
     * If the value reachs the limit it returns to 0.
     */
    public void increment()
    {
       if(display > setLimitDisplay)
       {
       display = display +1; 
    }
    else
    {
        display = 0;
    }
    }
    
   
}
