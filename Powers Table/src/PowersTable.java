import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		boolean repeat = true;
		
		System.out.println("Hello user!");
		
		while (repeat) {
			System.out.print("Please enter an integer: ");
			int userChoice = scnr.nextInt();
			
			System.out.println("Squares and Cubes:");
			System.out.printf("%-8s", "Number");
			System.out.printf("%-8s", "Squared");
			System.out.printf("%-8s", "Cubed");
			System.out.println();
			
			System.out.printf("%-8s", "======");
			System.out.printf("%-8s", "=======");
			System.out.printf("%-8s", "=====");
			
			
			
			for (int i = 1; i <= userChoice; i++) {
				System.out.println();
				System.out.printf("%-8s", i);
				System.out.printf("%-8s", i*i);
				System.out.printf("%-8s", i*i*i);
				
			}
			
			System.out.println();
			System.out.println("Multiplication:");
			
			//first row:
			System.out.printf("%-4s", "");
			System.out.printf("%-4s", "");
			for (int i = 1; i <= userChoice; i++) {
				System.out.printf("%-4s", i);
			}
			System.out.println();
			System.out.printf("%-4s", "");
			System.out.printf("%-4s", "");
			for (int i = 1; i <= userChoice; i++) {
				System.out.printf("%-4s", "=");
			}
			System.out.println();
			for (int i = 1; i <= userChoice; i++) {
				System.out.printf("%-4s", i);
				System.out.printf("%-4s","|");
				for (int j = 1; j <= userChoice; j++) {
					
					System.out.printf("%-4s", i*j);
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.print("Continue? y/n ");
			String again = scnr.next();
			if (!again.equalsIgnoreCase("y")) {
				repeat = false;
			}
		}
		System.out.println("Thanks for playing!");
		
	}

}


// System.out.printf("%-8s", "Number");