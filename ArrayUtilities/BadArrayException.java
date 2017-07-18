// Write a custom Java exception class named BadArrayException that has two constructors
public class BadArrayException extends Exception {
	
	// A default constructor with no arguments
	public BadArrayException()
	{
		super("Bad Array Exception!");
	}

	/*	A constructor taking a String parameter (the exception message)
	The  message parameter must be passed to the parent Exception(String) constructor.*/
	public BadArrayException(String message)
	{
		super(message);
	}

}
