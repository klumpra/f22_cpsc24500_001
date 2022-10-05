package gradesfromfile;
import java.util.Scanner;
import java.io.File;
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of file: ");
		String fname = sc.nextLine();
		String line;
		String[] parts;
		String name;
		double total, score, avg;
		try {
			Scanner fsc = new Scanner(new File(fname));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim();
				if (line.length() > 0)  { //not a blank line
					parts = line.split("\t");
					name = parts[0];
					total = 0;
					for (int i = 1; i < parts.length; i++) {
						score = Double.parseDouble(parts[i]);
						total = total + score;
					}
					avg = total / (parts.length - 1);
					System.out.printf("%s earned %.2f.\n", name,avg);
				}
			}
			fsc.close();
		} catch (Exception ex) {
			// ex.printStackTrace();
			System.out.println("Something bad happened while reading the file.");
		}
	}

}
