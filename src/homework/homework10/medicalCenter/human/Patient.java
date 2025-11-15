package homework.homework10.medicalCenter.human;


import homework.homework10.medicalCenter.util.DateUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Patient extends Person implements Serializable {

    private Doctor doctor;
    private Date registerDateTime;

    public Patient(String name, String surname, String id, String phoneNumber, Doctor doctor, Date registerDateTime) {
        super(name, surname, id, phoneNumber);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Patient(Doctor doctor, Date registerDateTime) {
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Patient() {

    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Patient patient)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(doctor, patient.doctor) && Objects.equals(registerDateTime, patient.registerDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor, registerDateTime);
    }

    @Override
    public String toString() {
        return "Patient{" +
                super.toString()+
                "doctor=" + doctor +
                ", registerDateTime=" + DateUtil.fromDateToStr(registerDateTime) +
                '}';
    }
}
