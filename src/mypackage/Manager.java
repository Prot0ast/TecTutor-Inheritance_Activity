package mypackage;

public class Manager extends Employee{

	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone, salary);
	}
	
	@Override public double calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		System.out.println("Transport Allowance: $" + transportAllowance);
		return transportAllowance;
	}
}
