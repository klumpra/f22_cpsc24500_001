package employeewithclasses;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String doAgain, first, last;
		Scanner sc = new Scanner(System.in);
		double rate, worked;
		Employee emp;
		do {
			System.out.print("Enter first and last name, pay rate, and hours worked: ");
			first = sc.next();
			last = sc.next();
			rate = sc.nextDouble();
			worked = sc.nextDouble();
			emp = new Employee(first,last,rate,worked);
			employees.add(emp);
			System.out.print("Do again (y or n)? ");
			doAgain = sc.next();
		} while (doAgain.equalsIgnoreCase("y"));
		sc.nextLine();  // clear out the remain eol marker
		EmployeeWriter.writeEmployeesToScreen(employees);
		String fileName;
		System.out.print("Enter file to save to: ");
		fileName = sc.nextLine();
		if (EmployeeWriter.writeEmployeesToFile(employees, fileName)) {
			System.out.println("The employees were written to a file.");
		} else {
			System.out.println("Boo. Hiss. Drats. Failure.");
		}
		System.out.println("Now I'll print the paychecks ...");
		PaycheckPrinter pp = new PaycheckPrinter();
		pp.printPaychecks(employees);
	}
}
