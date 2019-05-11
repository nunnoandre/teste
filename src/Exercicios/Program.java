package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		int id;
		Employee employee;
		ArrayList<Employee> listEmployees = new ArrayList<>();
		
		for(int i = 0; i<n ; i++) {
			System.out.println("Employee #"+(i+1)+": ");
			System.out.print("ID : ");
			id = sc.nextInt();
			System.out.print("Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary : ");
			double salary = sc.nextDouble();
			employee = new Employee(id,name,salary);
			listEmployees.add(employee);
			
			System.out.println("\n*-*-*-*\n");


		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		id = sc.nextInt();
		for(Employee emp : listEmployees) {
			if (emp.getId()==id) {
				System.out.print("Enter the percentage : ");
				double percentage = sc.nextDouble();
				emp.alterarSalario(percentage);
			}
			else{
				System.out.println("This id does not exist!\n");
			}
			
		}
		sc.close();
		
		System.out.println("List of Employees : ");
		for(Employee emp : listEmployees) {
			System.out.println(emp);
		}

	}

}
