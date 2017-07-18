import java.util.Scanner;
public class ArraySort {
	public static void main(String[] args){
/*		Create new scanner object for input
		Prompts for the size of the array to be created 
		(limit it to between 3 and 10).
		Creates a Scanner to read the int value for the array size, 
		reads it, and verifies it is within the correct range.*/
		Scanner sc = new Scanner(System.in);
		int arraySize;
		System.out.println("Enter the size of the array (3 to 10):");
		int next = sc.nextInt();
		do {		
		if (next < 3 || next > 10)
			{
			System.out.println("You entered " + next);
			System.out.println("Please enter a number from (3 to 10):");
			next = sc.nextInt();
			}
		}
		while (next < 3 || next > 10); 
			System.out.println("Size of array is " + next);
			arraySize = next;
	

/*		Dynamically creates a local integer array of the requested size.*/		
		int[] myArray = new int[arraySize];
			
/*		Calls the fillArray method to read values into the array (passing its local array as the parameter)*/
		fillArray(myArray);
			
		System.out.println("The unsorted values..");
/*		Calls the printArray method to print the unsorted values  (passing its local array as the parameter)*/
		printArray(myArray);
				
/*		Calls the sortArray method to sort the array values into ascending order  (passing its local array as the parameter)*/
		sortArray(myArray);
		
		System.out.println("The sorted values..");
/*		Calls the printArray method to print the sorted values  (passing its local array as the parameter)*/
		printArray(myArray);
		
       System.out.println("Done - press enter key to end program");
       sc.close();	
}		
		
/*	this method fills the parameter array with values. 
	It creates a local Scanner object, loops once for each array element, 
	prompts for a value, reads an integer value using the Scanner, 
	and assigns it to the array element.*/
	public static void fillArray(int[] array){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter " + array.length + " values");
		for (int n=0; n  < array.length; ++n) {			
			System.out.println("Enter value for element " + n + ":");
			array[n] = scan.nextInt();
		}
		scan.close();
	}
	
/*	this method prints all the values in the parameter array*/
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++){
		System.out.println(array[i]);
		}
	}
	
/*	this method sorts the values in the parameter array into ascending order. 
	You must write the Java code to do the actual sorting of the array values (see example logic below).*/
	public static void sortArray(int[] array){
			int temp;
			for (int i = 0; i < array.length - 1; i++) {
	 
				for (int j = 1; j < array.length - i; j++) {
					if (array[j - 1] > array[j]) {
						temp = array[j - 1];
						array[j - 1] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		
	}
/*Sample Output

Enter the size of the array (3 to 10):
3
Enter 3 values
Enter value for element 0:
15
Enter value for element 1:
10
Enter value for element 2:
5

The unsorted values...
15
10
5

The sorted values...
5
10
15

Done - press enter key to end program*/