package homework.homework8.employee;

import homework.homework8.employee.exception.EmployeeNotFoundException;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] temp = new Employee[size + 10];
        System.arraycopy(employees, 0, temp, 0, size);

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void searchEmployeeById(String ID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmplyeeID().equals(ID)) {
                System.out.println(employees[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("There is no employee with this ID. ");
        }
    }


    public void searchEmployeeByCompanyName(String companyName) {

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equals(companyName)) {
                System.out.println(employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is no company " + companyName + " by that name. ");
        }


    }

    public void searchByPositionLevel(PositionLevel positionLevel) throws EmployeeNotFoundException {

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getPositionLevel() == positionLevel) {
                System.out.println(employees[i]);
                found = true;
            }
        }
        if(!found) {
            throw  new EmployeeNotFoundException("There is no " + positionLevel + " level position.");
        }

    }
}
