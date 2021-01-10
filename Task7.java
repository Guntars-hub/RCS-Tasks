import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// Task7
	  
		Scanner scan = new Scanner(System.in);
		System.out.print("Ievadiet skaitli, lai izvadītu visus naturālos vai negatīvos skaitļus: ");
		
		int a = scan.nextInt();
		scan.close();
		
		for(int i = 0; i <= a; i++) {
			System.out.print(i + " ");
		}
		
		for(int i = 0; a <= i; a++) {
			System.out.print(a + " ");
		}
	  }
	}


