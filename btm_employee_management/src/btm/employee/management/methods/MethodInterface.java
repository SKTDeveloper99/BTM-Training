package btm.employee.management.methods;

public interface MethodInterface {
	public void firstMethod();
	}


/*
 * import org.apache.log4j.Logger; import java.io.File; // Import the File class
 * import java.io.FileNotFoundException; import java.io.BufferedOutputStream;
 * import java.io.FileOutputStream; import java.nio.file.Paths; import
 * java.text.ParseException; import java.text.SimpleDateFormat; import
 * java.util.ArrayList; //ArrayList car = new ArrayList<>(); import
 * java.util.Arrays; import java.util.Date; import java.util.List;
 * 
 * 
 * import btm.Employee.Management.employee.Developer; import
 * btm.Employee.Management.employee.Employee; import
 * btm.Employee.Management.employee.Manager; import
 * btm.Employee.Management.employee.Tester; //import
 * btm.employee.management.main.MainApplication;
 * 
 * public class Methods { private static Logger LOG =
 * Logger.getLogger(Methods.class); private static ArrayList<String> failList =
 * new ArrayList<String>(); private static ArrayList<String> successList = new
 * ArrayList<String>();
 * 
 * public Methods() { }
 * 
 * public static void fileCreation(String linkInput) { File myObj = new
 * File(linkInput); }
 * 
 * public static void fileCreation2(String linkInput) throws Exception {
 * FileOutputStream myObj2 = new FileOutputStream(linkInput);
 * BufferedOutputStream bout=new BufferedOutputStream(myObj2); byte
 * b[]=s.getBytes(); bout.write(b); bout.write('\n'); bout.flush();
 * bout.close(); myObj2.close(); }
 * 
 * private void addinputList(String inputoList) {
 * inputFilesList.add(inputoList); }
 * 
 * public String getinputList() { return inputFilesList.get(0); }
 * 
 * 
 * private static void addfailList(String inputoList) {
 * failList.add(inputoList); }
 * 
 * public String getfailList() { return failList.get(0); }
 * 
 * private static void addsuccessList(String inputoList) {
 * successList.add(inputoList); }
 * 
 * public String getsuccessListt() { return successList.get(0); }
 * 
 * private static boolean dataValidation(String rawDataLine) { String[] arrOfStr
 * = rawDataLine.split("\\|");
 * 
 * if (arrOfStr.length != 4 || validateJavaDate(arrOfStr[2]) == false ||
 * checkEmpType(arrOfStr[0]) == false) { addfailList(rawDataLine); return false;
 * } addsuccessList(rawDataLine); return true; }
 * 
 * private static boolean checkEmpType(String something) { return
 * (something.equals("1") || something.equals("2") ||
 * something.contentEquals("3")); }
 * 
 * private static boolean validateJavaDate(String strDate) { Check if date is
 * 'null' if (strDate.trim().equals("")) { return true; } Date is not 'null'
 * else {
 * 
 * Set preferred date format, For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.
 * 
 * SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
 * sdfrmt.setLenient(false);
 * 
 * Create Date object parse the string into date
 * 
 * try { Date javaDate = sdfrmt.parse(strDate); // System.out.println(strDate +
 * " is valid date format"); } Date format is invalid catch (ParseException e) {
 * // System.out.println(strDate + " is Invalid Date format"); return false; }
 * Return true if date format is valid return true; } }
 * 
 * private static int calculateDateBetween(String strDate) {
 * validateJavaDate(strDate);
 * 
 * return 0; }
 * 
 * public static void generateEmpClasses(String rawDataLine) throws Exception {
 * String[] arrOfStr = rawDataLine.split("\\|"); int role =
 * Integer.parseInt(arrOfStr[0]);
 * LOG.info(">>>>>> +[startdataValidationN] START"); switch (role) { case 1:
 * Employee employee = new Developer(Integer.parseInt(arrOfStr[0]), arrOfStr[1],
 * arrOfStr[2]); String alpha = employee.getEmpName();
 * 
 * 
 * break; case 2: Employee employee1 = new Tester(Integer.parseInt(arrOfStr[0]),
 * arrOfStr[1], arrOfStr[2]); break; case 3: Employee employee2 = new
 * Manager(Integer.parseInt(arrOfStr[0]), arrOfStr[1], arrOfStr[2]); }
 * LOG.info(">>>>>> +[startdataValidationN] END"); } //public abstract String
 * generateCompleteString();
 * 
 * 
 * }
 */
/*
 * EmployeeIfc m1 = (EmployeeIfc)m;
 * 
 * System.out.println(e.calSalary()); System.out.println(m.calSalary());
 * 
 * //Step2: m.calSalary(); m.connectSalary();
 * 
 * m1.calSalary();
 * 
 * 
 * int total = 0; for (Employee ee: comp) { total +=ee.calSalary(); }
 * 
 * //Step3: //output --
 * 
 * System.out.println(total);
 * 			/*
			 * Create Date object parse the string into date
			 * try {
				Date javaDate = sdfrmt.parse(strDate);
			} catch (ParseException e) {
				return false;
			}
			 */

