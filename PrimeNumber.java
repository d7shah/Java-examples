import java.util.Scanner;

public class PrimeNumber {
	public static void main(int num) {
		Scanner check = new Scanner (System.in);
		System.out.println("Enter the number: ");
		
		int input = check.nextInt();
		
		boolean prime = true;
		for (int i = 2; i < input; i++){
			if (input % i == 0){
				prime = false;
				
			}
		}
		
		if (prime == false){
			System.out.println(input + "is not prime");
		}
		else if (prime == true){
			System.out.println(input + "is prime");
		}
	}
}