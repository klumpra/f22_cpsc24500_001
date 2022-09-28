package paycheckwhileloop;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hours, rate, gross;
		String doAgain;
		do {
			System.out.print("Enter hours worked and pay rate: ");
			hours = sc.nextDouble();
			rate = sc.nextDouble();
			gross = hours * rate;
			System.out.printf("Pay is %.2f.\n", gross);
			System.out.print("Do you have another employee? ");
			doAgain = sc.next();
		} while (doAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you.");
	}
}
