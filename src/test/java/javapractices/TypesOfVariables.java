package javapractices;

class Variables {

	// instance member variables
	int a = 10;
	public float c = 20.3f;

	// static member variable
	public static int d = 30;

	// final variables
	public final int E = 40;
	static final int MOB_NO = 122334440;

	public void test() {
		final int f = 10 + 20;
		System.out.println(f);
	}

	public void add() {

		int dd = a + d;
		System.out.println(dd);
	}

}

public class TypesOfVariables {

	public static void main(String[] args) {

		System.out.println(Variables.MOB_NO);
		Variables variables = new Variables();
		System.out.println(variables.a);
		variables.add();
		variables.test();

	}

}
