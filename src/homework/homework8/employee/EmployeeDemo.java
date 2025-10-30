package homework.homework8.employee;


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
                default:
                    System.out.println("Wrong command! try again!");
            }


        }

    }

    private static void addEmployee() {
        System.out.println("Please input employee's name: ");
        String name = scanner.nextLine();
        System.out.println("Please input employee's surname:");
        String surname = scanner.nextLine();
        System.out.println("Please input employee's position:");
        String position = scanner.nextLine();
        System.out.println("Please input employee's company:");
        String company = scanner.nextLine();
        System.out.println("Please input employee's salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input employee's ID");
        String employeeID = scanner.nextLine();


        Employee employee = new Employee(name, surname, position, company, salary, employeeID);
        employeeStorage.add(employee);
        System.out.println("Employee added successfully!");

    }
}