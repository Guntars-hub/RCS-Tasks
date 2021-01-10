import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		try (// Task 2
		Scanner scan = new Scanner(System.in)) {
		System.out.println("Trīs skaitļu vidējais skaitlis!");
		
		System.out.println("Ievadiet pirmo skaitli: ");
				int x = scan.nextInt();
		
		System.out.println("Ievadiet otro skaitli: ");
				int y = scan.nextInt();
		
		System.out.println("Ievadiet trešo skaitli: ");		
				int z = scan.nextInt();
				
				int avg = (x + y + z) / 3;
				
				System.out.println("Skaitļu vidējais skaitlis ir " + avg + ".");
		}
	}

}
