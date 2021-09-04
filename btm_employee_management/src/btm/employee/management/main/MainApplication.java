package btm.employee.management.main;

import org.apache.log4j.Logger;

import btm.employee.management.methods.Methods;

public class MainApplication {

	private static Logger LOG = Logger.getLogger(MainApplication.class);

	public static void main(String[] args) throws Exception {

		LOG.info(">>>> +[run] START Main Method <<<<");

		String fileInput = "C:\\Users\\Khoa S Tran\\Desktop\\Inbound.txt";
		String outputFail = "C:\\Users\\Khoa S Tran\\Desktop\\OutboundFail.txt";
		String outputSuccess = "C:\\Users\\Khoa S Tran\\Desktop\\OutboundSuccess.txt";
		LOG.info(">>>> +[run] START the Main application <<<<");
		Methods.readAndsortFile(fileInput);
		Methods.testClassGenerators();
		Methods.exportFails(outputFail);
		Methods.exportSuccess(outputSuccess);
		LOG.info(">>>> +[run] End Main application <<<<");
		
	}

}
