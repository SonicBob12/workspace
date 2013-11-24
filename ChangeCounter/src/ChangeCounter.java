import java.util.Scanner;

public class ChangeCounter {
	public static void main(String[] args) {
		int quarters, dimes, nickels, pennies;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of quarters");
		quarters = scan.nextInt();
		System.out.print("Enter the number of dimes");
		dimes = scan.nextInt();
		System.out.print("Enter the number of nickels");
		nickels = scan.nextInt();
		System.out.print("Enter the number of pennies");
		pennies = scan.nextInt();

		int total;
		total = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
		System.out.println("The total is: " + total);
		int dollars = total/100;
		
		System.out.print("Which is " + dollars + " dollars");
		int cents = total % 100;
		System.out.print(" and " + cents + " cents.");
		System.out.println();
		
	}

}
