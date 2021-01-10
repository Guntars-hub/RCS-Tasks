import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// Task 6
		try (
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Ievadiet divus teksta gabalus, lai izvadītu tos kombinētā veidā!");
			
			System.out.println("Ievadiet pirmo teksta gabalu: ");
			String a = scan.nextLine();
			
			System.out.println("Ievadiet otro teksta gabalu: ");
			String b = scan.nextLine();
			
			int lengthA = a.length();
			int lengthB = b.length();
			
			if (lengthA < lengthB || lengthA == lengthB) {
				System.out.println(a + b + a);
			} else {
				System.out.println(b + a + b);
			}
		}
		
	}

}
