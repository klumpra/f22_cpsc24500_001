package employeeswithinheritance;
import java.util.ArrayList;
public class App {
	public static void main(String[] args) {
/*		Employee emp = new Employee("Ray","Klump",15,17.5);
		Customer cust1 = new Customer("Conor","Klump",50000,"123 Primrose Lane");
		Customer cust2 = new Customer("Lauren","Klump",62500,"One University Pkwy");
*/
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Employee("Ray","Klump",15,17.5));
		persons.add(new Customer("Conor","Klump",5000,"123 Primrose"));
		persons.add(new Customer("Lauren","Klump",62500,"One University Pkwy"));
		
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
