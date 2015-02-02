import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {
		Scanner vader = new Scanner(System.in);
		int number = vader.nextInt();
		int counter = number - 1;
		while(counter>1){
			if (number % counter == 0){
				System.out.println("Your number is not a prime number!");
				break;
			}
			
			else if (counter == 2){
				System.out.println("Your number is a prime number!");
				
			}
		
			counter--;
		}
				
	}
}



