package com.org;

public class Manager extends Employee{
	
	int managerid;
	public Manager(int employeeid, String employeename, String employeedesignation, int managerid) {
		super (employeeid,employeename,employeedesignation);
		this.managerid = managerid;
		
	}
	@Override
	public String toString() {
		return "Manager [managerid= " + managerid + " , employeeid= " + employeeid + ", employeename =" + employeename + " , "
				+ " , employeedesigntion =" + employeedesignation + "]";
	}
	

}
