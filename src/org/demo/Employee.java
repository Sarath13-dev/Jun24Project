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
	
	private void empId() {
		System.out.println("Emp Id is 12345");
		System.out.println("Work Done by Dev Branch Employee");
	}

	private void empName() {
		System.out.println("Employee name is Ravi");
		System.out.println("Work Carried by QA");
	}
	
	

	
	
}