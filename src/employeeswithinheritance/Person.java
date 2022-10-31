package employeeswithinheritance;

public abstract class Person {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first) {
		firstName = first;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String last) {
		lastName = last;
	}
	public Person() {
		this("","");   // calls the non-default constructor passing two empty strings
	}
	public Person(String first, String last) {
		setFirstName(first);
		setLastName(last);
	}
	public abstract String getType();
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", getType(), firstName, lastName);
	}
}
