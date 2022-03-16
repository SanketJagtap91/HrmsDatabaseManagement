package com.nse.hrms;

public class EmployeeData {
	public int employeeNo;
	public String employeeName;
	public int employeeSalary;
	public static String companyName = "NSEIT,Mumbai";
	
		
	
	public static void printEmployeeData(EmployeeData data)
	
		{
				
				System.out.println("Employee No     :"+data.employeeNo);
				System.out.println("Employee Name   :"+data.employeeName);
				System.out.println("Employee Salary :"+data.employeeSalary);
				System.out.println("Company NAme    :"+EmployeeData.companyName);
				System.out.println("\n");

				
		}

}
