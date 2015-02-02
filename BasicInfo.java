import java.util.Scanner;


public class BasicInfo {

	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = bucky.nextLine();
		System.out.println("Please enter your email address");
		String email = bucky.nextLine();
		System.out.println("Please enter your telephone number");
		String num = bucky.nextLine();
		System.out.println("Your name is " + name + "." + " Your telephone number is " + num + "." + " Your email address is " + email + ".");





	}

}
