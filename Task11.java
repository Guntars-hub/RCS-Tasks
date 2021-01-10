import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// Task11
		System.out.print("Ievadiet skaitli, lai uzzinātu tā reizināšanas tabulu: ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		for (int i = 0; i <= num; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}

	}

}
