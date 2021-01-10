import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Task 3
		try (
		Scanner scan = new Scanner(System.in)) {
		
		System.out.println("Ievadiet divus skaitļus, lai uzzinātu to summu, bet ja summa būs 10...19, tad summa būs 20!");
		
				System.out.println("Ievadiet pirmo skaitli: ");
				int a = scan.nextInt();
				
				System.out.println("Ievadiet otro skaitli: ");
				int b = scan.nextInt();
				
				int sumAB = a + b;
				int canSumLess = 9;
				int canSumMore = 20;
				
				
				if (sumAB <= canSumLess || sumAB >= canSumMore ) {
					System.out.println("Summa ir " + sumAB + ".");
				} else {
					System.out.println("Summa ir " + 20 + ".");
				} 
		}	
	}

}
