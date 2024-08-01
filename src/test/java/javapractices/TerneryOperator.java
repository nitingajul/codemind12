package javapractices;

public class TerneryOperator {

	public static void main(String[] args) {

		TerneryOperator terneryOperator = new TerneryOperator();

		System.out.println("Eligible for voting = " + terneryOperator.eligibleForVoting(19, "india"));

		System.out.println("Eligible for voting = " + terneryOperator.eligibleForVoting(17, "india"));

		System.out.println("Eligible for voting = " + terneryOperator.eligibleForVoting(19, "us"));

	}

	public boolean eligibleForVoting(float age, String country) {

		boolean eligibleForVotting;

		eligibleForVotting = age >= 18 && country.equals("india") ? true : false;

		return eligibleForVotting;
	}

}
