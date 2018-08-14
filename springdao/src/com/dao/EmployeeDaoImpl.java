package com.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import com.entity.Employee;

public class EmployeeDaoImpl extends SimpleJdbcDaoSupport implements EmployeeDao {
	
	private String sql = "INSERT INTO employee (ID, NAME, SALARY) "
			+ "VALUES (:empId, :empName, :empSalary)";
	
	@Override
	public void addEmployee(Employee e) {
		BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(e);
		getSimpleJdbcTemplate().update(sql, beanPropertySqlParameterSource);
 	}

}
