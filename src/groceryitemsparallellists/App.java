package groceryitemsparallellists;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void printShoppingList(ArrayList<String> names, ArrayList<Double> prices) {
		System.out.println("Here is what is in your cart:");
		for (int i = 0; i < names.size(); i++) {
			System.out.printf("%-20s%10.2f\n", names.get(i), prices.get(i));
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// two array lists - one for grocery names and the other for their prices
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		names.add("Bread");
		prices.add(2.99);
		names.add("Milk");
		prices.add(2.49);
		names.add("Frozen Pizza");
		prices.add(7.99);
		printShoppingList(names,prices);
		System.out.print("Enter name of new item: ");
		String newItem = sc.nextLine();
		System.out.print("Enter price of new item: ");
		double newPrice = sc.nextDouble();
		System.out.print("Enter position number: ");
		int pos = sc.nextInt();
		names.add(pos, newItem);
		prices.add(pos,newPrice);
		printShoppingList(names,prices);
	}
}
