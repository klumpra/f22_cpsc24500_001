package employeeswithinheritance;
import java.util.Comparator;
public class CompareEmployeeHours implements Comparator<Employee> {
	public int compare(Employee one, Employee two) {
		double firstHours, secondHours;
		firstHours = one.getHoursWorked();
		secondHours = two.getHoursWorked();
		if (firstHours < secondHours) {
			return -1;   // first is less than second
		} else if (firstHours > secondHours) {
			return 1;
		} else {
			return 0;
		}
	}
}
