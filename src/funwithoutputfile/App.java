package funwithoutputfile;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;


public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputFileName, outputFileName;
		System.out.print("Enter name of file: ");
		inputFileName = sc.nextLine();
		System.out.print("Enter output file name: ");
		outputFileName = sc.nextLine();
		String line;
		// open the text file
		try {
			Scanner fsc = new Scanner(new File(inputFileName));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(outputFileName))));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim().toUpperCase();
				System.out.println(line);
				pw.println(line);  
			}
			fsc.close();
			pw.close();
		} catch (Exception ex) {
			System.out.println("A problem happened reading the file.");
		}
	}
}
