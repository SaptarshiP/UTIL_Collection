package com.psja.check;

import java.io.Serializable;

public class Employee implements Serializable{

	private String empId;
	private String empName;
	private String empAddress;
	
	Employee( String empId, String empName, String empAddress ){
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	public String getEmpId() {
		return this.empId;
	}
	public String getEmpName() {
		return this.empName;
	}
	public String getEmpAddress() {
		return this.empAddress;
	}
	
	@Override
	public String toString() {
		return this.empId + " , " + this.empName + " , " + this.empAddress;
	}
}
