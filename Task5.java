import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// Task 5 
		try (
		Scanner scan = new Scanner(System.in)) {
		  System.out.println("Ievadiet skaitli, lai noskaidrotu vai tas ir 50...100 robežās : ");
			int x =  scan.nextInt();
			
			if (x >= 50 && x <= 100) {
				System.out.println("Šis skaitlis ir robežās.");
			} else {
				System.out.println("Šis skaitlis nav robežās.");
			}
		}
		

	}

}
