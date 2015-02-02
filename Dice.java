import java.util.Scanner;


public class Dice {

	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		System.out.println("Please enter d1");
		int d1 = bucky.nextInt();
		System.out.println("Please enter d2");
		int d2 = bucky.nextInt();
		if ((d1==4 && d2==4) || (d1==2 && d2==6) || (d1==6 && d2==2) || (d1==5 && d2==3) || (d1==3 && d2==5)) {
			System.out.println("Probability is 5/36");
		}
			else System.out.println("Probability is 31/36");


		
		}
		
		
	}


