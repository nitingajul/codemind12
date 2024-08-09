package javapractices;

public class StringClassMethods2 {

	public static void main(String[] args) {

		String s = "Welcome to pune";

		// Compares two strings lexicographically, ignoring case differences
		System.out.println(s.compareToIgnoreCase("WELCOME to Pune"));

		// Compares this string to the specified object. The result is true if and only
		// if the argument is not
		// null and is a String object that represents the same sequence of characters
		// as thisobject.
		System.out.println(s.equals("Welcome to pune"));

		// Compares this String to another String, ignoring caseconsiderations.
		// Two strings are considered equal ignoring case if theyare of the
		// same length and corresponding Unicode code points in the twostrings are equal
		// ignoring case.
		System.out.println(s.equalsIgnoreCase("WelcoMe to PuNe"));

		System.out.println(s.hashCode());

		// Returns the index within this string of the first occurrence ofthe specified
		// character.
		System.out.println(s.indexOf('e'));

		System.out.println(s.indexOf("pune"));

		System.out.println(s.indexOf('e', 7));

		String ss = "Welcome to codemind pune";

		System.out.println(ss.indexOf("co", 6));

		System.out.println(ss.lastIndexOf('e'));

		System.out.println(ss.lastIndexOf("co"));

		System.out.println(ss.lastIndexOf('e', 7));

		System.out.println(ss.lastIndexOf("co", 7));

		// Returns true if the string is empty or contains only white space
		// codepoints,otherwise false.
		System.out.println(ss.isBlank());

		String sss = "  ";
		System.out.println(sss.isBlank());

		// Returns true if, and only if, length() is 0.
		System.out.println(ss.isEmpty());

		System.out.println("".isEmpty());

		// Returns the length of this string.
		System.out.println(ss.length());
		
		

	}

}
