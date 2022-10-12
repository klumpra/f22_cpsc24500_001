package arraylistofnames;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class App {
	public static void print(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ray");
		names.add("Karen");
		names.add("Brody");
		names.add("Conor");
		names.add("Lauren");
		System.out.println("Here is the list of names:");
		print(names);
		System.out.print("Enter name and position: ");
		int pos;
		String name;
		name = sc.next();
		pos = sc.nextInt();
		names.add(pos,name);
		System.out.println("Here is the list of names:");
		print(names);
		Collections.sort(names);
		System.out.println("Here is the list sorted: ");
		print(names);
		Random rnd = new Random();
		pos = rnd.nextInt(names.size());
		String awardWinner = names.get(pos);
		System.out.printf("Today's award winner is %s.\n", awardWinner);
		System.out.print("Enter position of what to remove: ");
		pos = sc.nextInt();
		names.remove(pos);
		print(names);
	}
}
