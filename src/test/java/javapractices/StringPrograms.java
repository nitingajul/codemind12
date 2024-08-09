package javapractices;

public class StringPrograms {

	public static void main(String[] args) {

		// Reverse given String
		// e.g Welcome to pune enup ot emocleW
		String s = "Welcome to pune";
		System.out.println("Number of chars = " + s.length());
		System.out.println("Number of chars without spaces = " + s.replaceAll("[ ]", "").length());
		String ss = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			// System.out.print(s.charAt(i));
			ss = ss + s.charAt(i);
		}
		System.out.println(ss);

		System.out.println("#########################");
		String s1 = "dad";
		String ss2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			ss2 = ss2 + s1.charAt(i);
		}
		if (s1.equals(ss2)) {
			System.out.println(ss2 + "\n" + "Given String is palendrom " + s1);
		} else {
			System.out.println(ss2 + "\n" + "Given String is not palendrom " + s1);
		}

		System.out.println("#####################################");
		String array[] = s.split(" ");
		System.out.println("Number of words in given String =" + array.length);

		System.out.println("#######################################");
		// reverse given words from String
		// Welcome to pune emocleW ot enup
		String a[] = s.split(" ");

		for (int i = 0; i < a.length; i++) {
			String ss3 = a[i];
			for (int j = ss3.length() - 1; j >= 0; j--) {
				System.out.print(ss3.charAt(j));
			}
			System.out.print(" ");
		}

		System.out.println("###########################################");
		// Welcome to pune e=3
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("count of e = " + count);

		System.out.println("##########################################");
		// Welcome to pune Welcome To Pune

		for (int i = 0; i < s.length(); i++) {

			if (i == 0 && Character.isLowerCase(s.charAt(i))) {
				System.out.print(Character.toUpperCase(s.charAt(i)));
				continue;
			}

			if (i != 0 && s.charAt(i - 1) == ' ') {
				System.out.print(Character.toUpperCase(s.charAt(i)));
			} else {
				System.out.print(s.charAt(i));
			}

		}

		System.out.println("##############################################");
		String g = "Welcome to goa state to enjoy";
		String aaaa[] = g.split(" ");
		for (int i = 0; i < aaaa.length; i++) {
			String sst = "";
			sst = aaaa[i].substring(0, 1).toUpperCase() + aaaa[i].substring(1, aaaa[i].length());
			System.out.print(sst + " ");
		}
	}

}
