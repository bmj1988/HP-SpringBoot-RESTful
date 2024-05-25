package com.example.restservice;

import org.springframework
    .stereotype
    .Repository;

import com.example.restservice.Employees;

@Repository

public class EmployeeManager {
    private static Employees list
    = new Employees();

    static {
        list.getEmployeeList().add(
            new Employee(
                1,
                "Brian",
                "Johnson",
                "bjo@gmail.com",
                "Developer"
            )
        );

        list.getEmployeeList().add(
            new Employee(
                2,
                "James",
                "Buchanan",
                "jbuch@gmail.com",
                "President"
            )
        );

        list.getEmployeeList().add(
            new Employee(
                3,
                "Sally",
                "Archer",
                "sarch@gmail.com",
                "Engineer"
            )
        );
    }

    public Employees getAllEmployees()
    {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList()
        .add(employee);
    }

}
