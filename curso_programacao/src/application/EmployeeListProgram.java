package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeListProgram {

	/*****Exercise*****/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("How many employees will be registered?");
		int x = sc.nextInt();	
		
		List<Employee> list = new ArrayList<>(); 
		
		for (int i = 0; i<x; i++) {
			System.out.println("Employee #" + i);
			sc.nextLine();
			
			System.out.println("Id: ");
			int id = sc.nextInt();
			
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		
		System.out.println("Enter with employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee employee = new Employee();
		employee = list.stream().filter(i -> i.getId() == id).findFirst().orElse(null);		
		
		double porcentage = 0;
		if (employee != null) {
			System.out.println("Enter the porcentage: ");
			porcentage = sc.nextDouble();
			
			double calc = (employee.getSalary() * porcentage) / 100;
			employee.setSalary(employee.getSalary() + calc);
		}else {
			System.out.println("This id is not exist!");
		}
		
		System.out.println("List of employees: ");
		
		for (Employee i : list) {
			System.out.println(i.getId() + ", " + i.getName() + ", " + i.getSalary());
		}
				
		sc.close();
	}

}
