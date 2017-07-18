import java.util.Scanner;
public class URLStringEncode {
	public static void main(String[] args)	{
		// create new scanner object for input, prompt user for input
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.println("Enter a line of text to be URL encoded");
		// create new string and capture input from user
		String myString = keyboardScanner.nextLine();
		// return user input 
		System.out.println ("The string read is: " + myString);
		// show number of characters in the line
		System.out.println ("Length in chars is: " + myString.length());
		// create an initialized String containing all of the chars that remain the same
		String remainsUnencoded = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_-.*";
		// Set the encoded output string to empty (NOT NULL)
		String encodedString = "";
		//  Loop through each character in the input string.	
		//	  Get the n'th character from the input string (use String's charAt method).
		// 	if (the character is a blank)
		//	    concatenate '+' to the encoded output string
		//	else if (the character remains unchanged)
		//	    concatenate the character to the encoded output string
		//	else
		//	    concatenate '%' and the hex encoded character value
		//	    to the encoded output string		
		for (int i=0; i< myString.length(); i++){
			if (myString.charAt(i) == ' ')
				encodedString +=  "+";
			else if (remainsUnencoded.indexOf(myString.charAt(i)) != -1)
				encodedString += (myString.charAt(i));
			else
				encodedString += ("%") + Integer.toHexString(myString.charAt(i));											  
			}
		// Print the encoded output string
		System.out.println(encodedString);
		System.out.println ("Length in chars is: " + encodedString.length());
		keyboardScanner.close();
}
}