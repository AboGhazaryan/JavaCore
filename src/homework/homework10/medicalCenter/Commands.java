package homework.homework10.medicalCenter;




public interface Commands {

    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";



    String LOGOUT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PRINT_ALL_PATIENTS = "7";
    String PRINT_ALL_DOCTOR = "8";
    String PRINT_ALL_USER = "9";
    String REMOVE_USER_BY_EMAIL = "10";

    String ADD_PATIENT_USER = "3";
    String PRINT_ALL_PATIENTS_BY_DOCTOR_USER = "4";
    String PRINT_ALL_PATIENTS_USER = "5";
    String PRINT_ALL_DOCTOR_USER = "6";



    static void printCommands(){
     System.out.println("Please input " + EXIT + " for exit");
     System.out.println("Please input " + LOGIN + " for login");
     System.out.println("Please input " + REGISTER + " for register");

 }
 static void printAdminCommands(){
     System.out.println("Please input " + LOGOUT + " for logout");
     System.out.println("Please input " + ADD_DOCTOR + " for add doctor");
     System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for search doctor by profession");
     System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for delete doctor by ID");
     System.out.println("Please input " + CHANGE_DOCTOR_BY_ID + " for change doctor by ID");
     System.out.println("Please input " + ADD_PATIENT + " for add patient");
     System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for print all patients by doctor");
     System.out.println("Please input " + PRINT_ALL_PATIENTS + " for print all patients");
     System.out.println("Please input " + PRINT_ALL_DOCTOR + " for print all doctor");
     System.out.println("Please input " + PRINT_ALL_USER + " for print all user's");
     System.out.println("Please input " + REMOVE_USER_BY_EMAIL + " remove user by email");
 }

 static void printUserCommands(){
     System.out.println("Please input " + LOGOUT + " for logout");
     System.out.println("Please input " + ADD_DOCTOR + " for add doctor");
     System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for search doctor by profession");
     System.out.println("Please input " + ADD_PATIENT_USER + " for add patient");
     System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR_USER + " for print all patients by doctor");
     System.out.println("Please input " + PRINT_ALL_PATIENTS_USER + " for print all patients");
     System.out.println("Please input " + PRINT_ALL_DOCTOR_USER + " for print all doctor");

 }
}
