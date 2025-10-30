package homework.homework8.employee;

public interface Commands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEE = "2";
    String SEARCH_EMPLOYEE_BY_EMPLOYEE_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "4";


    static void printCommands (){
        System.out.println("Please input " + EXIT + "for exit:" );
        System.out.println("Please input " + ADD_EMPLOYEE + "for add eployee:" );
        System.out.println("Please input " + PRINT_ALL_EMPLOYEE + "for print all employee:" );
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_EMPLOYEE_ID + "for search employee by employe ID:" );
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY_NAME + "for search employee by company name:" );
    }
}

