package javapractices;

public class LoopStatements {

	public static void main(String[] args) {

		// I wanted to print 1-10 numbers

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			// initialization: i=1
			// condition: 1 <=10 true
			// enter inside body of loop and execute code: 1
			// increment/decrement: 1++ i=2

			// initialization: i=2
			// condition: 2<=10 true
			// enter inside body of loop and execute code: 2
			// increment/decrement: 1++ i=3

			// initialization: i=3
			// condition: 3<=10 true
			// enter inside body of loop and execute code: 3
			// increment/decrement: 1++ i=4

			// ..
			// initialization: i=10
			// condition: 10<=10 true
			// enter inside body of loop and execute code: 10
			// increment/decrement: 1++ i=11

			// initialization: i=11
			// condition: 11<=10 false
			// out of loop
		}

		System.out.println("############################################################");

		// 1-10 numbers
		int number = 1;
		while (number <= 10) {
			System.out.println(number);
			number++;
		}

		System.out.println("#######################################################");

		int digit = 10;
		while (digit >= 1) {
			System.out.println(digit);
			digit--;
		}

		System.out.println("#######################################################");

		int number_1 = 1;

		do {
			System.out.println(number_1);
			number_1++;
		} while (number_1 <= 100);

		System.out.println("########################################################");
		int number_2 = 100;
		do {
			System.out.println(number_2);
			number_2--;
		} while (number_2 >= 1);

	}

}
