package javapractices;

public class ControlStatement {

	public static void main(String[] args) {

		int number = 21;

		if (number >= 0) {
			System.out.println("number is positive = " + number);
		}

		if (number < 0) {
			System.out.println("number is negetive = " + number);
		}

		System.out.println("#####################################");

		if (number % 2 != 0) {
			System.out.println("Given number is odd = " + number);

		} else {
			System.out.println("Given number is even = " + number);
		}

		System.out.println("#####################################");

		float marks = 20;

		if (marks >= 35 && marks <= 50) {
			System.out.println("Your eligible for arts stream");
		} else if (marks > 50 && marks <= 65) {
			System.out.println("Your eligible for commerce stream");
		} else if (marks > 65 && marks <= 75) {
			System.out.println("Your eligible for science stream");
		} else if (marks > 75) {
			System.out.println("Your eligible for computer stream");
		} else {
			System.out.println("Sorry!! your not eligible for any stream, Please repeat 10th");
		}

		System.out.println("#######################################################");

		int accountBalnce = 6000;
		final int PIN = 1234;
		int availbleCurrenciesInMachine = 500;
		int withdrawAmount = 2000;

		if (PIN == 1234) {
			if (withdrawAmount < accountBalnce) {
				if (availbleCurrenciesInMachine == 100) {
					accountBalnce = accountBalnce - withdrawAmount;
					System.out.println(accountBalnce);
				} else {
					System.out.println("Mentioned currencies are not avalble in ATM");
				}
			} else {
				System.out.println("Account balance insufficient");
			}

		} else {
			System.out.println("Wrong pin");
		}

		System.out.println("#################################################");

		String color = "yellow";

		switch (color) {
		case "white":
			System.out.println("color is white");
			break;

		case "red":
			System.out.println("color is red");
			break;

		case "green":
			System.out.println("color is green");
			break;

		case "yellow":
			System.out.println("color is yellow");
			break;

		case "blue":
			System.out.println("color is blue");
			break;

		default:
			System.out.println("Sorry color is invalid");
			break;
		}

		System.out.println("##############################");

		int age = 17;
		switch (age) {
		case 65:
			System.out.println("Senior");
			break;
		case 18:
			System.out.println("yuva");
			break;
		default:
			System.out.println("Invalid age");
			break;
		}
	}

}
