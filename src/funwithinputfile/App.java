package funwithinputfile;
import java.io.File;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName;
		System.out.print("Enter name of file: ");
		fileName = sc.nextLine();
		String line;
		// open the text file
		try {
			Scanner fsc = new Scanner(new File(fileName));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim().toUpperCase();
				System.out.println(line);
			}
			fsc.close();
		} catch (Exception ex) {
			System.out.println("A problem happened reading the file.");
		}
	}
}
