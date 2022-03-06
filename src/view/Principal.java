package view;

import controller.ProcessosController;
																								
public class Principal {

	public static void main(String[] args) {
		ProcessosController procController = new ProcessosController();
		//String os= procController.os();
		//System.out.println(os);
		//String process = "c:\\Windows\\write.exe";
		//procController.callProcess(process);
		String process = "TASKLIST /FO TABLE";
		//]String process = "ipconfig";
		procController.readProcess(process);
		//String param ="cmd.exe";
		//procController.killProcess(param);
		
	}

}
