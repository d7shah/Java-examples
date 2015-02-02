import java.util.Scanner;


public class IntCalc {

	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		System.out.println("Please enter the initial amount of money");
		double PrincipalAmount = bucky.nextDouble();
		System.out.println("Please enter the final amount of money");
		double FinalAmount = bucky.nextDouble();
		System.out.println("Please enter the time in years");
		double Time = bucky.nextDouble();
		
		double InterestRate = ((FinalAmount/PrincipalAmount) - 1)/ Time;
		System.out.println("Your interest rate is: " + InterestRate + "%");


		

		

		

		

		


	}

}
