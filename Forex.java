import java.util.Scanner;


public class Forex {

	public static void main(String[] args) {
	
		Scanner bucky = new Scanner(System.in);
		System.out.println("Please enter the currency you would like to convert to Ksh");
		String Currency = bucky.nextLine();
		System.out.println("What is the amount of " + Currency + " would you like to exchange?");
		double amount = bucky.nextDouble();
		double amountinksh;
		if(Currency == "US Dollars"){
			amountinksh = amount*92;
			System.out.println("You will receive " + amountinksh + "Ksh");
			
		}
		
		else if(Currency == "British Pound"){
			amountinksh = amount*120;
			System.out.println("You will receive " + amountinksh + "Ksh");
		}
		else if(Currency == "Japanese Yen"){
			amountinksh = amount*4;
			System.out.println("You will receive " + amountinksh + "Ksh");

		}
		else if(Currency == "Uganda Shillings"){
			amountinksh = amount/20;
			System.out.println("You will receive " + amountinksh + "Ksh");

		}
		else if(Currency == "Uganda Shillings"){
			amountinksh = amount/30;
			System.out.println("You will receive " + amountinksh + "Ksh");

		}

	}
}
		
		
		
		
	


