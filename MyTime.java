
/* MyTime - a simple time class
 * Add code to replace the temporary 'return' statements in the methods,
 * and additional parameter checking code in the setTime method, etc.
 * The temporary 'return' statements are needed to compile OK until
 * you replace them with the actual code.
 */
public class MyTime {
	
    // Instance variables holding the time (in 24 hour universal form).
    private int mHour;      // 0 - 23
    private int mMinute;    // 0 - 59
    private int mSecond;    // 0 - 59
       
    /* Sets the time value for this MyTime object. If *any* of the parameter
     * values are out of range, the time is set to 00:00:00.
     * @param hour      the hour (0 to 23).
     * @param minute    the minute (0 to 59).
     * @param second    the second (0 to 59).
     */
    public void setTime(int hour, int minute, int second)
    {
    	if ((hour >= 0 && hour < 24 ) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60))
    	{
    		mHour = hour;
    		mMinute = minute;
    		mSecond = second;
    	}
        else
    	{
    		mHour = 0;
    		mMinute = 0;
    		mSecond = 0;
    	}
    }  
    
    // Returns the hour value represented by this MyTime.
    public int getHour()
    {
        return mHour;
    }
    
    // Returns the minute value represented by this MyTime.     
    public int getMinute()
    {
        return mMinute;
    }

    // Returns the second value represented by this MyTime.
    public int getSecond()
    {
        return mSecond;
    }

    
    /* Compares this MyTime object against another MyTime object.
     * The result is true if and only if the argument is not null
     * and represents a time that is the same time as represented
     * by this object
     * @param  other    the object to be compared.
     * @returns  true if both objects represent the same time value,
     *           false otherwise.
     */
    public boolean equals(MyTime other)
    {
        // TODO - add code to return 'true' if 'this' MyTime matches
        // the time values in the 'other' MyTime object, else return false.
    	
    	if (other.getHour() == this.getHour() && other.getMinute() == this.getMinute() && other.getSecond() == this.getSecond())
    		return true;
    	else
        return false;
    }
    
   
    /* Returns the time of this MyTime object in HH:MM:SS AM/PM form.
     * Ex: time values of 9,15,0 returns:  9:15:00 AM
     * Ex: time values of 23,30,0 returns:  11:30:00 PM
     * @return the time value represented by this object as a String
     *         formatted as HH:MM:SS AM/PM .
     */
    public String toString()
    {    	
    	String result = "";
    	int ap = mHour;
    	if (ap < 13)
    		result = String.valueOf(mHour) + ":" + twoDigits(getMinute()) + ":" +twoDigits(getSecond()) + " AM";
    	else
    		result = String.valueOf(mHour - 12) + ":" + twoDigits(getMinute()) + ":" +twoDigits(getSecond()) + " PM";
        return result;
    }
    
    /*
     * Returns the time of this MyTime object in 24 hour universal form.
     *
     * @return the time value represented by this object as a String
     *         formatted as HH:MM:SS universal time.
     */    
    public String toUniversalString()
    {
    	String result = twoDigits(getHour()) + ":" + twoDigits(getMinute()) + ":" +twoDigits(getSecond());       
        return result;
    }
    
   
    /* Returns the parameter value as a two digit String (with leading 0 if needed)
     * @return the parameter 'value' formatted as a two digit String
     *         (with leading zero if needed).
     */
    private String twoDigits(int value)
    {
         String result = Integer.toString(value);
         result = String.format("%02d", value);
         return result;
    }
}

