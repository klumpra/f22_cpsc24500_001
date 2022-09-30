package webpagebuilder;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***************************************************");
		System.out.println("               WEBPAGE BUILDER V1.0");
		System.out.println("***************************************************");
		System.out.println("");
		System.out.println("This application helps you build a basic web page");
		System.out.println("by asking you a series of questions. Just answer");
		System.out.println("each question, and I'll populate your new web page");
		System.out.println("with your responses.");
		System.out.println("");
		System.out.print("Where do you want the page stored? ");
		String filename = sc.nextLine();
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(filename))));
			System.out.print("What is your name? ");
			String name = sc.nextLine();
			System.out.print("How old are you? ");
			int age = sc.nextInt();
			int ageInMonths = age * 12;
			sc.nextLine();
			System.out.print("Where do you live? ");
			String location = sc.nextLine();
			System.out.print("When you grow up, you want to be ... ");
			String growUp = sc.nextLine();
			System.out.print("What are your two favorite integers? ");
			int first = sc.nextInt();
			int second = sc.nextInt();
			double quotient = (double)first/second;
//			System.out.println("Here is the code for your web page:");
			pw.println("<html>");
			pw.printf("<head><title>%s's Web Page</title></head>\n", name);
			pw.println("<body>");
			pw.printf("<h1>Welcome to %s's Web Page</h1>\n",name);
			pw.printf("<p>I am %d years (or %d months!) old and live in %s.</p>\n", 
					age, ageInMonths, location);
			pw.printf("<p>When I grow up, I want to be %s.</p>\n", growUp);
			pw.printf("<p>My two favorite integers are %d and %d. Their quotient is %.3f.</p>\n",
					first,second,quotient);
			pw.println("<p>Thank you for visiting my page!</p>");
			pw.println("</body>");
			pw.println("</html>");
			pw.println();
			pw.close();
		} catch (Exception ex) {
			System.out.println("An error occurred writing the web page.");
		}
	}
}
