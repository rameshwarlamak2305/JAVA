package com.spring.SpringOrm.dao;

import java.util.List;

import com.spring.SpringOrm.model.Employee;

public interface EmployeeService {
//	01. Insert Record
	public void addRecord(Employee emp);

//	02. Update Record
	public Employee updateRecord(Employee emp);

//	03. Delete Record
	public int deleteRecord(int id);

//	04. Search By ID
	public int searchByID(int id);

//	05. Search By Name
	public String searchByName(String name);

//	06. Showing All Employee
	public List<Employee> showAllRecord();

//	07. Delete All Record
	public void deleteAll();

//	08. Generate Bulk Employees
	public void generateBulkEmployee();
}



