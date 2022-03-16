package com.nse.hrms;

public class HrmsPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeData data1= new EmployeeData();
		EmployeeData data2= new EmployeeData();
		EmployeeData data3= new EmployeeData();
		
		
		data1.employeeName ="Jack";
		data1.employeeNo =1001;
		data1.employeeSalary=4500;
		
		data2.employeeName ="Peter";
		data2.employeeNo =1002;
		data2.employeeSalary=5000;
		
		data3.employeeName ="Mark";
		data3.employeeNo =1003;
		data3.employeeSalary=9000;
		
		
		EmployeeData.printEmployeeData(data1);
		EmployeeData.printEmployeeData(data2);
		EmployeeData.printEmployeeData(data3);


	}

}
