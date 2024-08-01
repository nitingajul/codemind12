package javapractices;

public class LogicalOperatorsInJava {

	public static void main(String[] args) {

		int a = 10, b = 20, c = 30;

		System.out.println(a < b && c > b);

		System.out.println(a < b && b > c);

		System.out.println(a > b && b < c);

		System.out.println(a > b && b > c);

		System.out.println("#################################################");

		System.out.println(a < b || c > b);

		System.out.println(a < b || b > c);

		System.out.println(a > b || b < c);

		System.out.println(a > b || b > c);
		System.out.println("######################################################");

		System.out.println(!(a > b || b > c));

		System.out.println(a > b || !(b > c));

	}

}
