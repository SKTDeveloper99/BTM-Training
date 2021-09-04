package btm.employee.management.employee;
import org.apache.log4j.Logger;


public class Developer extends Employee { 					// Developer will be 1
	private static Logger LOG = Logger.getLogger(Developer.class);

	public Developer(int roleInput, String nameInput, String startDateInput, int moneyInput, int daysWorked) {
		super(roleInput, nameInput, startDateInput, moneyInput, daysWorked);
		// EmployeeInterface temp = new Manager();
	}

	public Developer(int roleInput, String nameInput, String startDateInput) {
		super(roleInput, nameInput, startDateInput);
	}
	
	public float calSalary() {

		float total = 200000;
		total *= getdaysOfWork();
		return total;
	}
	public String printUniqueEmployeeIdetity() {
		return "This is Developer";
	}
}
