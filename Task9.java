import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// Task9
		System.out.print("Ievadiet skaitli, lai noskaidrotu, kas tas ir par mēnesi: ");
		
		Scanner scan = new Scanner (System.in);
		int month = scan.nextInt();
		scan.close();
		
		if (month == 1 ) {
			System.out.println("Janvāris");
		} else if (month == 2) {
			System.out.println("Februāris");
		} else if (month == 3) {
			System.out.println("Marts");
		} else if (month == 4) {
			System.out.println("Aprīlis");
		} else if (month == 5) {
			System.out.println("Maijs");
		} else if (month == 6) {
			System.out.println("Jūnijs");
		} else if (month == 7) {
			System.out.println("Jūlijs");
		} else if (month == 8) {
			System.out.println("Augusts");
		} else if (month == 9) {
			System.out.println("Septembris");
		} else if (month == 10) {
			System.out.println("Oktobris");
		} else if (month == 11) {
			System.out.println("Novembris");
		} else if (month == 12) {
			System.out.println("Decembris");
		} else {
			System.out.println("Mēnesis nav derīgs.");
		}

	}

}
