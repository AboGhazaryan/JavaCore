package homework.homework10.medicalCenter;

import Library.exception.AuthorNotFoundException;
import Library.model.Author;
import homework.homework10.medicalCenter.exception.DoctorNotFoundException;
import homework.homework10.medicalCenter.human.Doctor;
import homework.homework10.medicalCenter.human.Patient;
import homework.homework10.medicalCenter.storage.DoctorStorage;
import homework.homework10.medicalCenter.storage.PatientStorage;
import homework.homework10.medicalCenter.util.FileUtil;


import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {


    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = FileUtil.deseralizeDoctorStorage();
    private static PatientStorage patientStorage = FileUtil.deseralizePatientStorage();

    public static void main(String[] args) {


        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    profession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    System.out.println("Pleas input doctor's ID");
                    doctorStorage.print();
                    String id = scanner.nextLine();
                    doctorStorage.deleteDoctorById(id);
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case ADD_PATIENT:
                    addPatient();
                    FileUtil.serializePatientData(patientStorage);
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printPateintByDoctor();
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.print();
                    break;
                case PRINT_ALL_DOCTOR:
                    doctorStorage.print();
                default:
                    System.out.println("Wrong command! try again!");

            }


        }

    }

    private static void changeDoctorById() {
        System.out.println("Please chose doctor by id");
        doctorStorage.print();
        String id = scanner.nextLine();
        try {
            Doctor doctor = doctorStorage.getByid(id);
            System.out.println("Please input the doctor's name");
            String name = scanner.nextLine();
            System.out.println("Please input the doctor's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input the doctor's phone number");
            String phoneNumber = scanner.nextLine();
            System.out.println("Please input the doctor's email");
            String email = scanner.nextLine();
            System.out.println("Plese input the doctor's profession");
            Profession[] values = Profession.values();
            for (Profession s : values)
                System.out.println(s + "");

            Profession profession = Profession.valueOf(scanner.nextLine().toUpperCase());

            doctor.setName(name);
            doctor.setSurname(surname);
            doctor.setPhoneNumber(phoneNumber);
            doctor.setEmail(email);
            doctor.setProfession(profession);

            System.out.println("Doctor was successfully updated!");


        } catch (DoctorNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void printPateintByDoctor() {
        System.out.println("Please choose Doctor by phone number ");
        doctorStorage.print();
        String phoneNumber = scanner.nextLine();
        Doctor doctor = null;
        try {
            doctor = doctorStorage.getDoctorByPhoneNumber(phoneNumber);
            patientStorage.searchPatientByDoctor(doctor);
        } catch (DoctorNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }



    private static void addPatient() {
        System.out.println("Please choose Doctor by phone number");
        doctorStorage.print();
        String phoneNumber = scanner.nextLine();
        Doctor doctor = null;
        try {

            doctor = doctorStorage.getDoctorByPhoneNumber(phoneNumber);
            System.out.println("Please input the patient's name");
            String name = scanner.nextLine();
            System.out.println("Please input the patient's surname");
            String surName = scanner.nextLine();
            System.out.println("Pleae input the patient's ID");
            String id = scanner.nextLine();
            System.out.println("Please input phone number");
            String phone = scanner.nextLine();



            Patient patient = new Patient();
            patient.setName(name);
            patient.setSurname(surName);
            patient.setId(id);
            patient.setPhoneNumber(phone);
            patient.setRegisterDateTime(new Date());
            patient.setDoctor(doctor);

            patientStorage.add(patient);
            System.out.println("The patient has registered");

        } catch (DoctorNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void profession() {
        System.out.println("Please input the doctor's profession");
        Profession[] values = Profession.values();
        for (Profession value : values) {
            System.out.println(value + "");
        }
        Profession profession = Profession.valueOf(scanner.nextLine().toUpperCase());
        doctorStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("Please input the doctor's name");
        String name = scanner.nextLine();
        System.out.println("Please input the doctor's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input the doctor's ID");
        String id = scanner.nextLine();
        System.out.println("Please input the doctor's phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input the doctor's email");
        String email = scanner.nextLine();
        System.out.println("Plese input the doctor's profession");
        Profession[] values = Profession.values();
        for (Profession s : values)
            System.out.println(s + "");

        Profession profession = Profession.valueOf(scanner.nextLine().toUpperCase());


        Doctor doctor = new Doctor(name, surname, id, phoneNumber, email, profession);
        doctorStorage.add(doctor);
        System.out.println("Doctor added successfully!");
    }


}
