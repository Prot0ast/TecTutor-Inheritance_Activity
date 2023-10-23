//Author: Alan Barragan
//Project: 13_Inheritance_Activity
package mypackage;

public class Employee {
	public long employeeID, employeePhone;
	public String employeeName, employeeAddress;
	public double basicSalary, specialAllowance = 250.80, hra = 1000.5;

	public Employee(long id, String name, String address, long phone) {
		employeeID = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
	}
	
	public Employee(long id, String name, String address, long phone, double salary) {
		employeeID = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
		basicSalary = salary;
	}
	
	public double calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
		System.out.println("Salary: $" + salary);
		return salary;
	}
	
	public double calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;
		System.out.println("Transport Allowance: $" + transportAllowance);
		return transportAllowance;
	}
}
