package employeeswithinheritance;

public class Employee extends Person implements Payable, BenefitsEligible {
	private double payRate;
	private double hoursWorked;
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		if (payRate < 0) {
			payRate = 0;
		} else {
			this.payRate = payRate;
		}
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		if (hoursWorked < 0) {
			hoursWorked = 0;
		} else {
			this.hoursWorked = hoursWorked;
		}
	}
	public Employee() {
		// the superclass's default constructor is called automatically here.
		// in this case, firstName and lastName are set up for us to ""
		payRate = 0;
		hoursWorked = 0;
	}
	public Employee(String first, String last, double hoursWorked, double payRate) {
		// call the super class's non-default constructor
		super(first, last);
		setHoursWorked(hoursWorked);
		setPayRate(payRate);
	}
	@Override
	public double calculateGrossPay() {
		return hoursWorked * payRate;
	}
	@Override
	public  double getHealthBenefitAmount() {
		return 0;
	}
	@Override
	public double getRetirementBenefitAmount() {
		return 0;
	}
	@Override
	public String getType() {
		return "employee";
	}
	@Override
	public String toString() {
//		return String.format("%s\t%s%\t%.2f\t%.2f", getFirstName(), getLastName(), hoursWorked, payRate);
		return String.format("%s\t%10.2f\t%10.2f", super.toString(), hoursWorked, payRate);
	}
}
