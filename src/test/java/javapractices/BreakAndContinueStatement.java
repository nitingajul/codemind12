package javapractices;

public class BreakAndContinueStatement {

	public static void main(String[] args) {

		// 1-100 number

		int number = 1;
		while (true) {
			System.out.println(number);
			number++;
			if (number > 100) {
				break;
			}
		}

		System.out.println("End of code");
		System.out.println("################################################################");

		// wanted to print only number which are completely divisible by 3
		for (int i = 1; i <= 20; i++) {

			if (i % 3 != 0) {
				continue;
			}
			System.out.println("Number divisible by 3 is =" + i);
		}

		System.out.println("#######################################################################");
		System.out.println("Wanted to print 1-100 number but doesnt wanted to print 51-60 numbers");
		for (int i = 1; i <= 100; i++) {

			if (i >= 51 && i <= 60) {
				continue;
			}

			System.out.println(i);
		}

	}

}
