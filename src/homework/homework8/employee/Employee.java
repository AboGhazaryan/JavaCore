package homework.homework8.employee;

import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String company;
    private String position;
    private Double salary;
    private String employeeID;

    public Employee(String name, String surname, String position, String company, Double salary, String emplyeeID) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.company = company;
        this.salary = salary;
        this.employeeID = emplyeeID;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmplyeeID() {
        return employeeID;
    }

    public void setEmplyeeID(String emplyeeID) {
        this.employeeID = emplyeeID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position) && Objects.equals(salary, employee.salary) && Objects.equals(employeeID, employee.employeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company, position, salary, employeeID);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", company ='" + company + '\'' +
                ", position ='" + position + '\'' +
                ", salary =" + salary +
                ", emplyee ID:'" + employeeID + '\'' +
                '}';
    }
}
