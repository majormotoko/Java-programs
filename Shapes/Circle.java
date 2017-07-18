public class Circle extends Shape
{
	private double myRadius;
	public Circle(String color, double radius)
	{
	super(color);
	myRadius = radius;
	}
/*	this method computes and returns the object's area. 
	It must be overridden in each derived class*/
	public double area()
	{
	return Math.PI * myRadius * myRadius;	
	}
	/*	public String toString() - this method returns the object's description 
	(color, type, measurements, and area) as a String.
	ex."red Circle with radius of 5.0 and area of 78.53975"*/
	public String toString(){
		return String.format(getColor() + " Circle with radius of " + myRadius + " and area of " + "%.4f", area());		
	}
}
