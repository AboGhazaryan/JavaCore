package homework.homework10.medicalCenter.storage;

import homework.homework10.medicalCenter.Profession;
import homework.homework10.medicalCenter.exception.DoctorNotFoundException;
import homework.homework10.medicalCenter.model.Doctor;


import java.io.Serializable;


public class DoctorStorage implements Serializable {
    private Doctor[] doctors = new Doctor[10];
    private int size = 0;

    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    private void extend() {
        Doctor[] temp = new Doctor[size + 10];
        System.arraycopy(doctors, 0, temp, 0, size);
        doctors = temp;
    }

    public void searchDoctorByProfession(Profession profession) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession() == profession) {
                System.out.println(doctors[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is " + profession + " no such profession");
        }
    }

    public void deleteDoctorById(String id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("There is no doctor with this ID");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            doctors[i] = doctors[i + 1];
        }
        doctors[size - 1] = null;
        size --;

        System.out.println("Doctor's has been successfully deleted!");
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }
    public Doctor getByid(String id) throws DoctorNotFoundException{
        for (int i = 0; i < size; i++) {
            if(doctors[i].getId().equals(id)){
                return doctors[i];
            }
        }
        throw new DoctorNotFoundException("Doctor with " + id + " does not exists!");
    }

    public Doctor getDoctorByPhoneNumber(String phoneNumber) throws DoctorNotFoundException {
        for (int i = 0; i < size ; i++) {
            if (doctors[i].getPhoneNumber().equals(phoneNumber)){
                return doctors[i];
            }
        }
        throw new DoctorNotFoundException("There is no doctor with this phonenumber " + phoneNumber);
    }



}
