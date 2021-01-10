import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Task 1
		try (
			Scanner scan = new Scanner(System.in)) {
				System.out.println("Ievadiet divus skaitļus: ");
				int numberOne = scan.nextInt();
				int numberTwo = scan.nextInt();
				int sum = numberOne + numberTwo;
				
				System.out.println("Skaitļu summa ir " + sum + ".");
			}
	}

}
