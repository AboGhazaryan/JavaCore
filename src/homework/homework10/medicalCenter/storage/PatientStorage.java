package homework.homework10.medicalCenter.storage;


import homework.homework10.medicalCenter.human.Doctor;
import homework.homework10.medicalCenter.human.Patient;

import java.io.Serializable;

public class PatientStorage implements Serializable {
    private Patient[] patients = new Patient[10];
    private int size = 0;

    public void add(Patient patient) {
        if (size == patients.length) {
            exdent();
        }
        patients[size++] = patient;
    }

    private void exdent() {
        Patient[] temp = new Patient[size + 10];
        System.arraycopy(patients, 0, temp, 0, size);
        patients = temp;
    }

    public void searchPatientByDoctor(Doctor doctor ) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctor) ) {
                System.out.println(patients[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is no patient with that ");
        }
    }



    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }

    }
}
