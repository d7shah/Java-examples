import java.util.Scanner;

public class Speed {
	
	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		double distance, time, speed;
		System.out.println("Please enter the distance in km");
		distance = bucky.nextDouble();
		System.out.println("Please enter the time in hours");
		time = bucky.nextDouble();
		speed = distance/time;
		System.out.println("Your speed is: " + speed + " km/h");

	
	}
}

