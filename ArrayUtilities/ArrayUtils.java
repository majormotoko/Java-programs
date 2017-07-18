
public class ArrayUtils {

	/*
	 * - this static method searches its parameter array to locate the minimum
	 * value, and returns it. This method must implement the following behavior:
	 * If the array parameter is null, it must throw a BadArrayException with
	 * the message "Array is null". If the array parameter is length 0, it must
	 * throw a BadArrayException with the message "Array is empty" It must not
	 * alter the array parameter contents, nor copy the entire array parameter
	 * contents to another array. To find the minimum value, it must search
	 * through the array parameter once. It cannot use sorting to find the
	 * minimum value in the array. The array may contain any negative, 0, and/or
	 * positive values. It doesn't read or print anything. Note that this method
	 * does not catch the BadArrayException it throws. When it throws a
	 * BadArrayException (due to a null or empty array parameter), the exception
	 * is thrown back to the calling code to handle. This is the most common
	 * technique for throwing/catching exceptions - a called method throws an
	 * exception back to the client code calling it to indicate an exception
	 * condition, and the client code must handle the exception condition
	 * appropriately (in it's catch block). This implies that calls to this
	 * method must be enclosed in a try/catch block that includes a
	 * catch(BadArrayException) block. The following methods have the same
	 * exception handling behavior.
	 */
	public static int minValue(int[] list) throws BadArrayException {
		if (list == null) {
			throw new BadArrayException("Array is null");
		}
		if (list.length == 0) {
			throw new BadArrayException("Array is empty");
		}
		{
			int minValue = list[0];
			for (int i = 0; i < list.length; i++) {
				if (list[i] < minValue) {
					minValue = list[i];
				}
			}
			return minValue;
		}
	}

	/*
	 * - this static method copies the specified range of elements from the parameter array
	 * into a new array, and returns it. The initial index of the range
	 * (startIndex) must lie between 0 and list.length, inclusive. The value at
	 * list[startIndex] is placed into the initial element of the new array
	 * (unless startIndex == list.length). Values from subsequent elements in
	 * the parameter array are placed into subsequent elements in the new array.
	 * The length of the returned array will be list.length - startIndex. If the
	 * array parameter is null, it must throw a BadArrayException with the
	 * message "Array is null". If the startIndex parameter is less than 0 or
	 * greater than list.length, it must throw an ArrayIndexOutOfBoundsException
	 * with startIndex as the exception object parameter (see the Java API). It
	 * must not alter the array parameter contents. It doesn't read or print
	 * anything
	 */
	public static int[] copyRange(int[] list, int startIndex) throws BadArrayException 
		{
		if (list == null) {
			throw new BadArrayException("Array is null");
		}
		if (startIndex < 0 || startIndex > list.length){
			throw new ArrayIndexOutOfBoundsException(startIndex);
		}
		int[] arr2 = new int[list.length - startIndex];
		System.arraycopy(list, startIndex, arr2, 0, (list.length - startIndex));
		return arr2;		
	}
	
	/*
	 * public static int indexOf(int[] list, int searchValue) - this static
	 * method searches its parameter array to locate the first occurrence of the
	 * parameter searchValue, and returns its index position if found, or -1 if
	 * not found. This method must implement the following behavior: If the
	 * array parameter is null, it must throw a BadArrayException with the
	 * message "Array is null". If the array parameter is length 0, it must
	 * return -1. It must not alter the array parameter contents, nor copy the
	 * entire array parameter contents to another array. To find the first
	 * occurrence, it must search through the array parameter once. It doesn't
	 * read or print anything.
	 */
	public static int indexOf(int[] list, int searchValue) throws BadArrayException {
		if (list == null) {
			throw new BadArrayException("Array is null");
		}
		{
			int index = -1;
			for (int i = 0; (i < list.length) && (index == -1); i++) {
				if (list[i] == searchValue) {
					index = i;
				}
			}
			return index;
		}
	}

	/*
	 * - this static method searches its parameter array to locate the last
	 * occurrence of the parameter searchValue, and returns its index position
	 * if found, or -1 if not found. This method must implement the following
	 * behavior: If the array parameter is null, it must throw a
	 * BadArrayException with the message "Array is null". If the array
	 * parameter is length 0, it must return -1. It must not alter the array
	 * parameter contents, nor copy the entire array parameter contents to
	 * another array. To find the last occurrence, it must search through the
	 * array parameter once. It doesn't read or print anything.
	 */

	public static int lastIndexOf(int[] list, int searchValue) throws BadArrayException {
		if (list == null) {
			throw new BadArrayException("Array is null");
		}
		/** Set n as last index in array. */
		int n = list.length - 1;
		/** Iterate array in reverse way. */
		for (int i = n; i >= 0; i--) {
			/** If searchValue found then return index */
			if (list[i] == searchValue) {
				return i;
			}
		}
		/** Element not found return -1. */
		return -1;
	}
}
