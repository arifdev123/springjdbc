package in.co.javacoder.springjdbc.empolyee.dao;

import java.util.List;

import in.co.javacoder.springjdbc.empolyee.dto.Employee;

public interface EmployeeDAO {
	int create(Employee employee);
	int update(Employee employee);
	int delete(int id);
	Employee read(int id);
	List<Employee> readAll();
}
