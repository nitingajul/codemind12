package javapractices;

public class StringClassMethods {

	public static void main(String[] args) {

		String s = "Welcome to codemind";

		/*
		 * Returns the char value at the specified index. An index ranges from 0 to
		 * length() - 1. The first char value of the sequenceis at index 0, the next at
		 * index 1,and so on, as for array indexing.
		 */
		char c = s.charAt(8);
		System.out.println(c);
		System.out.println(s.charAt(18));

		// Concatenates the specified string to the end of this string.
		String ss = s.concat(" pune");
		System.out.println(ss);

		/*
		 * Returns true if and only if this string contains the specifiedsequence of
		 * char values.
		 */
		System.out.println(s.contains("Welcome"));

		// Tests if this string ends with the specified suffix.
		System.out.println(s.endsWith(" to codemind"));

		// Compares two strings lexicographically.
		System.out.println(s.compareTo("WElcome to codemind"));

	}

}
