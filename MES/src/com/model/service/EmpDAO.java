package com.model.service;
import java.util.ArrayList;
import java.util.List;

import com.model.emp.Employee;


public class EmpDAO 
{
	private List<Employee> employees=new ArrayList<Employee>();
	
	public boolean createProfile(Employee e) {
		employees.add(e);
		return true;
	}
	
	public boolean updateEmail(int id,String email ) {
		//code to write
		for(int i=0;i<employees.size();i++) {
			Employee e=employees.get(i);
			if(e.equals(id)) {
				e.setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	public List<Employee> getEmployee() {
		return employees;
	}
	
	public boolean deleteEmp(int id) {
		for(int i=0;i<employees.size();i++) {
			Employee e=employees.get(i);
			if(e.equal(id)) {
				employees.remove(e);
				return true;
			}
		}
		//code to write
		return false;
	}
}
