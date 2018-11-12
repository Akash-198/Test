package com.model.application;
import java.util.List;
import java.util.Scanner;

import com.model.service.EmpService;
import com.model.emp.Employee;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String option = "";
		
		EmpService service = new EmpService();
		while(true) {
			System.out.println("1- Create\n2- Update Email\n"
					+ "3- Get Employees\n4- Delete Employees"
					+ "\n5-exit");
			option = in.nextLine();

			switch (option) {
			case "1":
				Employee e = new Employee();
				System.out.println("id:");
				e.setId(Integer.parseInt(in.nextLine()));
				System.out.println("name:");
				e.setName(in.nextLine());
				System.out.println("sal:");
				e.setSalary(Double.parseDouble(in.nextLine()));
				System.out.println("email:");
				e.setEmail(in.nextLine());
				
				boolean res = service.createProfileService(e);
				if(res) {
					System.out.println("Profile Created");
				}else {
					System.out.println("Profile Creation failed");
				}
				break;
			case "2":System.out.println("enter the id ");
						int id=Integer.parseInt(in.nextLine());
						System.out.println("enter the email");
						String email=in.nextLine();
				boolean re=service.updateEmailService(id, email);
				if(re) {
					System.out.println("email updated");
				}else {
					System.out.println("updation failed");
				}

				break;
			case "3":
				List<Employee> emps = service.getEmployeeService();
				for(Employee emp: emps) {
					System.out.println(emp);
				}
				break;
			case "4":System.out.println("enter the id");
			int ids=Integer.parseInt(in.nextLine());
			boolean resd=service.deleteEmpService(ids);
			if(resd) {
				System.out.println("deleted");
			}else {
				System.out.println("deletion failed");
			}

				break;

			case "5":
				System.out.println("exiting");
				break;
			}//end of switch
			if(option.equals("5")) {
				break;
			}
		} // end of while
	}// end of main
}//end of class