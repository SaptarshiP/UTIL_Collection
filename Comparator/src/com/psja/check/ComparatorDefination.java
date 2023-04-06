package com.psja.check;

import java.util.Comparator;

public class ComparatorDefination implements Comparator<Employee> {
	
	@Override
	public int compare( Employee emp1, Employee emp2 ) {
		
		Integer data = 0;
		if ( emp1.getEmpSalary() == emp2.getEmpSalary() )
			data = 0;
		else if ( emp1.getEmpSalary() < emp2.getEmpSalary() )
			data = -1;
		else if ( emp1.getEmpSalary() > emp2.getEmpSalary() )
			data = 1;
		return data;
	}

}
