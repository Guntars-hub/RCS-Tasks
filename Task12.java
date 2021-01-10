import java.util.Random;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// Task12
		System.out.println("Try to guess number between 1...10: ");
		Scanner scan = new Scanner(System.in);
		int guess = scan.nextInt();
		
		if (guess > 10 || guess < 1) {
			System.err.println("Between 1 and 10");
			System.exit(0);
		}
		
		int number = new Random().nextInt(11);
		for (int i = 1; i <= number; i++) {
			if (guess == number) {
				System.out.println("You guessed it, it was " + number + ".");
				break;
			} else {
				System.out.println("Nope, try again!");
				guess = scan.nextInt();
				continue;
			}
		}
		scan.close();
	}

}
