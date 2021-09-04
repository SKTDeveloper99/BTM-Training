package btm.employee.management.employee;
//import java.text.ParseException;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static java.lang.Math.toIntExact;

import org.apache.log4j.Logger;

public abstract class Employee {


	private int employeeRole = 0;
	private String employeeName = null;
	private String startDate = null;
	private float salary = 0;
	private int daysOfWork = 0;
	private static Logger LOG = Logger.getLogger(Employee.class);

	public Employee() {
	}

	public Employee(int roleInput, String nameInput, String startDateInput, float moneyInput, int daysWorked) {
		LOG.info(">>>>>> +[create a class] START");
		employeeRole = roleInput;
		employeeName = nameInput;
		startDate = startDateInput;
		salary = moneyInput;
		daysOfWork = daysWorked;
		LOG.info(">>>>>> +[finish a class] END");
	}

	public Employee(int roleInput, String nameInput, String startDateInput) {
		employeeRole = roleInput;
		employeeName = nameInput;
		startDate = startDateInput;
		salary = 0;
		daysOfWork = 0;
	}

	public void setRole(int roleInput) {
		employeeRole = roleInput;
	}

	public int getemployeeRole() {
		return this.employeeRole;
	}

	public void setName(String nameInput) {
		employeeName = nameInput;
	}

	public String getEmpName() {
		return this.employeeName;
	}

	public void setStartDate(String startDateInput) {
		startDate = startDateInput;
	}

	public String getstartDate() {
		return this.startDate;
	}

	public void setSalary(float moneyInput) {
		salary = moneyInput;
	}

	public float getSalary() {
		return this.salary;
	}

	public void setdaysOfWork(int daysWorked) {
		daysOfWork = daysWorked;
	}
	
	public int setDaysOfWork(String endDay) {
		return daysOfWork = calculateDaysWorked(this.startDate,endDay);
	}

	public int getdaysOfWork() {
		return this.daysOfWork;
	}

	public float calSalary() {
		float t = 0;// my monthly salary when i am 30 (ti nua sua lai)
		return t;
	}
	protected int calculateDaysWorked(String startDayInput,String todayInput) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String inputString1 = startDayInput;
		String inputString2 = todayInput;

		LocalDate date1 = LocalDate.parse(inputString1, dtf);
		LocalDate date2 = LocalDate.parse(inputString2, dtf);
		long daysBetween = ChronoUnit.DAYS.between(date1, date2);
		System.out.println ("Days: " + daysBetween);
		return toIntExact(daysBetween);
	}
	public String printUniqueEmployeeIdetity() {
		return "This is Employee";
	}
	public String exportCompleteString(int roleInput, String nameInput, String startDateInput, float moneyInput, int daysWorked) {
		return String.format("%d|%s|%s|%f|%d",roleInput,nameInput,startDateInput,moneyInput,daysWorked);
	}
}
