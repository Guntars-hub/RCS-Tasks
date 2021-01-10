import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// Task10
		System.out.println("Ievadiet burtu, lai noskaidrotu vai šis burts ir patskanis, līdzskanis vai divskanis: ");

		Scanner scan = new Scanner(System.in);
		String letter = scan.next();
		letter.toLowerCase();
		scan.close();
		
		if (letter.length() != 1) {
			System.err.println("Ievadiet tikai vienu burtu!");
			System.exit(0);
		}

		if (letter.contains("a") || letter.contains("e") ||letter.contains("i") || letter.contains("u")) {
			System.out.println(letter.toUpperCase() + " ir patskanis.");
		} else if (letter.contains("b") || letter.contains("c") || letter.contains("d") || letter.contains("f") || letter.contains("g") || letter.contains("h") || letter.contains("j")) {
			System.out.println(letter.toUpperCase() + " ir līdzskanis.");
		} else if (letter.contains("o")) {
			System.out.println(letter.toUpperCase() + " ir divskanis.");
		} else {
			System.err.println("Ievadiet burtu!");
		}
	}
}
