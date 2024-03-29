/**
 * ShapeDemo - simple inheritance hierarchy and dynamic binding.
 *
 * The Shape class must be compiled before the derived classes
 * Circle, Rectangle, and Square can be compiled.
 *
 * The Shape, Circle, Rectangle, and Square classes
 * must be compiled before this democlass can be compiled.
 *
 */

import java.util.Scanner;

public class ShapeDemo
{
    /**
     * getShape - read a Shape's description and create the specific object
     */
    public static Shape getShape()
    {
        Scanner sc = new Scanner(System.in);

        // Continue asking for input until a valid shape entered, or 'done'
        do {
            System.out.println("\nEnter the shape's color (or 'done')...");
            String color = sc.nextLine();
            if (color.equalsIgnoreCase("done")) {
                return null;
            }
            if (!color.equalsIgnoreCase("red") &&
                !color.equalsIgnoreCase("blue") &&
                !color.equalsIgnoreCase("green")) {
                System.out.println("  Error - color must be 'red', 'blue', or 'green'");
                continue;
            }

            System.out.println("Enter shape type...");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("circle")) {
                System.out.println("Enter the radius...");
                double radius = sc.nextDouble();
                if (radius < 0.0) {
                    System.out.println("Radius must be non-negative");
                    continue;
                }
                return new Circle(color, radius);
            } else if (name.equalsIgnoreCase("rectangle")) {
                System.out.println("Enter the length and width...");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                if (length < 0.0 || width < 0.0) {
                    System.out.println("length and width must be non-negative");
                    continue;
                }
                return new Rectangle(color, length, width);
            } else if (name.equalsIgnoreCase("square")) {
                System.out.println("Enter the length of a side...");
                double length = sc.nextDouble();
                if (length < 0.0) {
                    System.out.println("length must be non-negative");
                    continue;
                }
                return new Square(color, length);
            } else {
                System.out.println("shape name must be 'circle', 'rectangle', or 'square'");
                continue;
            }
        } while (true);

    }
    	
    /**
     * main
     */
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Create an array of Shape references larger than the maximum number
        // of Shapes to be read (could also prompt for size).
        Shape[] slist = new Shape[50];

        // Read shapes until null returned. Note that this code doesn't know what
        // specific type of Shape has been returned.
        System.out.println("Enter a list of shapes - 'done' to end");
        Shape sp;
        int numShapes = 0;
        while (null != (sp = getShape())) {
            slist[numShapes++] = sp;
        }

        // Print the list of shapes. Get the specific Shape's information using
        // dynamic binding to call the implementation of toString() defined for
        // the actual type of Shape referenced.
        System.out.println("\nThe list of shapes entered...");
        for (int n = 0; n < numShapes; ++n) {
            System.out.println("  " + slist[n].toString());
        }

        // Sort the list of shapes into ascending order by area. Get each
        // specific shape's area using dynamic binding to call the implementation
        // of area() defined for the the actual type of Shape referenced.
        System.out.println("\nSorting shapes into order by area...");

        // Pass slist and numShapes as parameters.
        sortArray(slist, numShapes);

        // Print the sorted list of shapes.
        System.out.println("\nThe sorted list of shapes...");
        for (int n = 0; n < numShapes; ++n) {
            System.out.println("  " + slist[n].toString());
        }
        
        // Keep console window alive until 'enter' pressed (if needed).
        System.out.println();
        System.out.println("Done - press enter key to end program");
        String junk = sc.nextLine();
    }
   	
/*  The sortArray method must implement the sort logic to sort the array of Shape references 
    into ascending order. 
    Start with the sortArray method from the ArraySort assignment, 
    changing the logic to call the area() method on the two shapes being compared 
    to get their respective areas.*/      
	public static void sortArray(Shape[] slist, int numShapes){
	Shape temp;
	for (int i = 0; i < numShapes - 1; i++) {	 
		for (int j = 1; j < numShapes - i; j++) {
			if (slist[j - 1].area() > slist[j].area()) {
				temp = slist[j - 1];
				slist[j - 1] = slist[j];
				slist[j] = temp;
			}
		}
	}
}

}
    
	



