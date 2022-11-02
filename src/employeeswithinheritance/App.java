package employeeswithinheritance;
import java.util.ArrayList;
import java.util.Collections;
public class App {
	public static void main(String[] args) {
/*		Employee emp = new Employee("Ray","Klump",15,17.5);
		Customer cust1 = new Customer("Conor","Klump",50000,"123 Primrose Lane");
		Customer cust2 = new Customer("Lauren","Klump",62500,"One University Pkwy");
*/
/*		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Employee("Ray","Klump",15,17.5));
		persons.add(new Customer("Conor","Klump",5000,"123 Primrose"));
		persons.add(new Customer("Lauren","Klump",62500,"One University Pkwy"));
		Collections.sort(persons);   // uses natural sorted order
		for (Person person : persons) {
			System.out.println(person);
		}
*/
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("Ray","Klump",17.5,21.5));
		emps.add(new Employee("Karen","Klump",24.3,16.8));
		emps.add(new Employee("Lauren","Klump",15.2,17.5));
		Collections.sort(emps);
		for (Employee emp : emps) {
			System.out.println(emp);
		}
		System.out.println("Now sort by hours worked:");
		Collections.sort(emps,new CompareEmployeeHours());
		Collections.reverse(emps);
		for (Employee emp : emps) {
			System.out.println(emp);
		}		
	}
}
