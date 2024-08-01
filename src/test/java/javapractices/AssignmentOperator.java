package javapractices;

public class AssignmentOperator {

	public static void main(String[] args) {

		int a = 100;

		System.out.println(a);

		// a = a + 200;

		a += 200; // a=a+200
		System.out.println(a);

		a -= 100;// a=a-100
		System.out.println(a);

		a *= 2;// a=a*2
		System.out.println(a);

		a /= 4; // a=a/4
		System.out.println(a);

		int d;
		int e = 30, f = 40;

		d = e < f ? e : f;

		System.out.println(d);

	}

}
