package areawithexception;

import java.util.Scanner;
public class App {
	public static void printMenu() {
		System.out.println("Here are your options: ");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Quit");
		System.out.print("Enter the number of your choice: ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double radius, area, length, width;
		do {
			printMenu();
			do {
				try {
					choice = sc.nextInt();
				} catch (Exception ex) {
					ex.printStackTrace();  // debugging
					System.out.println("You needed to enter an int.");
					sc.nextLine();  // clear out the input
					System.out.print("Enter an int: ");
					choice = -1;
				}
			} while (choice == -1);
			if (choice == 1) {    // circle
				System.out.print("Enter the radius: ");
				radius = sc.nextDouble();
				area = Math.PI * Math.pow(radius, 2);
				System.out.printf("Area of circle with radius %.2f is %.2f.\n", radius, area);
			} else if (choice == 2) {  //rectangle
				System.out.print("Enter length and width: ");
				length = sc.nextDouble();
				width = sc.nextDouble();
				area = length*width;
				System.out.printf("Area for length = %.2f and width = %.2f is %.2f.\n",length, width, area);
			} else if ((choice != 3) && (choice != -1)) {  // invalid option
				System.out.println("Dude, what's wrong?");
			}
		} while (choice != 3);
		System.out.println("Thank you.");
	}
}
