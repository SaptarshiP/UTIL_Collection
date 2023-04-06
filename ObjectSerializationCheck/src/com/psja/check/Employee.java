package com.psja.check;

import java.io.Serializable;

/*
 *This class is created, so that it's object can be stored
 *in the file in a serialized format and it can be de-serialized when need
 *@author Saptarshi Pramanick
 */
public class Employee  implements Serializable {

	private String empId;
	private String empName;
	private String empAddress;
	
	Employee( String empId, String empName, String empAddress ){
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	/*
	 *This method is used to retrieve employee id
	 *@return String format of the employee Id 
	 */
	public String getEmpId() {
		return this.getEmpId();
	}
	
	/*
	 *This method is used to retrieve employee name
	 *@return String format of employee name
	 */
	public String getEmpName() {
		return this.empName;
	}
	
	/*
	 *This method is used to retrieve employee address
	 *@return String format of employee address 
	 */
	public String getEmpAddress() {
		return this.empAddress;
	}
	
	/*
	 *The toString is overriden method of object class
	 *where instead of displaying the object name and Hashcode( memory location of object)
	 *we are displaying the object data in format by overriding the method 
	 */
	@Override
	public String toString() {
		return this.empId+" "+this.empName+" "+this.empAddress;
	}
}
