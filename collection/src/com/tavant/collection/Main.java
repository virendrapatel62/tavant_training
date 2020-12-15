package com.tavant.collection;

import java.io.Console;
import java.util.Scanner;

import com.tavant.collection.models.Employee;
import com.tavant.collection.service.EmployeeService;
import com.tavant.collection.service.EmployeeServiceImpl;

public class Main {

	private static EmployeeService employeeService = new EmployeeServiceImpl();
	private static Scanner scanner = new Scanner(System.in);
	private static boolean again = false;

	public static void add() {
		Employee employee = new Employee();

		System.out.println("Enter Employee ID");
		employee.setEmployeeId(scanner.nextLine());
		
		boolean flag = true;
		while(flag) {
			
		}
		
		
		System.out.println("Enter First Name");
		employee.setEmployeeFirstName(scanner.nextLine());

		System.out.println("Enter Last Name Name");
		employee.setEmployeeLastName(scanner.nextLine());

		System.out.println("Enter Mobil Number");
		employee.setEmployeeMobileNumber(scanner.nextLine());

		System.out.println("Enter Salary");
		employee.setEmployeeSalary(Float.valueOf(scanner.nextLine()));

		employeeService.addEmployee(employee);
	}

	public static void delete() {
		System.out.println("Enter EMployee ID");
		Employee employee2 = employeeService.deleteEmploye(scanner.nextLine());
		if (employee2 != null) {
			System.out.println("EMployee Deleted");
		} else {
			System.out.println("No Employee With Given ID");
		}

	}

	private static void printall() {

		System.out.println("All Employees");
		for (Employee employee3 : employeeService.getEmployees()) {
			System.out.println(employee3);
		}

	}
	
	private static void checkIsExists() {
		System.out.println("Enter EMployee ID");
		boolean isexists = employeeService.isExists(scanner.nextLine());
		if (isexists) {
			System.out.println("Yes ");
		} else {
			System.out.println("No");
		}
	}
	
	public static void main(String[] args) {
		String a = "Virendra";
		String b = "aVirendr";
		
		System.out.println(a.hashCode());
		System.out.println(a.hashCode());
	}

	public static void main(String args) {
		
		
		 

		System.out.println("Hello ...");

		do {
			showOptions();
			int input = scanner.nextInt();
			switch (input) {

			case 1:
				add();
				break;

			case 2:
				delete();
				break;

			case 3:
				checkIsExists();
				break;

			case 4:
				printall();
				break;

			default:
				System.out.println("Invalid Input");
				again = false;
				break;
			}

			System.out.println("Wanna Cont.. press 1 for yes or any key ");
			String key = scanner.nextLine();

			if (key.equals("1")) {
				again = true;
			}

		} while (again);

		System.out.println("Bye Bye...");

	}

	
	public static void showOptions() {
		System.out.println("---------------");
		System.out.println("Choose Option :");
		System.out.println("1 : Add");
		System.out.println("2 : Delete");
		System.out.println("3 : Check Existance By Id");
		System.out.println("4 : Show All ");
		System.out.println("---------------");

	}
}
