package main;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Department dept = new Department();
		
		System.out.print("Nome do departamento: ");
		dept.setName(sc.nextLine());
		System.out.print("Dia do pagamento: ");
		dept.setPayDay(sc.nextInt());
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();
		
		dept.setAddress(new Address(email, phone));
		
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados do funcionário " + (i+1));
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			dept.addEmployee(new Employee(name, salary));
		}
		
		showReport(dept);
		
		sc.close();

	}
	
	private static void showReport(Department dept) {
		List<Employee> employees = dept.getEmployees();
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.println("Departamento Vendas = R$ " + dept.payRoll());
		System.out.println("Pagamento realizado no dia " + dept.getPayDay());
		System.out.println("Funcionários:");
		for(Employee emp : employees) {
			System.out.println(emp.getName());
		}
		System.out.println("Para dúvidas favor entrar em contato: " + dept.getAddress().getEmail());
	
	}

}
