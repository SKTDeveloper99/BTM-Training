package btm.employee.management.employee;
import org.apache.log4j.Logger;


public class Manager extends Employee implements EmployeeIfc {     // Manager will be 3
	private static Logger LOG = Logger.getLogger(Manager.class);

	public Manager() {

	}

	public Manager(int roleInput, String nameInput, String startDateInput, int moneyInput, int daysWorked) {
		super(roleInput, nameInput, startDateInput, moneyInput, daysWorked);
		// EmployeeInterface temp = new Manager();
	}

	public Manager(int roleInput, String nameInput, String startDateInput) {
		super(roleInput, nameInput, startDateInput);
	}

	public float calSalary() {

		float total = 200000;
		total = total * 2 * getdaysOfWork();
		return total;
	}

	public String printUniqueEmployeeIdetity() {
		return "This is Manager";
	}

}