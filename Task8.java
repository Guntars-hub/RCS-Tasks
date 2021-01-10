import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// Task8
		
		System.out.println("Ievadiet divus skaitļus, lai uzzinātu, kuri skaitļi, līdz šim skaitlim dalās ar 2 un 3, bet ne ar 5:");
		
		Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			int y = scan.nextInt();
			scan.close();
			
		for(int i = x; i <= y; i++) {
			if (i % 2 == 0 && i % 3 == 0 && i % 5 != 0) {
			System.out.print(i + " ");	
			}else if(i == 0) {
			 System.out.print("");
			}	
		}
	}
}
