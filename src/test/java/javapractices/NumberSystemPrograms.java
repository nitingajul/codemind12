package javapractices;

public class NumberSystemPrograms {

	public static void main(String[] args) {

		// 2*1 ,2*2,2*3
		// 3*1......

		for (int i = 2; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
			}

			System.out.println();

		}

		System.out.println("#################################################################################");

		int num = 2;
		while (num <= 10) {
			int num2 = 1;
			while (num2 <= 10) {

				System.out.print(num * num2 + "\t");
				num2++;
			}
			num++;
			System.out.print("\n");
		}

		System.out.println("################################################################################");
		int num1 = 0, num2 = 1;
		System.out.print(num1 + "\t" + num2 + "\t");

		for (int i = 1; i <= 8; i++) {

			int num3 = num1 + num2;
			System.out.print(num3 + "\t");

			num1 = num2;
			num2 = num3;

		}

		System.out.println();
		System.out.println("###################################################################################");

		int number = 17;
		boolean prime = true;

		for (int i = 2; i < number / 2; i++) {

			if (number % i == 0) {
				prime = false;
				break;
			}

		}

		if (prime) {
			System.out.println("Number is prime = " + number);
		} else {
			System.out.println("Number is not prime = " + number);
		}
		System.out.println("########################################################################################");
		// 1234321 == 1234321 121==121 454==454

		int number_4 = 1234321;
		int copy_of_number_4 = number_4;
		int reminder;
		int add = 0;

		while (number_4 > 0) {
			// getting reminder or last digit from given number
			reminder = number_4 % 10;// 1, 2, 1

			//
			add = (add * 10) + reminder;// 1, 12,121

			//
			number_4 = number_4 / 10;// 12, 1, 0

		}

		if (copy_of_number_4 == add) {
			System.out.println("Given number " + copy_of_number_4 + " is palendrom number");
		} else {
			System.out.println("Given number " + copy_of_number_4 + " is not palendrom number");
		}

		System.out.println("##################################################################################");
		// 123 = 1*1*1+2*2*2+3*3*3=
		// 153 1+125+27=153

		int number_5 = 153;
		int copy_of_number_5 = number_5;
		int sum = 0;
		int rem;

		while (number_5 > 0) {

			rem = number_5 % 10;
			sum = sum + (rem * rem * rem);
			number_5 = number_5 / 10;

		}

		if (sum == copy_of_number_5) {
			System.out.println("Given number is armstrong number");
		} else {
			System.out.println("Given number is not armstrong number");
		}

	}

}
