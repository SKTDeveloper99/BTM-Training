package btm.employee.management.employee;
import org.apache.log4j.Logger;

public class Tester extends Employee {					// Tester will be 2
	private static Logger LOG = Logger.getLogger(Tester.class);

	public Tester(int roleInput, String nameInput, String startDateInput, int moneyInput, int daysWorked) {
		super(roleInput, nameInput, startDateInput, moneyInput, daysWorked);
		// EmployeeInterface temp = new Manager();
	}

	public Tester(int roleInput, String nameInput, String startDateInput) {
		super(roleInput, nameInput, startDateInput);
	}

	public float calSalary() {

		float total = 200000;
		total = total/4 * getdaysOfWork();
		return total;
	}
	public String printUniqueEmployeeIdetity() {
		return "This is Tester";
	}
}
