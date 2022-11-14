package employeesjson;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ray","Klump",66000));
        employees.add(new Employee("Karen","Klump",88000));
        employees.add(new Employee("Conor","Klump",65000));
        employees.add(new Employee("Lauren","Klump",48000));
        employees.add(new Employee("Evan","Klump",42000));
        EmployeeWriter.writeEmployeesToScreen(employees);
        System.out.println("Write to JSON");
        Scanner sc = new Scanner(System.in);
        String fname;
        System.out.print("Enter filename: ");
        fname = sc.nextLine();
        if (EmployeeWriter.writeEmployeesToJSON(employees, fname)) {
        	System.out.println("success");
        } else {
        	System.out.println("fail");
        }
        ArrayList<Employee> readJSON;
        readJSON = EmployeeReader.readEmployeesFromJSON(fname);
        EmployeeWriter.writeEmployeesToScreen(readJSON);
    }
}
