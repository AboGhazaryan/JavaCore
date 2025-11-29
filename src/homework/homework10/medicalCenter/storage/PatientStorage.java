package homework.homework10.medicalCenter.storage;


import homework.homework10.medicalCenter.model.Doctor;
import homework.homework10.medicalCenter.model.Patient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PatientStorage implements Serializable {
    private List<Patient> patients = new ArrayList<>();

    public void add(Patient patient) {
        patients.add(patient);
    }



    public void searchPatientByDoctor(Doctor doctor ) {
        boolean found = false;
        for (Patient patient : patients) {
            if (patient.getDoctor().equals(doctor)) {
                System.out.println(patient);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is no patient with that ");
        }
    }



    public void print() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }

    }
}
