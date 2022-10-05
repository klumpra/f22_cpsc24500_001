package splitfunction;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the phrase that pays: ");
		String phrase = sc.nextLine();
		Scanner lineScanner = new Scanner(phrase);
		while (lineScanner.hasNext()) {
			System.out.println(lineScanner.next());
		}
//		String[] parts = phrase.split("[ ,.;:!?] *");
		String[] parts = phrase.split(" ");
		for (String part : parts) {
			System.out.println(part);
		}
	}
}
