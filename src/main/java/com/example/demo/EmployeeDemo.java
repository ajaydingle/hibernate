package com.example.demo;

import com.example.dao.EmployeeDao;
import com.example.entities.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {

		EmployeeDao empDao = new EmployeeDao();

		//Insert
		Employee emp = new Employee("Ajay", "32", "11-Jun-1989", "M", "Pune", "ajayingle777@gmail.com");
		//Employee emp = new Employee("Susweta", "34", "01-Jan-1987", "F", "Banglore", "suswetasarkar@gmail.com");
		empDao.saveEmployee(emp);
		System.out.println("Employee " + emp.getName() + " saved successfully."); 
		
		//Select
		/*List<Employee> employeeList = empDao.getAllEmployees();
		  employeeList.forEach(e -> System.out.println(e.toString())); */
		
		//update
		/* Employee empToUpdate = empDao.getEmployeeById(1);
		empToUpdate.setName("Ajay Ingle");
		empDao.updateEmployee(empToUpdate);
		
		System.out.println("Employee " + empToUpdate.getName() + " updated successfully."); */
		
		//delete
		/* Employee empToDelete = empDao.getEmployeeById(1);
		empDao.deleteEmployee(empToDelete);
		
		System.out.println("Employee " + empToDelete.getName() + " deleted successfully."); */
		
	}
}

