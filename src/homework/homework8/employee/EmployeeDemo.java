package homework.homework8.employee;


import homework.homework8.employee.exception.EmployeeNotFoundException;

import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_EMPLOYEE_ID:
                    System.out.println("Please input Employee ID");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchEmployeeById(keyword);
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    System.out.println("Please input company name");
                    String company = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompanyName(company);
                    break;
                case SEARCH_EMPLOYES_BY_POSITION_LEVEL:
                    positionLevel();
                    break;
                default:
                    System.out.println("Wrong command! try again!");
            }


        }

    }

    private static void positionLevel() {
        System.out.println("Please input Employee position level");
        PositionLevel [] values = PositionLevel.values();
        for(PositionLevel value : values)
            System.out.println(value + " ");
        try{
            PositionLevel level = PositionLevel.valueOf(scanner.nextLine().toUpperCase());
            employeeStorage.searchByPositionLevel(level);
        }catch (IllegalArgumentException e ) {
            System.out.println("invalid position level. please try again.");
        }catch (EmployeeNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    private static void addEmployee() {
        System.out.println("Please input employee's name: ");
        String name = scanner.nextLine();
        System.out.println("Please input employee's surname:");
        String surname = scanner.nextLine();
        System.out.println("Please input employee's company:");
        String company = scanner.nextLine();
        System.out.println("Please input employee's position:");
        String position = scanner.nextLine();
        System.out.println("Please input employee's salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input employee's ID");
        String employeeID = scanner.nextLine();
        System.out.println("Please input position level");
        PositionLevel [] values = PositionLevel.values();
        for(PositionLevel value : values)
            System.out.println(value + " ");
        PositionLevel positionLevel = PositionLevel.valueOf(scanner.nextLine().toUpperCase());


        Employee employee = new Employee(name, surname, company, position, salary, employeeID, positionLevel);
        employeeStorage.add(employee);
        System.out.println("Employee added successfully!");

    }
}