package javapractices;

public class CreatingString {

	public static void main(String[] args) {

		// Create String by using String literal
		String s = "Welcome to codemind";
		String s1 = "123312DFGerfr$%%$df";

		System.out.println(s);

		// Create String by using new keyword
		String s2 = new String("Welcome to pune");
		char a[] = { 'j', 'a', 'v', 'a' };
		String s3 = new String(a);

		System.out.println(s3);

		System.out.println("##################################");
		System.out.println(s);
		System.out.println(s.concat(" technology pune."));
		System.out.println(s);

	}

}
