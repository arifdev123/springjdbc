package in.co.javacoder.springjdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.co.javacoder.springjdbc.empolyee.dao.EmployeeDAO;
import in.co.javacoder.springjdbc.empolyee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springjdbc/test/springconfig.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDao");
		//System.out.println("Number Of Rows inserted: " +employeeDAO.create((Employee)context.getBean("emp1")));
		//System.out.println("Number Of Rows inserted: " +employeeDAO.create((Employee)context.getBean("emp2")));
		//System.out.println("Number Of Rows updated: " +employeeDAO.update((Employee)context.getBean("emp2")));
		///System.out.println("Number Of Rows deleted : " +employeeDAO.delete(1));
		//System.out.println("Number Of Rows selected : " +employeeDAO.read(1));
		System.out.println("Number Of Rows selected : " +employeeDAO.readAll());
	}

}
