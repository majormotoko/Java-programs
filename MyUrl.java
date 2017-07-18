
public class MyUrl {
/*private String instance variable representing the URL*/
	private static String mUrl = "";
	private int numArgs = 0;
/*	 
	 - this constructor initializes the base URL to the url parameter value. 
	 It adds the protocol prefix http:// on the front if not present in the url parameter.. 
	 For example, if the parameter is www.amazon.com, it sets the mUrl instance variable to http://www.amazon.com  
	 Note that a constructor has no return type, not even 'void'. */
	public MyUrl (String url){
		String http = ("http://");
        if (url.startsWith(http) == true)
            mUrl = url;
        else
		mUrl = http + url;
	}
	
/*	
	 this overloaded method adds a string argument to the URL of the form name=value.  
	 It URL encodes both the name and value parameters by calling the urlEncode() method on each.*/
	public void addArgument(String name, String value){
		mUrl +=  urlEncode(name) + "=" + urlEncode(value);
		numArgs++;
	}
	
/*	 
	this overloaded method adds an int argument to the URL of the form name=value. 
	It URL encodes the name parameter by calling urlEncode().. 
	The value is the string representation of the ivalue parameter. 
	Use Integer.toString(ivalue) to convert the integer to a string representation.*/
	public void addArgument(String name, int ivalue){
		mUrl += urlEncode(name) + "=" + urlEncode(Integer.toString(ivalue));
		numArgs++;
	}
	
/*	 
	this overloaded method adds a double argument to the URL of the form name=value. 
	It URL encodes the name parameter by calling urlEncode().. 
	The value is the string representation of the dvalue parameter. 
	Use Double.toString(dvalue) to convert the double to a string representation.*/
	public void addArgument(String name, double dvalue){
		mUrl += urlEncode(name) + "=" + urlEncode(Double.toString(dvalue));
		numArgs++;
	}
	
/*	- this method returns the object's URL value (the base URL plus all arguments).
*/
	public String toString(){
/*		if (numArgs == 0)
			mUrl += "?";
		else if (numArgs >= 1)
			mUrl += "&";*/	
		return mUrl;
	}

/*	 
	this static method URL encodes its parameter String and returns the URL encoded value as the result. 
	It is called by the addArgument methods to encode their name and value parameters before appending them to the object's URL. 
	Use your earlier project code to implement this method - 
	instead of reading a line of text, the parameter string contains the text to be URL encoded, 
	and instead of printing the encoded string, it is returned as the method result. */
	public static String urlEncode(String text){
		String remainsUnencoded = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_-.*";
		for (int i=0; i < text.length(); i++){
			if (text.charAt(i) == ' ')
				mUrl +=  "+";
			else if (remainsUnencoded.indexOf(text.charAt(i)) != -1)
				mUrl += (text.charAt(i));
			else
				mUrl += ("%") + Integer.toHexString(text.charAt(i));											  
			}
		return mUrl;		
	}

}

/*Sample Output

Enter URL site (or 'exit')...
www.amazon.com
Url value read was: www.amazon.com
Enter URL argument name (or 'done')...
id
Enter type of argument value (string, integer, double)...
integer
Enter an integer value
123
Enter URL argument name (or 'done')...
author
Enter type of argument value (string, integer, double)...
string
Enter a string value
Jim Campbell
Enter URL argument name (or 'done')...
publisher
Enter type of argument value (string, integer, double)...
string
Enter a string value
O'Reilly
Enter URL argument name (or 'done')...
done
URL with appended arguments is:
  http://www.amazon.com?id=123&author=Jim+Campbell&publisher=O%27Reilly

Enter URL site (or 'exit')...
exit*/