package payrollwhileloop;
import java.util.Scanner;
public class App {
	public static void printPayCheck(int empNum, double payRate, double hoursWorked,
			double grossPay, double taxes, double netPay) {
		System.out.printf("Pay summary for employee # %d\n", empNum);
		System.out.printf("%-20s%10.2f\n","Hourly pay rate",payRate);
		System.out.printf("%-20s%10.2f\n","Hours worked", hoursWorked);
		System.out.printf("%-20s%10.2f\n","Gross pay",grossPay);
		System.out.printf("%-20s%10.2f\n","Taxes withheld",taxes);
		System.out.printf("%-20s%10.2f\n","Net pay",netPay);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		double hoursWorked, payRate, grossPay, taxes, netPay;
		double taxRate = 0.0875;
		String doAgain = "y";
		int count = 0;
		while (doAgain.equalsIgnoreCase("y")) {
			count = count + 1;
			System.out.printf("Employee #%d\n", count);
			System.out.print("Enter hourly pay rate and hours worked: ");
			payRate = sc.nextDouble();
			hoursWorked = sc.nextDouble();
			grossPay = payRate * hoursWorked;
			taxes = taxRate * grossPay;
			netPay = grossPay - taxes;
			printPayCheck(count,payRate,hoursWorked,grossPay,taxes,netPay);
			System.out.print("Do you have another (y or n)? ");
			doAgain = sc.next();
		}
		System.out.println("Thank you for using this program.");
	}
}
