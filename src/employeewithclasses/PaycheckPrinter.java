package employeewithclasses;
import java.util.ArrayList;
public class PaycheckPrinter {
	private double taxRate;
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double rate) {
		if (rate < 0) {
			taxRate = 0;
		} else if (taxRate > 1) {
			taxRate = rate / 100;
		} else {
			taxRate = rate;
		}
	}
	public PaycheckPrinter() {
		taxRate = 0;
	}
	public PaycheckPrinter(double rate) {
		setTaxRate(rate);
	}
	public void printPaycheck(Employee emp) {
		System.out.printf("Paycheck for %s %s\n",
				emp.getFirstName(),emp.getLastName());
		double gross, net, taxes;
		gross = emp.calculateGrossPay();
		taxes = taxRate * gross;
		net = gross - taxes;
		System.out.printf("%-15s%10.2f\n", "Gross",gross);
		System.out.printf("%-15s%10.2f\n", "Taxes",taxes);
		System.out.printf("%-15s%10.2f\n", "Net",net);
	}
	public void printPaychecks(ArrayList<Employee> emps) {
		for (Employee emp : emps) {
			printPaycheck(emp);
			System.out.println();
		}
	}
}
