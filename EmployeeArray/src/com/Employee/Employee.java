package com.Employee;

public class Employee {
    private String empname;
    private int empid;
    private int empsalary;
    private String designation;
    public Employee(String name, int id, int salary, String designation){
        this.empname = name;
        this.empsalary = salary;
        this.empid = id;
        this.designation = designation;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(int empsalary) {
        this.empsalary = empsalary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
