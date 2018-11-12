package com.model.service;
import java.util.List;

import com.model.emp.Employee;



public class EmpService {
		
	private EmpDAO db = new EmpDAO();
	
	public boolean createProfileService(Employee e) {
		return db.createProfile(e);
	}
	
	public boolean updateEmailService(int id,String email) {
		return db.updateEmail(id, email);
	}
	
	public List<Employee> getEmployeeService() {
		return db.getEmployee();
	}
	
	public boolean deleteEmpService(int id) {
		return db.deleteEmp(id);
	}
	
}