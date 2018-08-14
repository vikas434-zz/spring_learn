package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDaoImpl;
import com.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mainapp.xml");
//		EmployeeDaoImpl employeeDaoImpl = (EmployeeDaoImpl) ctx.getBean("eds");
//		Employee emp = new Employee(1, "Vikas", 101);
//		employeeDaoImpl.addEmployee(emp);
		
	}

}
