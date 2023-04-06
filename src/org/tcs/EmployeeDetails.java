package org.tcs;
//method overloading
public class EmployeeDetails {
public void empId() {
	System.out.println("Emp id:   123456");
}
	public void empName() {
		System.out.println("EmpName : Ram");
	}
	public static void main (String[] args) {
			EmployeeDetails e = new EmployeeDetails();
			e.empId();
			e.empName();
		}
	}


