package javapractices;

public class ArraysDeclarations {

	public static void main(String[] args) {

		int[] a;
		int[] b;
		int c[];
		int d[] = new int[5];

		int e[] = { 10, 20, 30, 40, 50 };

		e[1] = 200;

		System.out.print(e[0] + "\t");
		System.out.print(e[1] + "\t");
		System.out.print(e[2] + "\t");
		System.out.print(e[3] + "\t");
		System.out.print(e[4] + "\t");

		// System.out.println(e[6]);

		System.out.println();
		System.out.println("Length of array is = " + e.length);
		System.out.println("#########################################################");

		for (int i = 0; i <= e.length - 1; i++) {
			System.out.print(e[i] + "\t");
		}

		System.out.println();
		System.out.println("###############################################################");
		int f[][] = { { 10, 20, 30, 90 }, { 40, 50, 60 }, { 70, 80, 90 } };

		System.out.println(f[1][1]);
		f[0][2] = 300;
		System.out.println(f[0][2]);
		System.out.println("#################################################################");
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.print(f[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		System.out.println(f.length);
		System.out.println(f[0].length);
	}

}
