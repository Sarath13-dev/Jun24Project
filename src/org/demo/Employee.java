package org.demo;

public class Employee {
	
	private String empName;
	
	private int empSalary;
	
	private int empAge;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public Employee(String empName, int empSalary, int empAge) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAge = empAge;
	}
	
	
	
	
}