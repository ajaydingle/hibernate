package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.example.entities.Employee;

public class EmployeeDao {

	private static SessionFactory sessionFactory;
	
	public EmployeeDao() {

		
		  Configuration configuration = new Configuration(); configuration.configure();
		  
		  ServiceRegistry sericeRegistry = new
		  ServiceRegistryBuilder().applySettings(configuration.getProperties()).
		  buildServiceRegistry();
		  
		  sessionFactory = configuration.buildSessionFactory(sericeRegistry);
		
		/*
		 * try { sessionFactory = new Configuration().configure().buildSessionFactory();
		 * } catch (Throwable ex) {
		 * System.err.println("Failed to create sessionFactory object." + ex); throw new
		 * ExceptionInInitializerError(ex); }
		 */
		
	}
	
	public void saveEmployee(Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		session.save(emp);
		tx.commit();
	}
	
	public List<Employee> getAllEmployees(){
		
		List<Employee> employeeList = null;
		
		//create session object from SessionFactory
		Session session = sessionFactory.getCurrentSession();
		
		//begin the transaction
		Transaction tx = session.beginTransaction();
		
		//This will get all the employee records from Employee table and store it into list.
		employeeList = session.createQuery("FROM Employee").list();
		
		tx.commit();
		return employeeList;
	}
	
	public Employee getEmployeeById(int id) {

		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		Employee employee = (Employee) session.get(Employee.class, id);

		tx.commit();

		return employee;
	}
	
	public void updateEmployee(Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		session.update(emp);

		tx.commit();
	}
	
	public void deleteEmployee(Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		session.delete(emp);

		tx.commit();
	}
}
