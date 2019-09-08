package in.co.javacoder.springjdbc.empolyee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.co.javacoder.springjdbc.empolyee.dao.EmployeeDAO;
import in.co.javacoder.springjdbc.empolyee.dao.rowmapper.EmployeeRowMapper;
import in.co.javacoder.springjdbc.empolyee.dto.Employee;

@Component("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into Employee values(?, ?, ?)";
		return jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
	}

	@Override
	public int update(Employee employee) {
		String sql = "update Employee set firstname = ?, lastname = ? where id = ?";
		return jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from Employee where id = ?";
		return jdbcTemplate.update(sql, id);
	}
	
	@Override
	public Employee read(int id) {
		String sql = "select * from Employee where id = ?";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		return jdbcTemplate.queryForObject(sql, employeeRowMapper, id);
	}
	
	@Override
	public List<Employee> readAll() {
		String sql = "select * from Employee";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		return jdbcTemplate.query(sql, employeeRowMapper);
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	

}
