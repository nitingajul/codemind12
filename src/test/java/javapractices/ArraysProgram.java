package javapractices;

public class ArraysProgram {

	public static void main(String[] args) {

		// sort given array in ascending order
		// {10,3,90,4,40,500,56} {3,4,10,40,56,90,500} {500,90,56,40,10,4,3}

		int numbers[] = { 10, 3, 90, 4, 40, 500, 56 };

		for (int i = 0; i < numbers.length; i++) {

			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] > numbers[j]) {
					int temp;
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}

			}

		}

		for (int k = 0; k < numbers.length; k++) {
			System.out.println(numbers[k]);
		}

		System.out.println("#############################################################");
		for (int i = 0; i < numbers.length; i++) {

			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] < numbers[j]) {
					int temp;
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}

			}

		}

		for (int k = 0; k < numbers.length; k++) {
			System.out.println(numbers[k]);
		}

		System.out.println("###############################################################");
		System.out.println("Largest element from array is = " + numbers[0]);
		System.out.println("Smallest element from array is = " + numbers[numbers.length - 1]);

		System.out.println("Second Largest element from array is = " + numbers[0 + 1]);
		System.out.println("Second Smallest element from array is = " + numbers[numbers.length - 2]);

		System.out.println("######################################################################");

		String s = "Welcome to codemind";

		// W=1, e=3, l=1,c=2....
		char a[] = s.toCharArray();
		String ss = "";

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			if (ss.contains(String.valueOf(a[i]))) {
				continue;
			}
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}

			}
			ss = ss + a[i];
			System.out.println("Count of " + a[i] + " is = " + count);
		}

		System.out.println("###############################################################");

		char c[] = { 'c', 'b', 'd', 'c', 'C', 'f', 'G', 'c', 'c' };
		// please find 'c' character count
		char cc = 'c';
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == cc) {
				count++;
			}
		}

		System.out.println("count of char 'c' = " + count);
	}

}
