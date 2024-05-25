package com.example.restservice;

public class Employee {
    public Employee() {}

    public Employee(
        Integer employee_id, String first_name,
        String last_name, String email, String title)
    {
        super();

        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }

    private Integer employee_id;

    private String first_name;

    private String last_name;

    private String email;

    private String title;

    public Integer getEmployee_id()
    {
        return employee_id;
    }

    public String getFirst_name()
    {
        return first_name;
    }
    public String getLast_name()
    {
        return last_name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getTitle()
    {
        return title;
    }
    public void setId(Integer id) {
        this.employee_id = id;
    }
}
