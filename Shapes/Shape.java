
public class Shape {
	//private String instance variable representing the shape's color
	private String color;
	
	// - a constructor that sets the color instance value.
	public Shape(){
	color = "No color yet";
	}
	public Shape(String initialColor)
	{
	color = initialColor;
	}

	// - this method returns the object's color value. 
	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		color = newColor;
	}
	
/*	public double area() - this method computes and returns the object's area. 
	It must be overridden in each derived class. 
	For the base Shape class, this method returns 0.0.*/
	public double area(){
		return 0.0;		
	}
	
	public double getArea(){
		return area();		
	}
	
/*	public String toString() - this method returns the object's description 
	(color, type, measurements, and area) as a String. 
	It must be overridden in each derived class. 
	For the base Shape class, this method returns the string "generic shape".*/
	public String toString(){
		return "generic shape";		
	}

}
/*Sample output

Enter a list of shapes - 'done' to end

Enter the shape's color (or 'done')...
red
Enter shape type...
circle
Enter the radius...
5.0

Enter the shape's color (or 'done')...
green
Enter shape type...
rectangle
Enter the length and width...
2.0 4.0

Enter the shape's color (or 'done')...
blue
Enter shape type...
square
Enter the length of a side...
3.0

Enter the shape's color (or 'done')...
done

The list of shapes entered...
  red circle with radius of 5.0 and area of 78.53975
  green Rectangle with length of 2.0 and width of 4.0 and area of 8.0
  blue Square with side length of 3.0 and area of 9.0

Sorting shapes into order by area...

The sorted list of shapes...
  green Rectangle with length of 2.0 and width of 4.0 and area of 8.0
  blue Square with side length of 3.0 and area of 9.0
  red circle with radius of 5.0 and area of 78.53975*/

/*An example from the homework is the base class Shape's area() method that is overridden in each of the derived classes.  
By defining area() in the base Shape class, all classes derived from Shape inherit that method (and functionality). 
Since the base class area() method just returns 0, 
each derived class must override the area() method to perform their own shape specific area calculation.
For example, the Circle.area() method override uses the Circle's derived class mRadius member to calculate its area with the formula 
3.14159 * mRadius * mRadius.   
Likewise, the Square.area() method override uses the Square's derived class mSide member to calculate its area with the formula 
mSide * mSide.*/