package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;
	
	private List<Employee> employees = new ArrayList<>();
	private Address address;
	
	public Department(){
	}
	
	public Department(String name, int payDay, List<Employee> employees, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.employees = employees;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
		
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.removeAll(employees);
	}
	
	public double payRoll() {
		double soma = 0.0;
		for(Employee e : employees) {
			soma += e.getSalary();
		}
		return soma;
	}
	
	
	
}
