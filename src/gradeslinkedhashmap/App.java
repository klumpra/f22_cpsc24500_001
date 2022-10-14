package gradeslinkedhashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.io.File;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fname;
		System.out.print("Enter name of file: ");
		fname = sc.nextLine();
		String line;
		String[] parts;
		String name;
		ArrayList<Integer> scores;
		LinkedHashMap<String,ArrayList<Integer>> grades = new LinkedHashMap<String,ArrayList<Integer>>();
		try {
			Scanner fsc = new Scanner(new File(fname));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim();
				parts = line.split("\t");
				name = parts[0];
				scores = new ArrayList<Integer>();  // for this person's scores. Fill it
				for (int i = 1; i < parts.length; i++) {
					scores.add(Integer.parseInt(parts[i]));
				}
				grades.put(name, scores);
			}
			fsc.close();
			System.out.print("Enter name of student: ");
			name = sc.nextLine();
			if (grades.containsKey(name)) {
				scores = grades.get(name);
				for (int score: scores) {
					System.out.println(score);
				}
			} else {
				System.out.println("That student doesn't exist.");
			}
		} catch (Exception ex) {
			System.out.println("Could not read the file.");
		}
	}
}
