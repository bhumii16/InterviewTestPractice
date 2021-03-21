package javaPrograms;

// ** Replace all spaces in URL (character array) with '%20', should be done in-place.**
public class URLify {

	/*
	 * public static void main(String[] args) { encodeURL(); }
	 * 
	 * public static void encodeURL() { String url = "https://example.com/ a";
	 * char[] arr = url.toCharArray();
	 * 
	 * String newURL = ""; for (int i = 0; i < arr.length; i++) {
	 * System.out.println(arr[i]);
	 * 
	 * if (arr[i] == ' ') { newURL += "%20"; } else { newURL += arr[i]; } }
	 * 
	 * System.out.println("New URL = " + newURL); }
	 */

	static int MAX = 1000;

	static char[] replaceSpaces(char[] str) {

		// count spaces and find current length
		int space_count = 0, i = 0;
		for (i = 0; i < str.length; i++)
			if (str[i] == ' ')
				space_count++; 

		// count spaces and find current length
		while (str[i - 1] == ' ') {
			space_count--;
			i--;
		}

		// Find new length.
		int new_length = i + space_count * 2;

		// New length must be smaller than length
		// of string provided.
		if (new_length > MAX)
			return str;

		// Start filling character from end
		int index = new_length - 1;

		char[] old_str = str;
		str = new char[new_length];

		// Fill rest of the string from end
		for (int j = i - 1; j >= 0; j--) {

			// inserts %20 in place of space
			if (old_str[j] == ' ') {
				str[index] = '0';
				str[index - 1] = '2';
				str[index - 2] = '%';
				index = index - 3;
			}

			else {
				str[index] = old_str[j];
				index--;
			}
		}
		return str;
	}

	// Driver Code
	public static void main(String[] args) {
		char[] str = "Mr John Smith ".toCharArray();

		// Prints the replaced string
		str = replaceSpaces(str);

		for (int i = 0; i < str.length; i++)
			System.out.print(str[i]);
	}
}
