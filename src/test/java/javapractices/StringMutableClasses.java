package javapractices;

public class StringMutableClasses {

	public static void main(String[] args) {

		String s = "Welcome to codemind";

		s.concat(" pune");

		System.out.println(s);
		System.out.println("############################");

//		StringBuffer stringBuffer = new StringBuffer("Welcome codemind technology");
//		stringBuffer.append(" to pune");
//		System.out.println(stringBuffer);
//		stringBuffer.reverse()
//		System.out.println(stringBuffer);

		System.out.println("#############################");

		StringBuilder stringBuilder = new StringBuilder("Welcome codemind technology");
		stringBuilder.append(" to pune");
		System.out.println(stringBuilder);
		stringBuilder.reverse();
		System.out.println(stringBuilder);

	}

}
