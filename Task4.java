import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// Task 4
		try (
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Ievadiet trīs skaitļus, ja tie ir vienādi, tie netiks pieskaitīti summai: ");
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			if (a == b && b == c) {
				System.out.println("Summa ir : " + (a) + ", jo divi skaitļi ir vienādi!");
			} else if (a == b && b != c) {
				System.out.println("Summa ir : " + (b) + ", jo divi skaitļi ir vienādi!");
			} else if (b == c && a != c) {
				System.out.println("Summa ir : " + (c) + ", jo divi skaitļi ir vienādi!");
			} else if (a == b && a == c && b == c ) {
				System.out.println("Summa ir : " + (0) + ", jo visi skaitļi ir vienādi!");
			} else {
				System.out.println("Summa ir : " + (a + b + c));
			}
		}

	}

}
