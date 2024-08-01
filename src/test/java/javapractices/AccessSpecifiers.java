package javapractices;

public class AccessSpecifiers {

	public int a = 10;
	private int b = 20;

	int c = 40;
	protected int d = 40;

	public void add() {
		System.out.println(a + a);
		System.out.println(b + b);
		System.out.println(c + 10);
		System.out.println(d);
	}

}

