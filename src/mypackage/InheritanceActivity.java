package mypackage;

public class InheritanceActivity {

	public InheritanceActivity() {}

	public static void main(String[] args) {
		Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		manager.calculateSalary();
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		trainee.calculateSalary();
		manager.calculateTransportAllowance();
		trainee.calculateTransportAllowance();
	}
}
