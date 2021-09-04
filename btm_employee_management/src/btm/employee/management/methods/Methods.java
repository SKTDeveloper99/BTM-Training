package btm.employee.management.methods;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.apache.log4j.Logger;

import btm.employee.management.employee.Developer;
import btm.employee.management.employee.Employee;
import btm.employee.management.employee.Manager;
import btm.employee.management.employee.Tester;

//import java.util.List;

public class Methods {
	private static Logger LOG = Logger.getLogger(Methods.class);

	public Methods() {

	}

	// static List<String> comp = new ArrayList<String>();
	static ArrayList<Employee> outboundSuccess1 = new ArrayList<Employee>();
	static ArrayList<String> outboundFail = new ArrayList<String>();
	static ArrayList<String> outboundSuccess = new ArrayList<String>();

	public static void readAndsortFile(String fileInput) {
		File inbound = new File(fileInput);
		try {
			Scanner myReader = new Scanner(inbound);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				if (dataValidation(data) == false) {
					outboundFail.add(data);
				} else {
					try {
						outboundSuccess1.add(generateEmpClasses(data));
					} catch (Exception e) {
						System.out.println("Improper class generation");
						e.printStackTrace();
					}

				}
			}
			myReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void exportFails(String linkInput) throws IOException {
		exportToFiles(outboundFail, linkInput);
	}

	public static void exportSuccess(String linkInput) throws IOException {
		exportToFiles(outboundSuccess, linkInput);
	}

	private static void exportToFiles(ArrayList<String> listInput, String fileLink) throws IOException { // general
																											// method to
																											// export
		// ArrayList -> textFile
		OutputStream outerStream = new FileOutputStream(fileLink, true);
		for (int i = 0; i < listInput.size(); i++) {
			outerStream.write(listInput.get(i).getBytes());
			outerStream.write('\n');
		}
		outerStream.close();
	}

	private static boolean dataValidation(String dande) { // check for the dataInput and see it is wrong or right?
		String[] arrOfStr = dande.split("\\|");

		if (arrOfStr.length != 3 || validateJavaDate(arrOfStr[2]) == false || checkEmployeeType(arrOfStr[0]) == false) {
			return false;
		}

		return true;
	}

	private static boolean checkEmployeeType(String dataInput) { // check for proper employee type.
		return (dataInput.equals("1") || dataInput.equals("2") || dataInput.contentEquals("3"));
	}

	private static boolean validateJavaDate(String strDate) { // check for theDateInput correctly
		if (strDate.trim().equals("")) { /* Check if date is 'null' */
			return true;
		} /* Date is not 'null' */
		else {
			/*
			 * Set preferred date format, For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.
			 */
			SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
			sdfrmt.setLenient(false);
			try {
				Date javaDate = sdfrmt.parse(strDate);
			} catch (ParseException e) {
				return false;
			}

			return true; /* Return true if date format is valid */
		}
	}

	private static Employee generateEmpClasses(String rawDataLine) throws Exception {
		LOG.info(">>>>>> +[generateEMPclasses] START <<<<<");
		String[] arrOfStr = rawDataLine.split("\\|");
		int role = Integer.parseInt(arrOfStr[0]);
		Employee employee = null;
		switch (role) {
		case 1:
			employee = (Employee) new Developer(Integer.parseInt(arrOfStr[0]), arrOfStr[1], arrOfStr[2]);
			break;
		case 2:
			employee = (Employee) new Tester(Integer.parseInt(arrOfStr[0]), arrOfStr[1], arrOfStr[2]);
			break;
		case 3:
			employee = (Employee) new Manager(Integer.parseInt(arrOfStr[0]), arrOfStr[1], arrOfStr[2]);
			break;
		}
		LOG.info(">>>>>> +[generateEMPclasses] END <<<<<");
		return (Employee) employee;
	}

	public static void testClassGenerators() throws IOException {
	for (int i = 0; i < outboundSuccess1.size(); i++) {
		Employee m = outboundSuccess1.get(i);
		if (m.getClass() == Manager.class) {
			System.out.println("this may work for Manager");
			System.out.println(m.printUniqueEmployeeIdetity());
			m.setDaysOfWork("06/24/2020"); 
		}
		else if (m.getClass() == Developer.class) {
			System.out.println("this may work Developer");
			System.out.println(m.printUniqueEmployeeIdetity());
			m.setDaysOfWork("06/24/2020"); 
		}
		else if (m.getClass() == Tester.class) {
			System.out.println("this may work Tester");
			System.out.println(m.printUniqueEmployeeIdetity());
			m.setDaysOfWork("06/24/2020"); 
		}
		System.out.println(m.exportCompleteString(m.getemployeeRole(),m.getEmpName(),m.getstartDate(), m.calSalary(),m.getdaysOfWork()));
		outboundSuccess.add(m.exportCompleteString(m.getemployeeRole(),m.getEmpName(),m.getstartDate(), m.calSalary(),m.getdaysOfWork()));	
	}

	}

}
