
public class Task13 {

	public static void main(String[] args) {
		// Task13
		int firstNum = 1;
		int secondNum = 0;
		
		for (int i = 10; i < 100; i++) {
			System.out.println(i + ", " + firstNum  + "+" + secondNum + " = " + (firstNum + secondNum));
			secondNum++;
			
			if (secondNum == 10) {
				secondNum = 0;
				firstNum++;
			}
		}

	}

}
