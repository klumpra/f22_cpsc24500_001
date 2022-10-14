package grocerieslinkedhashmap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class App {
	public static void printShoppingCart(LinkedHashMap<String, Double> groceries) {
		System.out.println("Here is what is in your cart:");
		double price;
		for (String name: groceries.keySet()) {
			price = groceries.get(name);
			System.out.printf("%-20s%10.2f\n", name,price);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String,Double> groceries = new LinkedHashMap<String,Double>();
		groceries.put("bread",2.99);
		groceries.put("milk",2.49);
		groceries.put("frozen pizza",7.99);
		printShoppingCart(groceries);
		groceries.remove("milk");
		printShoppingCart(groceries);
		System.out.print("Enter the item you want to find the price of: ");
		String name = sc.nextLine();
		if (groceries.containsKey(name)) {
			System.out.printf("The item %s costs %.2f.\n", name, groceries.get(name));
		} else {
			System.out.println("The item was not found.");
		}
	}
}
