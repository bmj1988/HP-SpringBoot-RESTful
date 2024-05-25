package com.example.restservice;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.restservice.Employee;
import com.example.restservice.Employees;
import com.example.restservice.EmployeeManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@SpringBootTest
public class RestServiceApplicationTests {

    @Mock
	private EmployeeManager employeeManager;

	int getEmployeeCount(EmployeeManager manager)
	{
		return manager.getAllEmployees().getEmployeeList().size();
	}

	@Test
	void createEmployeeManager() {
		EmployeeManager newEmployeeManager = new EmployeeManager();
		assert(getEmployeeCount(newEmployeeManager) != 0);
	}

	@Test
	void addEmployee() {
		EmployeeManager employeeManager = new EmployeeManager();
		int employeeCount = getEmployeeCount(employeeManager);
		Employee employee = new Employee(4, "Daria", "Jones", "dariajones@gmail.com", "Software developer");
		employeeManager.addEmployee(employee);
		assert(employeeCount + 1 == getEmployeeCount(employeeManager));
	}

	@ExtendWith(MockitoExtension.class)
    @BeforeEach void setUp()
    {
		this.employeeManager = new EmployeeManager();
		Employee newEmployee = new Employee(4, "Daria", "Jones", "dariajones@gmail.com", "Software developer");
		this.employeeManager.addEmployee(newEmployee);
    }

	@Test
	void employeeIdInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getEmployee_id() == 4)
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeFirstNameInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getFirst_name() == "Daria")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeLastNameInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getLast_name() == "Jones")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeEmailInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getEmail() == "dariajones@gmail.com")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeTitleInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getTitle() == "Software developer")
			{
				return;
			}
		}
		assert(false);
	}
}
