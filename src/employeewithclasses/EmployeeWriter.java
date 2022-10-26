package employeewithclasses;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
/* this is a view class.
 * It communicates data from our model (Employee) to the user.
 * It does this through both the screen and a file.
 */
public class EmployeeWriter {
	public static void writeEmployeesToScreen(ArrayList<Employee> emps) {
		for (Employee emp : emps) {
			System.out.println(emp);
		}
	}
	public static boolean writeEmployeesToFile(ArrayList<Employee> emps,
		String fileName) {
		try {
			PrintWriter pw = new PrintWriter
					(new BufferedWriter(new FileWriter(new File(fileName))));
			for (Employee emp : emps) {
				pw.println(emp);
			}
			pw.close();
			return true;
		} catch (Exception ex) {
	//		ex.printStackTrace();
			return false;
		}
	}
}
