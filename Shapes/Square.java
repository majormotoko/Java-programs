public class Square extends Shape
{
	private double myLength;
	public Square(String color, double length)
	{
	super(color);
	myLength = length;
	}
	public double getPerimeter()
	{
	return 4 * (myLength);
	}
	/*	this method computes and returns the object's area. 
	It must be overridden in each derived class*/
	public double area()
	{
	return myLength * myLength;
	}
	/*	public String toString() - this method returns the object's description 
	(color, type, measurements, and area) as a String.
	ex. "blue Square with side length of 3.0 and area of 9.0"*/
	public String toString(){
		return String.format(getColor() + 
		" Square with side length of " +  myLength + " and area of " + "%.4f", area());	
	}
}
