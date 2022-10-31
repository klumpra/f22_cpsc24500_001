package employeeswithinheritance;

public class Customer extends Person {
	private double annualSalary;
	private String shippingAddress;
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		if (annualSalary < 0) {
			annualSalary = 0;
		} else {
			this.annualSalary = annualSalary;
		}
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Customer() {
		// the default constructor of Person is auto called here
		annualSalary = 0;
		shippingAddress = "";
	}
	public Customer(String first, String last, double annualSalary, String shippingAddress) {
		super(first,last);
		setAnnualSalary(annualSalary);
		setShippingAddress(shippingAddress);
	}
	@Override
	public String getType() {
		return "customer";
	}
	@Override
	public String toString() {
		return String.format("%s\t%10.2f%50s", super.toString(), annualSalary, shippingAddress);
	}
}
