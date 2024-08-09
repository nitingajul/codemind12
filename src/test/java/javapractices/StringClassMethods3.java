package javapractices;

public class StringClassMethods3 {

	public static void main(String[] args) {

		String s = "Welcome to $codemind technology pune$";

		// Returns a string resulting from replacing all occurrences of oldChar in this
		// string with newChar.
		System.out.println(s.replace('e', 'E'));

		System.out.println(s.replace("$", ""));

		System.out.println(s.replace("co", "@@@@@@@"));

		System.out.println(s.replace('$', '@'));

		// Replaces each substring of this string that matches the given regular
		// expression with the given replacement.
		String ss = "WfedfgfgAsjmJ21321$%%^%232@#$DFFGFs";

		// Remove only special characters
		System.out.println(ss.replaceAll("[$%^@#]", ""));

		// Retain only numbers(remove all things and keep numbers only)
		System.out.println(ss.replaceAll("[^0-9]", ""));

		// Retain only small and capital letters
		System.out.println(ss.replaceAll("[^a-zA-Z]", ""));

		// Retain only small and capital letters
		System.out.println(ss.replaceAll("[^a-zA-Z0-9]", ""));

		// retain special characters
		System.out.println(ss.replaceAll("[a-zA-Z0-9]", ""));
		System.out.println(ss.replaceAll("[^$%^@#]", ""));

		String sss = "$1268";
		// Replaces the first substring of this string that matches the given regular
		// expression with the given replacement.
		System.out.println(sss.replaceFirst("[$]", ""));

		System.out.println("#######################################");
		String str = "₹1,399 M.R.P: ₹2,099 (33% off)";
		// Splits this string around matches of the given regular expression.
		String[] arr = str.split("[ ]");

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == 2) {
				System.out.println(arr[i]);
				// System.out.println(arr[i].replaceAll("[₹,]", ""));
			}
		}

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		String stt = "Welcome to pune";
		// W lcom to pun
		String array[] = stt.split("e");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		// Tests if this string starts with the specified prefix.
		System.out.println(stt.startsWith("Welcome"));

		// Returns a string that is a substring of this string. Thesubstring begins with
		// the character at the specified index and extends to the end of this string.
		System.out.println(stt.substring(11));

		// Returns a string that is a substring of this string. The substring begins at
		// the specified beginIndex and extends to the character at index end Index -
		// 1.Thus the length of the substring is endIndex-beginIndex.
		System.out.println(stt.substring(3, 7));

		System.out.println(stt.toUpperCase());
		System.out.println(stt.toLowerCase());

		// Returns a string whose value is this string, with all leading and trailing
		// space removed
		String str2 = "   Welcome to codemind       ";
		System.out.println(str2);
		System.out.println(str2.trim());

		String ssss = String.valueOf(10.36);
		System.out.println(ssss.getClass());
		System.out.println(ssss.length());

		boolean b = true;
		String booleanToString = String.valueOf(b);
		System.out.println(booleanToString.charAt(1));

	}

}
