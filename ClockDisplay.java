
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // 
    private NumberDisplay minute;
    private NumberDisplay hour;
    private String currentTime;

    public ClockDisplay()
    {
       hour = new NumberDisplay(24);
       minute = new NumberDisplay (60);
       currentTime = hour.getDisplayValue() + ":" + minute.getDisplayValue();
    }
    
    public ClockDisplay(int hour, int minute)
    {
       hour = new NumberDisplay(24);
       minute = new NumberDisplay(60);
    }
    
    /**
     * This method sets the time to 00:00.
     */
    public void resetTime()
    {
        // 
        minutes = 0;
        hours = 0;
        return hours + minutes;
    }

    
    public int setTime(int newHour, int newMinute)
    {
        if (hour < 23 && hour > 0)
        {
            hour = newHour;
        }
      
        if (minute < 59 && minute > 0)
        {
            minute = newMinute;
        }
    }
    
    public String getTime()
    {
        if (hour < 10)
        {
            time = "0" + hour;
        }
        else
        {
            time = "" + minute;
        }
        if(minute < 10)
        {
            time = time + "0" + minute;
        }
        else
        {
            time = time + minute;
        }
    }
        
    
    
    public void timeTick()
    {
       if(minute > setLimitDisplay)
       {
       minute = minute +1; 
    }
    else
    {
        minute = 0;
    }
        
    }
    
}
