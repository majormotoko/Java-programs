public class Rectangle extends Shape
{
	private double myWidth;
	private double myLength;
	public Rectangle(String color, double width, double length)
	{
	super(color);
	myWidth = width;
	myLength = length;
	}
	public double getPerimeter()
	{
	return 2 * (myWidth + myLength);
	}
	/*	this method computes and returns the object's area. 
	It must be overridden in each derived class*/
	public double area()
	{
	return myWidth * myLength;
	}
	/*	public String toString() - this method returns the object's description 
	(color, type, measurements, and area) as a String.
	ex. "green Rectangle with length of 2.0 and width of 4.0 and area of 8.0"*/
	public String toString(){
		return String.format(getColor() + " Rectangle with length of " + myLength 
					+ " and width of " + myWidth + " and area of " + "%.4f", area());
	}
}